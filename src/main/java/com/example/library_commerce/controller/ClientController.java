package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.ClientDTO;
import com.example.library_commerce.model.entity.Client;
import com.example.library_commerce.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService service;

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientDTO dto) {
        var client = service.createCustomer(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
