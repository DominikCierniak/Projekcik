package com.pracownia.Projekt.repositories;

import com.pracownia.Projekt.entities.Pseudonim;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PseudonimRepository extends CrudRepository<Pseudonim,Integer> {
   @Query("select count(*) from Pseudonim")
    Integer ilePseudonimow();
}

