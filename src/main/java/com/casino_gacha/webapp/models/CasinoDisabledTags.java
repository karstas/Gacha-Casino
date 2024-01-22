package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.models.composite_keys.CasinoDisabledTagsPK;

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
@Table(name = "casino_disabled_tags")
public class CasinoDisabledTags extends Base {

  @EmbeddedId
  private CasinoDisabledTagsPK id;
}
