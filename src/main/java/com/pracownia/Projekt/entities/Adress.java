package com.pracownia.Projekt.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
public class Adress {
    @GenericGenerator(
            name = "wikiSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "WIKI_SEQUENCE"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @Id @GeneratedValue(generator = "wikiSequenceGenerator")
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
