package com.pracownia.Projekt.repositories;

import com.pracownia.Projekt.entities.Adress;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdressRepository extends CrudRepository<Adress, Integer> {

    @Query("select count(distinct miasto) from Adress")
    Integer ileMiast();

   /* @Query("select * from LiczbaNapisanychKsiazek where autor = ?1")
    LiczbaNapisanychKsiazek findByAutor(int autor);

    @Query("select avg(liczba) from LiczbaNapisanychKsiazek")
    LiczbaNapisanychKsiazek getSredniaLiczba();*/
}
