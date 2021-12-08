package com.hardBody.hardBody.repositories;

import java.util.ArrayList;

import com.hardBody.hardBody.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteModel,String> {

    ArrayList <ClienteModel> findByNombre(String nombre);
}
