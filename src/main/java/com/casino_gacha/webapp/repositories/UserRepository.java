package com.casino_gacha.webapp.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.casino_gacha.webapp.models.User;

public interface UserRepository extends CrudRepository<User, UUID> {

}