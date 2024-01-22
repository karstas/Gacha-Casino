package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CasinoUser;
import com.casino_gacha.webapp.models.composite_keys.CasinoUserPK;

public interface CasinoUserRepository extends CrudRepository<CasinoUser, CasinoUserPK> {

}