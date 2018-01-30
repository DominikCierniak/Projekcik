package com.pracownia.Projekt.controllers;

import com.pracownia.Projekt.entities.Autor;
import com.pracownia.Projekt.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RestController
public class AutorController {

    @Autowired
    AutorService autorService;

    @RequestMapping(value = "/autorzy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Autor> listAutorzy(Model model) {return autorService.listAllAutor();}

    @RequestMapping(value = "/autor/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Autor getAutorById(@PathVariable("id") Integer id) {return autorService.getAutorById(id);}

    @RequestMapping(value = "/autor", method = RequestMethod.POST)
    public ResponseEntity<Autor> createAutor(@RequestBody @Valid @NotNull Autor autor) {
        autorService.saveAutor(autor);
        return ResponseEntity.ok().body(autor);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/autor/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Autor> deleteAutor(@PathVariable Integer id) {
        autorService.deleteAutor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/autor", method = RequestMethod.PUT)
    public ResponseEntity<Void> editAutor(@RequestBody @Valid @NotNull Autor autor) {
        autorService.saveAutor(autor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/andrzej", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer ileAndrzejow() {return autorService.ileAndrzejow();}
}
