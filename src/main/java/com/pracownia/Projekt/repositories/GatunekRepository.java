package com.pracownia.Projekt.repositories;

import com.pracownia.Projekt.entities.Gatunek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GatunekRepository extends CrudRepository<Gatunek,Integer> {
    @Query("select count(*) from Gatunek")
    Integer ileGatunkow();
}
