package com.hardBody.hardBody.repositories;

import com.hardBody.hardBody.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteModel,String> {
}
