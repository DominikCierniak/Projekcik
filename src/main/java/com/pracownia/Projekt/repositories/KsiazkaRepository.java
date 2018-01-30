package com.pracownia.Projekt.repositories;

import com.pracownia.Projekt.entities.Ksiazka;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KsiazkaRepository extends CrudRepository<Ksiazka,Integer>{

    @Query("select count(*) from Ksiazka k, Gatunek g where k.gatunek=g.id_gatunku and g.nazwa_gatunku='fantasy'")
    Integer ileKsiazekFantasy();
}
