package com.hardBody.hardBody.repositories;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hardBody.hardBody.models.EntrenadorModel;

@Repository
public interface EntrenadorRepository extends MongoRepository<EntrenadorModel,String> {

    ArrayList <EntrenadorModel> findByNombres(String nombre);

    @Query("{apellidos:'?0'}")
    ArrayList<EntrenadorModel> BuscarPorApellido(String apellido);

    @Query("{especialidad:'?0'}")
    ArrayList<EntrenadorModel> BuscarPorEspecialidad(String apellido);

    ArrayList <EntrenadorModel> findByAñoNacimientoGreaterThanEqual(int añoNacimineto);
}
