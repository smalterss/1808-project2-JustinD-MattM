package com.pettravel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pettravel.domain.Pet;
import com.pettravel.service.PetService;

public class PetController {
	
	@Autowired
	PetService ps;
	
	@GetMapping()
	public List<Pet> getPets(){
		return ps.getAllPets();
		
	}
@GetMapping("{id}")
public Pet getPet(@PetVariable("id") Integer id) {
	ps.makePet(p);
	
}

@PutMapping()
public void updatePet(@PathVariable ("id") Integer id,@RequestBody Pet p) {
	p.set(id);
	ps.updatePet(p);
}
}
