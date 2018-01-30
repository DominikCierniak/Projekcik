package com.pracownia.Projekt.repositories;

import com.pracownia.Projekt.entities.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutorRepository extends CrudRepository<Autor,Integer> {
    //List<Autor> findByLastnameorFirstnameAllIgnoreCase(String imie, String nazwisko);

    @Query("select count(*) from Autor a where a.imie = 'Andrzej'")
    Integer ileAndrzejow();

}
