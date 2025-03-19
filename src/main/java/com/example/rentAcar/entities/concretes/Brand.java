package com.example.rentAcar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;






}
