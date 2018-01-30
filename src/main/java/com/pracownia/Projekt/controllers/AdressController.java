package com.pracownia.Projekt.controllers;
import com.pracownia.Projekt.entities.Adress;
import com.pracownia.Projekt.services.AdressService;
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
public class AdressController {

    @Autowired
    private AdressService adressService;

    @RequestMapping(value = "/adresy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Adress> listAdress(Model model) { return adressService.getAllAdress();}

    @RequestMapping(value = "/liczba", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer ileMiast() {return adressService.ileMiast();}

    @RequestMapping(value = "/adres", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Adress> createAdress(@RequestBody@Valid @NotNull Adress adress) {
        adressService.saveAdress(adress);
        return ResponseEntity.ok(adress);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/adres/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Adress> deleteAdress(@PathVariable("id") Integer id) {
        adressService.deleteAdress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/adres", method = RequestMethod.PUT)
    public ResponseEntity<Void> editAdress(@RequestBody @Valid @NotNull Adress adress) {
        adressService.saveAdress(adress);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
