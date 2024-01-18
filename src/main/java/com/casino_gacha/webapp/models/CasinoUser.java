package com.casino_gacha.webapp.models;

import com.casino_gacha.webapp.models.coumpound_keys.CasinoUserPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "casino_user")
public class CasinoUser extends Base {

  @EmbeddedId
  private CasinoUserPK id;

  @Column(name = "nickname", nullable = false)
  private String nickname;

  @Column(name = "wallet", nullable = false, columnDefinition = "int default 0")
  private int wallet;

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
  }

  public void setWallet(int wallet) {
    this.wallet = wallet;
  }

  public int getWallet() {
    return wallet;
  }
}
