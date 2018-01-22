package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "HOOKAH")
public class Hookah {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private float price;

    @ManyToOne
    @JoinColumn(name = "MANUFACTURER_ID")
    @JsonManagedReference
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "BOTTLE_ID")
    @JsonManagedReference
    private Bottle bottle;

    @ManyToOne
    @JoinColumn(name = "TUBE_ID")
    @JsonManagedReference
    private Tube tube;

    public Tube getTube() {
        return tube;
    }

    public Bottle getBottle() {
        return bottle;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setId(long id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public Hookah() {

    }

}
