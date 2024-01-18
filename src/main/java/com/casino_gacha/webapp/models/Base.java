package com.casino_gacha.webapp.models;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Base {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, columnDefinition = "uuid default uuid_generate_v4()")
  private UUID id;

  @Column(name = "created_at", nullable = false, columnDefinition = "timestamp default now()")
  private Date createdAt;

  @Column(name = "created_by")
  private UUID createdBy;

  @Column(name = "updated_at", nullable = false, columnDefinition = "timestamp default now()")
  private Date updatedAt;

  @Column(name = "updated_by")
  private UUID updatedBy;

  @Column(name = "deleted_at")
  private Date deletedAt;

  @Column(name = "deleted_by")
  private UUID deletedBy;

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
  }

  public UUID getUpdatedBy() {
    return updatedBy;
  }

  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }

  public Date getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedBy(UUID deletedBy) {
    this.deletedBy = deletedBy;
  }

  public UUID getDeletedBy() {
    return deletedBy;
  }
}
