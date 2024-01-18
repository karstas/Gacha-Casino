package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.enums.CardGender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card extends Base {

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "gender", nullable = false)
  private CardGender gender;

  @Column(name = "claim_rank", nullable = false, unique = true)
  private int claimRank;

  @Column(name = "like_rank", nullable = false, unique = true)
  private int likeRank;

  @Column(name = "value", nullable = false)
  private int value;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setGender(CardGender gender) {
    this.gender = gender;
  }

  public CardGender getGender() {
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