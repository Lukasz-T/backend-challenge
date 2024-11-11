package com.cardino.template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Equipment {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String value;
}
