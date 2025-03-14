package com.alisson.conta.ContaBancaria.service;

import com.alisson.conta.ContaBancaria.entity.Cliente;
import com.alisson.conta.ContaBancaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
