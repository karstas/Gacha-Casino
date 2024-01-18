package com.casino_gacha.webapp.enums;

public enum CardGender {
  Male("male"),
  Female("female"),
  Other("other");

  private final String value;

  CardGender(String gender) {
    value = gender;
  }

  public String getGender() {
    return value;
  }
}
