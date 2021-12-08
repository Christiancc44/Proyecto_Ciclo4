package com.hardBody.hardBody.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.hardBody.hardBody.models.EntrenadorModel;
import com.hardBody.hardBody.services.EntrenadorServices;

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
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    EntrenadorServices entrenadorServices;

    @GetMapping()
    public ArrayList<EntrenadorModel> obtenerEntrenador(){
        return entrenadorServices.obtenerEntrenador();
    }

    @PostMapping()
    public EntrenadorModel guardarEntrenador(@RequestBody EntrenadorModel entrenador){
        return entrenadorServices.guardarEntrenador(entrenador);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarEntrenadorPorId(@PathVariable("id") String id){
        if(this.entrenadorServices.eliminarEntrenador(id)){
            return "Se elimino el cliente con id: " + id;
        }else{
            return "No se elimino el cliente con id: " + id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<EntrenadorModel> obtenerEntrenadorPorId(@PathVariable("id") String id) {
        return this.entrenadorServices.obtenerEntrenadorPorId(id);
    }
    
}
