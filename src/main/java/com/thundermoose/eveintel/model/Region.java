package com.thundermoose.eveintel.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;

@JsonDeserialize(builder = Region.Builder.class)
public class Region implements NamedItem, Serializable {
  private Long id;
  private String name;

  private Region(Builder builder) {
    id = builder.id;
    name = builder.name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Region{" +
        "name='" + name + '\'' +
        '}';
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

    public Region build() {
      return new Region(this);
    }
  }
}
