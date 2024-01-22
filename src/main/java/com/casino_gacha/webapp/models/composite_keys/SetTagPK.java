package com.casino_gacha.webapp.models.composite_keys;

import java.io.Serializable;

import com.casino_gacha.webapp.models.Set;
import com.casino_gacha.webapp.models.Tag;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class SetTagPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "set_id", nullable = false, updatable = false)
  private Set set;

  @ManyToOne
  @JoinColumn(name = "tag_id", nullable = false, updatable = false)
  private Tag tag;
}