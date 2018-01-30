package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Pseudonim;

public interface PseudonimService {

    Iterable<Pseudonim> getAllPseudonimy();

    Pseudonim findByPseudonimId(Integer Id);

    Pseudonim savePseudonim(Pseudonim pseudonim);

    void deletePseudonim(Integer id);

    Integer ilePseudonimow();
}
