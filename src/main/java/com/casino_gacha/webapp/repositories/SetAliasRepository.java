package com.casino_gacha.webapp.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.SetAlias;

public interface SetAliasRepository extends CrudRepository<SetAlias, UUID> {

}