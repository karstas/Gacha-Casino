package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CardTag;
import com.casino_gacha.webapp.models.composite_keys.CardTagPK;

public interface CardTagRepository extends CrudRepository<CardTag, CardTagPK> {

}