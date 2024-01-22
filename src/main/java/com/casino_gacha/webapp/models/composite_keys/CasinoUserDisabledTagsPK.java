package com.casino_gacha.webapp.models.composite_keys;

import java.io.Serializable;

import com.casino_gacha.webapp.models.Casino;
import com.casino_gacha.webapp.models.Tag;
import com.casino_gacha.webapp.models.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class CasinoUserDisabledTagsPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "casino_id", nullable = false, updatable = false)
  private Casino casino;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false, updatable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "tag_id", nullable = false, updatable = false)
  private Tag tag;
}