package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Address;

public record ClientDTO(
        String cpf,
        String name,
        Address address,
        String email,
        String phoneNumber) {}

//private String cpf;
//@Column(length = 64)
//private String name;
//@OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
//private Address address;
//@Column(length = 32)
//private String email;
//@Column(length = 14)
//private String phoneNumber;