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

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Table(name = "card")
public class Card extends Base {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, columnDefinition = "uuid default uuid_generate_v4()", updatable = false)
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
}