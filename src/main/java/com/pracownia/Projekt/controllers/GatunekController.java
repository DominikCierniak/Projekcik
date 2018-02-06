package com.pracownia.Projekt.controllers;

import com.pracownia.Projekt.entities.Gatunek;
import com.pracownia.Projekt.repositories.GatunekRepository;
import com.pracownia.Projekt.services.GatunekService;
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
public class GatunekController {

    @Autowired
    GatunekService gatunekService;

    @RequestMapping(value = "/gatunki", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Gatunek> listGatunkow(Model model) {
        return gatunekService.listAllGatunki();
    }

    @RequestMapping(value = "/gatunek/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Gatunek getGatunekById(@PathVariable("id") Integer id) {
        return gatunekService.getGatunekById(id);
    }

    @RequestMapping(value = "/gatunek", method = RequestMethod.POST)
    public ResponseEntity<Gatunek> createGatunek(@RequestBody @Valid @NotNull Gatunek gatunek) {
        gatunekService.saveGatunek(gatunek);
        return ResponseEntity.ok().body(gatunek);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/gatunek/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Gatunek> deleteGatunek(@PathVariable Integer id) {
        gatunekService.deleteGatunek(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/gatunek", method = RequestMethod.PUT)
    public ResponseEntity<Void> editGatunek(@RequestBody @NotNull @Valid Gatunek gatunek) {
        gatunekService.saveGatunek(gatunek);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/lgatunki", method = RequestMethod.GET)
    public Integer ileGatunkow() {return gatunekService.ileGatunkow();}
}
