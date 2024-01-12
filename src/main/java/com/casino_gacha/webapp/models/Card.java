package com.casino_gacha.webapp.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private String name;
  private String gender;
  private int claimRank;
  private int likeRank;
  private int value;

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }

  public void setClaimRank(int claimRank) {
    this.claimRank = claimRank;
  }

  public int getClaimRank() {
    return claimRank;
  }

  public void setLikeRank(int likeRank) {
    this.likeRank = likeRank;
  }

  public int getLikeRank() {
    return likeRank;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}