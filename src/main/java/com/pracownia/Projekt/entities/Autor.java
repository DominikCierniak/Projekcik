package com.pracownia.Projekt.entities;

import javax.persistence.*;


@Entity
public class Autor {
    public Autor() {}

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column private Integer id;

    @Column private String imie;

    @Column private String nazwisko;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "adres", referencedColumnName = "id")
    private Adress adress;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="pseudonim", referencedColumnName = "id")
    private Pseudonim pseudonim;

    public Autor(String imie, String nazwisko, Adress adress, Pseudonim pseudonim) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adress = adress;
        this.pseudonim = pseudonim;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Pseudonim getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(Pseudonim pseudonim) {
        this.pseudonim = pseudonim;
    }
}
