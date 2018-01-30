package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Gatunek;

import java.util.List;

public interface GatunekService {

    Iterable<Gatunek> listAllGatunki();

    Gatunek getGatunekById(Integer id);

    Gatunek saveGatunek(Gatunek gatunek);

    void deleteGatunek(Integer id);

    Integer ileGatunkow();

}
