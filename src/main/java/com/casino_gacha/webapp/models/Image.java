package com.casino_gacha.webapp.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "image")
public class Image extends Base {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, columnDefinition = "uuid default uuid_generate_v4()")
  private UUID id;

  @ManyToOne
  @JoinColumn(name = "card_id", nullable = false)
  private Card card;

  @Column(name = "artist", nullable = false)
  private String artist;

  @Column(name = "url", nullable = false, unique = true)
  private String url;

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getArtist() {
    return artist;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}
