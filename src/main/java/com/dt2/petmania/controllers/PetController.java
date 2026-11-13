package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import com.dt2.petmania.services.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pets")
public class PetController {

    private final PetService service;
    public PetController(PetService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pet> mostrar(){
        return service.mostrarPets();
    }

    @PostMapping
    public void criar(@RequestBody Pet p){
        service.criarPet(p);
    }

    //CRIE O DELETE
}
