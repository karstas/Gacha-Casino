package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CasinoDisabledTags;
import com.casino_gacha.webapp.models.composite_keys.CasinoDisabledTagsPK;

public interface CasinoDisabledTagsRepository extends CrudRepository<CasinoDisabledTags, CasinoDisabledTagsPK> {

}