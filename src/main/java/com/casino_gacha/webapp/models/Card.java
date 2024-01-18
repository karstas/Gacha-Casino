package com.casino_gacha.webapp.models;

import java.util.List;
import java.util.UUID;

import com.casino_gacha.webapp.enums.CardGender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card extends Base {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, columnDefinition = "uuid default uuid_generate_v4()")
  private UUID id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(name = "gender", nullable = false)
  private CardGender gender;

  @Column(name = "claim_rank", nullable = false, unique = true)
  private int claimRank;

  @Column(name = "like_rank", nullable = false, unique = true)
  private int likeRank;

  @Column(name = "value", nullable = false)
  private int value;

  @OneToMany(mappedBy = "id")
  private List<Image> images;

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