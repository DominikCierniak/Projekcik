package com.pracownia.Projekt.services;


import com.pracownia.Projekt.entities.Adress;

public interface AdressService {

    Iterable<Adress> getAllAdress();

    Adress saveAdress(Adress adress);

    void deleteAdress(Integer id);

    Integer ileMiast();

    /*LiczbaNapisanychKsiazek findByAutor(Integer autor);

    LiczbaNapisanychKsiazek getSredniaLiczba();*/
}
