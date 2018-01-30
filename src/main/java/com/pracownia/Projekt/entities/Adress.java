package com.pracownia.Projekt.entities;

import javax.persistence.*;

@Entity
public class Adress {

    @Id @GeneratedValue
    @Column private int id;

    @Column private String miasto;

    @Column private String ulicaDom;

    public Adress() {}

    public Adress(String miasto, String ulicaDom) {
        this.miasto = miasto;
        this.ulicaDom = ulicaDom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlicaDom() {
        return ulicaDom;
    }

    public void setUlicaDom(String ulicaDom) {
        this.ulicaDom = ulicaDom;
    }
}
