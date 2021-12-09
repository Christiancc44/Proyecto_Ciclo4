package com.hardBody.hardBody.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hardBody.hardBody.models.ClienteModel;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteModel,String> {

    ArrayList <ClienteModel> findByNombres(String nombre);

    @Query("{apellidos:'?0'}")
    ArrayList<ClienteModel> BuscarPorApellido(String apellido);
}
