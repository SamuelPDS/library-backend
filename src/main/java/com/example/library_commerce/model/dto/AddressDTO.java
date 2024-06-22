package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Address;
import com.example.library_commerce.model.entity.Client;

public class AddressDTO {
    private String cep;
    private String street;
    private Integer number;
    private String neighborhood;
    private String city;
    private String state;
    private String complement;
    private Client client;

    public AddressDTO(Address address, Client client){
        this.cep = address.getCep();
        this.street = address.getStreet();
        this.number = address.getNumber();
        this.neighborhood = address.getNeighborhood();
        this.city = address.getCity();
        this.state = address.getState();
        this.complement = address.getComplement();
        this.client = client;
    }
}
