package com.example.library_commerce.model.entity;

import com.example.library_commerce.model.dto.AddressDTO;
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
    @Column(length = 10)
    private String cep;
    @Column(length = 128)
    private String street;
    @Column(length = 32)
    private Integer number;
    @Column(length = 64)
    private String neighborhood;
    @Column(length = 64)
    private String city;
    @Column(length = 32)
    private String state;
    @Column(length = 128)
    private String complement;

    @ManyToOne
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Client client;

    public Address(Client client, AddressDTO dto) {
        this.client = client;
        this.cep = dto.getCep();
        this.street = dto.getStreet();
        this.number = dto.getNumber();
        this.neighborhood = dto.getNeighborhood();
        this.city = getCep();
        this.state = dto.getState();
        this.complement = dto.getComplement();
    }
}
