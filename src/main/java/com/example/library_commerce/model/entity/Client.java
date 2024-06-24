package com.example.library_commerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 11, unique = true)
    private String cpf;
    @Column(length = 64)
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
    private Address address;
    @Column(length = 32)
    private String email;
    @Column(length = 14)
    private String phoneNumber;

// public Client(CustomerDTO dto){
//    this.cpf = dto
//}

}