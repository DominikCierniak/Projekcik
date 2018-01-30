package com.pracownia.Projekt.entities;

import javax.persistence.*;

@Entity
public class Pseudonim {

    @Id @GeneratedValue
    @Column private int id;

    @Column private String pseudonim;

    public Pseudonim() {}

    public Pseudonim(String pseudonim) {this.pseudonim = pseudonim;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

}
