package com.casino_gacha.webapp.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.Image;

public interface ImageRepository extends CrudRepository<Image, UUID> {

}