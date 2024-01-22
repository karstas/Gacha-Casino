package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.models.composite_keys.CasinoUserPK;

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
@Table(name = "casino_user")
public class CasinoUser extends Base {

  @EmbeddedId
  private CasinoUserPK id;

  @Column(name = "nickname", nullable = false)
  private String nickname;

  @Column(name = "wallet", nullable = false, columnDefinition = "int default 0")
  private int wallet;
}
