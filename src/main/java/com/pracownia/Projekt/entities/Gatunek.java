package com.pracownia.Projekt.entities;

import javax.persistence.*;

@Entity
public class Gatunek {

    public Gatunek() {}

    @Id @GeneratedValue
    @Column private int id_gatunku;

    @Column private String nazwa_gatunku;

    public Gatunek(String nazwa_gatunku) {
        this.nazwa_gatunku = nazwa_gatunku;
    }

    public int getId_gatunku() {
        return id_gatunku;
    }

    public void setId_gatunku(int id_gatunku) {
        this.id_gatunku = id_gatunku;
    }

    public String getNazwa_gatunku() {
        return nazwa_gatunku;
    }

    public void setNazwa_gatunku(String nazwa_gatunku) {
        this.nazwa_gatunku = nazwa_gatunku;
    }
}
