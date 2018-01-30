package com.pracownia.Projekt.entities;

import javax.persistence.*;

@Entity
public class Ksiazka {

    public Ksiazka() {}

    @Id @GeneratedValue
    @Column(name= "Id_ksiazki") private int id;

    @Column(name = "tytul") private String tytul;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="autor", referencedColumnName = "id")
    private Autor autor;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="gatunek", referencedColumnName = "id_gatunku")
    private Gatunek gatunek;

    public Ksiazka(String tytul, Autor autor, Gatunek gatunek) {
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }
}
