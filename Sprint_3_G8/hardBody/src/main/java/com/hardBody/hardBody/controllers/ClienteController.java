package com.hardBody.hardBody.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.hardBody.hardBody.models.ClienteModel;
import com.hardBody.hardBody.services.ClienteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteServices clienteServices;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return clienteServices.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
        return clienteServices.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarClientePorId(@PathVariable("id") String id){
        if(this.clienteServices.eliminarCliente(id)){
            return "Se elimino el cliente con id: " + id;
        }else{
            return "No se elimino el cliente con id: " + id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id") String id) {
        return this.clienteServices.obtenerClientePorId(id);
    }
}
