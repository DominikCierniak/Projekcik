package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Ksiazka;
import com.pracownia.Projekt.repositories.KsiazkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KsiazkaServiceImpl implements KsiazkaService{
    @Autowired
    private KsiazkaRepository ksiazkaRepository;

    @Override
    public Iterable<Ksiazka> findAllKsiążki() {
        return ksiazkaRepository.findAll();
    }

    @Override
    public Ksiazka getKsiążkaByid(Integer id) {
        return ksiazkaRepository.findOne(id);
    }

    @Override
    public Ksiazka saveKsiążka(Ksiazka książka) {
        return ksiazkaRepository.save(książka);
    }

    @Override
    public void deleteKsiążka(Integer id) {
        ksiazkaRepository.delete(id);
    }

    @Override
    public Integer ileKsiazekFantasy(){return ksiazkaRepository.ileKsiazekFantasy();}
    }
