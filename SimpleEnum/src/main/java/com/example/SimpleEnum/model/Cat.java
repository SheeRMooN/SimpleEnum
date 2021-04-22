package com.example.SimpleEnum.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int Age;
}
