package com.hardBody.hardBody.repositories;

import com.hardBody.hardBody.models.EntrenadorModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntrenadorRepository extends MongoRepository<EntrenadorModel,String> {
}
