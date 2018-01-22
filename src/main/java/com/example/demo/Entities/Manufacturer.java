package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Manufacturer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "manufacturer")
    @JsonBackReference
    private Set<Hookah> hookahs;


    public Manufacturer() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Hookah> getHookahs() {
        return hookahs;
    }
}
