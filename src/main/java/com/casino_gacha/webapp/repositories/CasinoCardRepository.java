package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CasinoCard;
import com.casino_gacha.webapp.models.composite_keys.CasinoCardPK;

public interface CasinoCardRepository extends CrudRepository<CasinoCard, CasinoCardPK> {

}