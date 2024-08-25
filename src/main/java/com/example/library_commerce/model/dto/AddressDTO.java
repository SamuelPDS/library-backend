package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Address;
import com.example.library_commerce.model.entity.Client;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDTO {
    @NotBlank
    private  String cep;
    private  String street;
    private  Integer number;
    private  String neighborhood;
    private  String city;
    private  String state;
    private  String complement;
    private  Client client;
}
