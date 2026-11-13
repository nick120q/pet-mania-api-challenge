package com.dt2.petmania.services;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepository repository;
    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> mostrarPets(){
        return repository.findAll();
    }

    public void criarPet(Pet p){
        Pet pet = new Pet(p.getNome(),p.getEspecie(),p.getRaca(),p.getIdade(),p.getSexo(),p.getPorte(),p.getPersonalidade(),p.getFoto(),p.isDisponivel());
        repository.save(pet);
    }

}