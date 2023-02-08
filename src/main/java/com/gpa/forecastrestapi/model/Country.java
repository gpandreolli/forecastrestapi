package com.gpa.forecastrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private int ddi;

    @JsonIgnore
    @OneToMany(mappedBy = "country")
    private List<State> states;

    public Country() {
    }

    public Country(Long id, String name, int ddi, List<State> states) {
        this.id = id;
        this.name = name;
        this.ddi = ddi;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
