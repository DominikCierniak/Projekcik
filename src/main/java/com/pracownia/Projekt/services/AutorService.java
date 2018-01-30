package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Autor;

import java.util.List;

public interface AutorService {

    Iterable<Autor> listAllAutor();

    Autor getAutorById(Integer id);

    Autor saveAutor(Autor autor);

    void deleteAutor(Integer id);

    Integer ileAndrzejow();

    //List<Autor> findByLastnameorFirstnameAllIgnoreCase(String imie, String nazwisko);




}
