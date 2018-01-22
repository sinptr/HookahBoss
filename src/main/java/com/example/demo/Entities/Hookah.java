package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOOKAH")
public class Hookah {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
