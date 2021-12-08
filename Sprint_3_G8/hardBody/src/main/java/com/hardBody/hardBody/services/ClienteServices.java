package com.hardBody.hardBody.services;

import java.util.ArrayList;
import java.util.Optional;

import com.hardBody.hardBody.models.ClienteModel;
import com.hardBody.hardBody.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente(String id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<ClienteModel> obtenerClientePorId(String id){
        return clienteRepository.findById(id);
    }
}
