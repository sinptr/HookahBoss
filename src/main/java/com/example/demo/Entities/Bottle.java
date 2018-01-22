package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Bottle {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String volume;
    @OneToMany(mappedBy = "bottle")
    @JsonBackReference
    private Set<Hookah> hookahs;

    public Set<Hookah> getHookahs() {
        return hookahs;
    }

    public Bottle() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
}
