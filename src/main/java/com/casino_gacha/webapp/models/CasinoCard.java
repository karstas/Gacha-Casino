package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.models.composite_keys.CasinoCardPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Table(name = "casino_card")
public class CasinoCard extends Base {

  @EmbeddedId
  private CasinoCardPK id;

  @Column(name = "is_enabled", nullable = false)
  private boolean enabled = true;
}
