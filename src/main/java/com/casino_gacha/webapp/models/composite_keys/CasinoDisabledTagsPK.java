package com.casino_gacha.webapp.models.composite_keys;

import java.io.Serializable;

import com.casino_gacha.webapp.models.Casino;
import com.casino_gacha.webapp.models.Tag;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class CasinoDisabledTagsPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "casino_id", nullable = false, updatable = false)
  private Casino casino;

  @ManyToOne
  @JoinColumn(name = "tag_id", nullable = false, updatable = false)
  private Tag tag;
}