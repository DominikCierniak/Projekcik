package com.pracownia.Projekt.controllers;

import com.pracownia.Projekt.entities.Gatunek;
import com.pracownia.Projekt.entities.Ksiazka;
import com.pracownia.Projekt.services.KsiazkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
public class KsiazkaController {
    @Autowired
    KsiazkaService ksiazkaService;

    @RequestMapping(value = "/ksiazki", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Ksiazka> listKsiazek(Model model) {return ksiazkaService.findAllKsiążki();}

    @RequestMapping(value = "/ksiazka/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Ksiazka getKsiazkaById(@PathVariable("id") Integer id)  {return ksiazkaService.getKsiążkaByid(id);}

    @RequestMapping(value = "/ksiazka", method = RequestMethod.POST)
    public ResponseEntity<Ksiazka> createKsiazka(@RequestBody @Valid @NotNull Ksiazka ksiazka) {
        ksiazkaService.saveKsiążka(ksiazka);
        return ResponseEntity.ok().body(ksiazka);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/ksiazka/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Ksiazka> deleteKsiazka(@PathVariable("id") Integer id) {
        ksiazkaService.deleteKsiążka(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/ksiazka", method = RequestMethod.PUT)
    ResponseEntity<Void> editKsiazka(@RequestBody @Valid @NotNull Ksiazka ksiazka) {
        ksiazkaService.saveKsiążka(ksiazka);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/fantasy", method = RequestMethod.GET)
    public Integer ileKsiazekFantasy() {return ksiazkaService.ileKsiazekFantasy();}
}
