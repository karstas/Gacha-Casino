package com.casino_gacha.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.SetTag;
import com.casino_gacha.webapp.models.composite_keys.SetTagPK;

public interface SetTagRepository extends CrudRepository<SetTag, SetTagPK> {

}