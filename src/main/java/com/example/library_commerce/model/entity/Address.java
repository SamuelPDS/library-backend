package com.example.library_commerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cep;
    @Column
    private String street;
    @Column
    private Integer number;
    @Column
    private String neighborhood;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String complement;

    @OneToOne
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Client client;
}
