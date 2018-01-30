package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Autor;
import com.pracownia.Projekt.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Iterable<Autor> listAllAutor(){return autorRepository.findAll();}

    @Override
    public Autor getAutorById(Integer id) {return autorRepository.findOne(id);}

    @Override
    public Autor saveAutor(Autor autor) {return autorRepository.save(autor);}

    @Override
    public void deleteAutor(Integer id) {autorRepository.delete(id);}

    @Override
    public Integer ileAndrzejow() {return autorRepository.ileAndrzejow();}

}
