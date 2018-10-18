package com.pettravel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pettravel.domain.Pet;
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
