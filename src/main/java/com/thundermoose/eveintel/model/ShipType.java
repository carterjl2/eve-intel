package com.thundermoose.eveintel.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by thundermoose on 11/24/14.
 */
@JsonDeserialize(builder = ShipType.Builder.class)
public class ShipType implements NamedItem {
  private Long id;
  private String name;

  private ShipType(Builder builder) {
    id = builder.id;
    name = builder.name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public Long getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
  public static final class Builder {
    private Long id;
    private String name;

    private Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public ShipType build() {
      return new ShipType(this);
    }
  }
}
