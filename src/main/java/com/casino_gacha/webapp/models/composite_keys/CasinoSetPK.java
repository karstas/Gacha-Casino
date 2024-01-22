package com.casino_gacha.webapp.models.composite_keys;

import com.casino_gacha.webapp.models.Casino;
import com.casino_gacha.webapp.models.Set;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class CasinoSetPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "casino_id", nullable = false, updatable = false)
  private Casino casino;

  @ManyToOne
  @JoinColumn(name = "set_id", nullable = false, updatable = false)
  private Set set;
}
