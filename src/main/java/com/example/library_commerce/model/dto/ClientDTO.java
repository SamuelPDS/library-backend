package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Address;

import java.util.Date;

public record ClientDTO(
        String cpf,
        String name,
        Address address,
        String email,
        String phoneNumber
//        Date bornDate
) {}