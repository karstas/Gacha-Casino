package com.casino_gacha.webapp.models.composite_keys;

import java.io.Serializable;
import java.util.Objects;

import com.casino_gacha.webapp.models.Casino;
import com.casino_gacha.webapp.models.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CasinoUserPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "casino_id", nullable = false)
  private Casino casino;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  public void setCasino(Casino casino) {
    this.casino = casino;
  }

  public Casino getCasino() {
    return casino;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CasinoUserPK other = (CasinoUserPK) obj;
    return Objects.equals(casino, other.casino) && Objects.equals(user, other.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(casino, user);
  }
}