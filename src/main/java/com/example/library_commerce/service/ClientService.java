package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.ClientDTO;
import com.example.library_commerce.model.entity.Client;
import com.example.library_commerce.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client createCustomer(ClientDTO dto) {
        var newClient = new Client(dto);
        return repository.save(newClient);
    }
}
