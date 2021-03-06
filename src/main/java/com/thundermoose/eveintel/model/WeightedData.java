package com.thundermoose.eveintel.model;

import java.io.Serializable;

public class WeightedData<T extends NamedItem> implements Serializable {
  private T value;
  private Double weight;
  private Integer count;

  public WeightedData() {
  }

  public WeightedData(T value, Double weight, Integer count) {
    this.value = value;
    this.weight = weight;
    this.count = count;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }
}
