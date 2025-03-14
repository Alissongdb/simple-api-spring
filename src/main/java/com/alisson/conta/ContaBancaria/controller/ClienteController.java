package com.alisson.conta.ContaBancaria.controller;

import com.alisson.conta.ContaBancaria.entity.Cliente;
import com.alisson.conta.ContaBancaria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> saveClientes(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.saveCliente(cliente), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return clienteService.getAllCliente();
    }

    @DeleteMapping
    public ResponseEntity deleteClientes(@RequestParam Long id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
