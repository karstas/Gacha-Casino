package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.CasinoUserDisabledTags;
import com.casino_gacha.webapp.models.composite_keys.CasinoUserDisabledTagsPK;

public interface CasinoUserDisabledTagsRepository
    extends CrudRepository<CasinoUserDisabledTags, CasinoUserDisabledTagsPK> {

}