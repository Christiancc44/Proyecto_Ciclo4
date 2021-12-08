package com.hardBody.hardBody.services;

import java.util.ArrayList;
import java.util.Optional;

import com.hardBody.hardBody.models.ClienteModel;
import com.hardBody.hardBody.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorServices {
    @Autowired
    EntrenadorRepository EntrenadorRepository;

    public ArrayList<EntrenadorModel> obtenerClientes(){
        return (ArrayList<EntrenadorModel>) EntrenadorRepository.findAll();
    }

    public EntrenadorModel guardarCliente(EntrenadorModel entrenador){
        return EntrenadorRepository.save(entrenador);
    }

    public boolean eliminarEntrenador(String id){
        if(EntrenadorRepository.existsById(id)){
            EntrenadorRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<EntrenadorModel> obtenerEntrenadorPorId(String id){
        return EntrenadorRepository.findById(id);
    }
}
