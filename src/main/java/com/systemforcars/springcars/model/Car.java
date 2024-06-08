package com.systemforcars.springcars.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    @Column(unique = true)
    private String vin;
    @Transient
    private int yearOfRelease;
    private int price;
    private String color;
    private String motor;
    private int mileage;
    private String description;
}
