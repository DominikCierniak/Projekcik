package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Pseudonim;
import com.pracownia.Projekt.repositories.PseudonimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PseudonimServiceImpl implements PseudonimService {

    @Autowired
    private PseudonimRepository pseudonimRepository;

    @Override
    public Iterable<Pseudonim> getAllPseudonimy() {
        return pseudonimRepository.findAll();
    }

    @Override
    public Pseudonim findByPseudonimId(Integer Id) {
        return pseudonimRepository.findOne(Id);
    }

    @Override
    public Pseudonim savePseudonim(Pseudonim pseudonim) {
        return pseudonimRepository.save(pseudonim);
    }

    @Override
    public void deletePseudonim(Integer id) {
        pseudonimRepository.delete(id);
    }

    @Override
    public Integer ilePseudonimow() {return pseudonimRepository.ilePseudonimow();}
}
