package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Adress;
import com.pracownia.Projekt.repositories.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressServiceImpl implements AdressService {
    @Autowired
    private AdressRepository adressRepository;

    @Override
    public Iterable<Adress> getAllAdress() {
        return adressRepository.findAll();
    }

    @Override
    public Adress saveAdress(Adress adress) {
        return adressRepository.save(adress);
    }

    @Override
    public void deleteAdress(Integer id) {
        adressRepository.delete(id);
    }

    @Override
    public Integer ileMiast() {return adressRepository.ileMiast();}

 /*   @Override
    public LiczbaNapisanychKsiazek findByAutor(Integer autor) {
        return liczba.findByAutor(autor);
    }

    @Override
    public LiczbaNapisanychKsiazek getSredniaLiczba() {
        return liczba.getSredniaLiczba();
    }*/
}
