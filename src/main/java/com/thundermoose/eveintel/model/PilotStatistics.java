package com.thundermoose.eveintel.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@JsonDeserialize(builder = PilotStatistics.Builder.class)
public class PilotStatistics implements Serializable {
  private Pilot pilot;
  private Integer killCount;
  private Flags flags;
  private List<WeightedData<Region>> regions = new ArrayList<>();
  private Region tendencyRegion;
  private Region recentRegion;
  private List<WeightedData<Alliance>> killedAlliances = new ArrayList<>();
  private Alliance tendencyKilledAlliance;
  private Alliance recentKilledAlliance;
  private List<WeightedData<Alliance>> assistedAlliances = new ArrayList<>();
  private Alliance tendencyAssistedAlliance;
  private Alliance recentAssistedAlliance;
  private List<WeightedData<ShipType>> usedShips = new ArrayList<>();
  private ShipType tendencyUsedShip;
  private ShipType recentUsedShip;
  private List<WeightedData<ShipType>> killedShips = new ArrayList<>();
  private ShipType tendencyKilledShip;
  private ShipType recentKilledShip;
  private Integer averageFleetSize;
  private TimeGraph killsPerDay;
  private BarGraph killsPerHour;

  private PilotStatistics(Builder builder) {
    pilot = builder.pilot;
    killCount = builder.killCount;
    flags = builder.flags;
    regions = builder.regions;
    tendencyRegion = builder.tendencyRegion;
    recentRegion = builder.recentRegion;
    killedAlliances = builder.killedAlliances;
    tendencyKilledAlliance = builder.tendencyKilledAlliance;
    recentKilledAlliance = builder.recentKilledAlliance;
    assistedAlliances = builder.assistedAlliances;
    tendencyAssistedAlliance = builder.tendencyAssistedAlliance;
    recentAssistedAlliance = builder.recentAssistedAlliance;
    usedShips = builder.usedShips;
    tendencyUsedShip = builder.tendencyUsedShip;
    recentUsedShip = builder.recentUsedShip;
    killedShips = builder.killedShips;
    tendencyKilledShip = builder.tendencyKilledShip;
    recentKilledShip = builder.recentKilledShip;
    averageFleetSize = builder.averageFleetSize;
    killsPerDay = builder.killsPerDay;
    killsPerHour = builder.killsPerHour;
  }

  public static Builder builder() {
    return new Builder();
  }

  public Pilot getPilot() {
    return pilot;
  }

  public Integer getKillCount() {
    return killCount;
  }

  public Flags getFlags() {
    return flags;
  }

  public List<WeightedData<Region>> getRegions() {
    return regions;
  }

  public Region getTendencyRegion() {
    return tendencyRegion;
  }

  public Region getRecentRegion() {
    return recentRegion;
  }

  public List<WeightedData<Alliance>> getKilledAlliances() {
    return killedAlliances;
  }

  public Alliance getTendencyKilledAlliance() {
    return tendencyKilledAlliance;
  }

  public Alliance getRecentKilledAlliance() {
    return recentKilledAlliance;
  }

  public List<WeightedData<Alliance>> getAssistedAlliances() {
    return assistedAlliances;
  }

  public Alliance getTendencyAssistedAlliance() {
    return tendencyAssistedAlliance;
  }

  public Alliance getRecentAssistedAlliance() {
    return recentAssistedAlliance;
  }

  public List<WeightedData<ShipType>> getUsedShips() {
    return usedShips;
  }

  public ShipType getTendencyUsedShip() {
    return tendencyUsedShip;
  }

  public ShipType getRecentUsedShip() {
    return recentUsedShip;
  }

  public List<WeightedData<ShipType>> getKilledShips() {
    return killedShips;
  }

  public ShipType getTendencyKilledShip() {
    return tendencyKilledShip;
  }

  public ShipType getRecentKilledShip() {
    return recentKilledShip;
  }

  public Integer getAverageFleetSize() {
    return averageFleetSize;
  }

  public TimeGraph getKillsPerDay() {
    return killsPerDay;
  }

  public BarGraph getKillsPerHour() {
    return killsPerHour;
  }

  @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
  public static final class Builder {
    private Pilot pilot;
    private Integer killCount;
    private Flags flags;
    private List<WeightedData<Region>> regions = newArrayList();
    private Region tendencyRegion;
    private Region recentRegion;
    private List<WeightedData<Alliance>> killedAlliances = newArrayList();
    private Alliance tendencyKilledAlliance;
    private Alliance recentKilledAlliance;
    private List<WeightedData<Alliance>> assistedAlliances = newArrayList();
    private Alliance tendencyAssistedAlliance;
    private Alliance recentAssistedAlliance;
    private List<WeightedData<ShipType>> usedShips = newArrayList();
    private ShipType tendencyUsedShip;
    private ShipType recentUsedShip;
    private List<WeightedData<ShipType>> killedShips = newArrayList();
    private ShipType tendencyKilledShip;
    private ShipType recentKilledShip;
    private Integer averageFleetSize;
    private TimeGraph killsPerDay;
    private BarGraph killsPerHour;

    private Builder() {
    }

    public Builder pilot(Pilot pilot) {
      this.pilot = pilot;
      return this;
    }

    public Builder killCount(Integer killCount) {
      this.killCount = killCount;
      return this;
    }

    public Builder flags(Flags flags) {
      this.flags = flags;
      return this;
    }

    public Builder regions(List<WeightedData<Region>> regions) {
      this.regions = regions;
      return this;
    }

    public Builder tendencyRegion(Region tendencyRegion) {
      this.tendencyRegion = tendencyRegion;
      return this;
    }

    public Builder recentRegion(Region recentRegion) {
      this.recentRegion = recentRegion;
      return this;
    }

    public Builder killedAlliances(List<WeightedData<Alliance>> killedAlliances) {
      this.killedAlliances = killedAlliances;
      return this;
    }

    public Builder tendencyKilledAlliance(Alliance tendencyKilledAlliance) {
      this.tendencyKilledAlliance = tendencyKilledAlliance;
      return this;
    }

    public Builder recentKilledAlliance(Alliance recentKilledAlliance) {
      this.recentKilledAlliance = recentKilledAlliance;
      return this;
    }

    public Builder assistedAlliances(List<WeightedData<Alliance>> assistedAlliances) {
      this.assistedAlliances = assistedAlliances;
      return this;
    }

    public Builder tendencyAssistedAlliance(Alliance tendencyAssistedAlliance) {
      this.tendencyAssistedAlliance = tendencyAssistedAlliance;
      return this;
    }

    public Builder recentAssistedAlliance(Alliance recentAssistedAlliance) {
      this.recentAssistedAlliance = recentAssistedAlliance;
      return this;
    }

    public Builder usedShips(List<WeightedData<ShipType>> usedShips) {
      this.usedShips = usedShips;
      return this;
    }

    public Builder tendencyUsedShip(ShipType tendencyUsedShip) {
      this.tendencyUsedShip = tendencyUsedShip;
      return this;
    }

    public Builder recentUsedShip(ShipType recentUsedShip) {
      this.recentUsedShip = recentUsedShip;
      return this;
    }

    public Builder killedShips(List<WeightedData<ShipType>> killedShips) {
      this.killedShips = killedShips;
      return this;
    }

    public Builder tendencyKilledShip(ShipType tendencyKilledShip) {
      this.tendencyKilledShip = tendencyKilledShip;
      return this;
    }

    public Builder recentKilledShip(ShipType recentKilledShip) {
      this.recentKilledShip = recentKilledShip;
      return this;
    }

    public Builder averageFleetSize(Integer averageFleetSize) {
      this.averageFleetSize = averageFleetSize;
      return this;
    }

    public Builder killsPerDay(TimeGraph killsPerDay) {
      this.killsPerDay = killsPerDay;
      return this;
    }

    public Builder killsPerHour(BarGraph killsPerHour) {
      this.killsPerHour = killsPerHour;
      return this;
    }

    public PilotStatistics build() {
      return new PilotStatistics(this);
    }
  }
}
