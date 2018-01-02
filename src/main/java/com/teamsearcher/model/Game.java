package com.teamsearcher.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "game", schema = "teamsearcher")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String acronim;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "game", orphanRemoval = true)
    private List<Form> forms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public String getAcronim() {
        return acronim;
    }

    public void setAcronim(String acronim) {
        this.acronim = acronim;
    }
}
