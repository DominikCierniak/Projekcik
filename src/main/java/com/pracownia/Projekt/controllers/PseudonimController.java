package com.pracownia.Projekt.controllers;

import com.pracownia.Projekt.entities.Pseudonim;
import com.pracownia.Projekt.services.PseudonimService;
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
public class PseudonimController {

    @Autowired
    PseudonimService pseudonimService;

    @RequestMapping(value = "/pseudonimy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Pseudonim> listPseudos(Model model) {return pseudonimService.getAllPseudonimy();}

    @RequestMapping(value = "/pseudonim/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pseudonim getPseudonimById (@PathVariable("id") Integer id) {return pseudonimService.findByPseudonimId(id);}

    @RequestMapping(value = "/pseudonim", method = RequestMethod.POST)
    public ResponseEntity<Pseudonim> createPseudo(@RequestBody @Valid @NotNull Pseudonim pseudonim) {
        pseudonimService.savePseudonim(pseudonim);
        return ResponseEntity.ok(pseudonim);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/pseudonim/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Pseudonim> deletePseudo(@PathVariable("id") Integer id) {
        pseudonimService.deletePseudonim(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/ipseudonimow", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer ilePseudonimow() {return pseudonimService.ilePseudonimow();}
}
