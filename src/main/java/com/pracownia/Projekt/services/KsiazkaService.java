package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Ksiazka;

import java.util.List;

public interface KsiazkaService {

    Iterable<Ksiazka> findAllKsiążki();

    Ksiazka getKsiążkaByid(Integer id);

    Ksiazka saveKsiążka (Ksiazka książka);

    void deleteKsiążka(Integer id);

    Integer ileKsiazekFantasy();
}
