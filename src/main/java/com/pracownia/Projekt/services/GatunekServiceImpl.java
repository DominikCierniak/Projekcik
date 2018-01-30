package com.pracownia.Projekt.services;

import com.pracownia.Projekt.entities.Gatunek;
import com.pracownia.Projekt.repositories.GatunekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatunekServiceImpl implements GatunekService {
    @Autowired
    private GatunekRepository gatunekRepository;

    @Override
    public Iterable<Gatunek> listAllGatunki() {
        return gatunekRepository.findAll();
    }

    @Override
    public Gatunek getGatunekById(Integer id) {
        return gatunekRepository.findOne(id);
    }

    @Override
    public Gatunek saveGatunek(Gatunek gatunek) {
        return gatunekRepository.save(gatunek);
    }

    @Override
    public void deleteGatunek(Integer id) {
        gatunekRepository.delete(id);

    }

    @Override
    public Integer ileGatunkow() {return gatunekRepository.ileGatunkow();}
}
