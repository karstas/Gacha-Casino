package com.casino_gacha.webapp.models;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {
  @CreatedDate
  @Column(name = "created_at", nullable = false)
  private Timestamp createdAt;

  @Column(name = "created_by")
  private UUID createdBy;

  @LastModifiedDate
  @Column(name = "updated_at", nullable = false)
  private Timestamp updatedAt;

  @Column(name = "updated_by")
  private UUID updatedBy;

  @Column(name = "deleted_at")
  private Timestamp deletedAt;

  @Column(name = "deleted_by")
  private UUID deletedBy;

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
  }

  public UUID getUpdatedBy() {
    return updatedBy;
  }

  public void setDeletedAt(Timestamp deletedAt) {
    this.deletedAt = deletedAt;
  }

  public Timestamp getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedBy(UUID deletedBy) {
    this.deletedBy = deletedBy;
  }

  public UUID getDeletedBy() {
    return deletedBy;
  }

}
