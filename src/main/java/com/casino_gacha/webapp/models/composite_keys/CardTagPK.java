package com.casino_gacha.webapp.models.composite_keys;

import java.io.Serializable;

import com.casino_gacha.webapp.models.Card;
import com.casino_gacha.webapp.models.Tag;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class CardTagPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "card_id", nullable = false, updatable = false)
  private Card card;

  @ManyToOne
  @JoinColumn(name = "tag_id", nullable = false, updatable = false)
  private Tag tag;
}