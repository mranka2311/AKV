package com.pwc.mule.connector.akv.provider.api.client.model;

import com.google.gson.annotations.SerializedName;

public class CertificateTrigger {

  @SerializedName(value = "days_before_expiry")
  private Integer daysBeforeExpiry;

  @SerializedName(value = "lifetime_percentage")
  private Integer lifetimePercentage;

  public Integer getDaysBeforeExpiry() {
    return daysBeforeExpiry;
  }

  public void setDaysBeforeExpiry(Integer daysBeforeExpiry) {
    this.daysBeforeExpiry = daysBeforeExpiry;
  }

  public Integer getLifetimePercentage() {
    return lifetimePercentage;
  }

  public void setLifetimePercentage(Integer lifetimePercentage) {
    this.lifetimePercentage = lifetimePercentage;
  }

  @Override
  @SuppressWarnings("checkstyle:OperatorWrap")
  public String toString() {
    return "CertificateTrigger{" +
        "daysBeforeExpiry=" + daysBeforeExpiry +
        ", lifetimePercentage=" + lifetimePercentage +
        '}';
  }
}
