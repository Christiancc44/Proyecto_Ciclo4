package com.hardBody.hardBody.services;

import java.util.ArrayList;
import java.util.Optional;

import com.hardBody.hardBody.models.EntrenadorModel;
import com.hardBody.hardBody.repositories.EntrenadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorServices {
    @Autowired
    EntrenadorRepository entrenadorRepository;

    public ArrayList<EntrenadorModel> obtenerEntrenador(){
        return (ArrayList<EntrenadorModel>) entrenadorRepository.findAll();
    }

    public EntrenadorModel guardarEntrenador(EntrenadorModel entrenador){
        entrenador.setNombres(entrenador.getNombres().toUpperCase());
        entrenador.setApellidos(entrenador.getApellidos().toUpperCase());
        entrenador.setEspecialidad(entrenador.getEspecialidad().toUpperCase());
        return entrenadorRepository.save(entrenador);
    }

    public boolean eliminarEntrenador(String id){
        if(entrenadorRepository.existsById(id)){
            entrenadorRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<EntrenadorModel> obtenerEntrenadorPorId(String id){
        return entrenadorRepository.findById(id);
    }

    public ArrayList<EntrenadorModel> obtenerEntrenadorPorNombre(String nombres){
        return entrenadorRepository.findByNombres(nombres);
    }

    public ArrayList<EntrenadorModel> obtenerPorApellido(String apellidos){
        return entrenadorRepository.BuscarPorApellido(apellidos);
    }

    public ArrayList<EntrenadorModel> obtenerPorEspecialidad(String especialidad){
        return entrenadorRepository.BuscarPorEspecialidad(especialidad);
    }
}
