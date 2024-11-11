package com.cardino.template.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

@Entity
public class Car {
    @Id  @GeneratedValue
    private UUID id;
    private String brand;
    private String model;
    private Date firstRegistration;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ArrayList<Equipment> equipment;
    private Float sellingPrice;

}
