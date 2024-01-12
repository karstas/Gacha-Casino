package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {

}