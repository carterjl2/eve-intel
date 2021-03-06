package com.thundermoose.eveintel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.thundermoose.eveintel.exceptions.MissingDataException;
import com.thundermoose.eveintel.model.Region;
import com.thundermoose.eveintel.model.SolarSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EveStaticData {
  private static final Logger log = LoggerFactory.getLogger(EveStaticData.class);

  private Map<Long, String> invTypes;
  private Map<Long, Map<String, String>> solarSystemData;

  public EveStaticData() {
    init();
  }

  private void init() {
    try {
      log.debug("Static content load: starting");
      invTypes = new ObjectMapper().readValue(Resources.getResource("type_data.json").openStream(),
          new TypeReference<HashMap<Long, String>>() {
          });
      solarSystemData = new ObjectMapper().readValue(Resources.getResource("solar_system_data.json").openStream(),
          new TypeReference<HashMap<Long, HashMap<String, String>>>() {
          });
      log.debug("Static content load: complete");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public String getItemName(Long id) {
    if (invTypes.containsKey(id)) {
      return invTypes.get(id);
    } else {
      throw new MissingDataException("Could not find [" + id + "] in exported static data.");
    }
  }

  public SolarSystem getSolarSystem(Long id) {
    Map<String, String> data = solarSystemData.get(id);
    Region r = Region.builder()
        .id(Long.parseLong(data.get("regionId")))
        .name(data.get("regionName"))
        .build();

    return SolarSystem.builder()
        .id(id)
        .name(data.get("name"))
        .region(r)
        .build();

  }
}
