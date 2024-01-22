package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.models.composite_keys.CasinoSetPK;

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
@Table(name = "casino_set")
public class CasinoSet extends Base {

  @EmbeddedId
  private CasinoSetPK id;

  @Column(name = "is_enabled", nullable = false)
  private boolean enabled = true;
}
