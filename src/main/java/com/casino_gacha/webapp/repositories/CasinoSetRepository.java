package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CasinoSet;
import com.casino_gacha.webapp.models.composite_keys.CasinoSetPK;

public interface CasinoSetRepository extends CrudRepository<CasinoSet, CasinoSetPK> {

}