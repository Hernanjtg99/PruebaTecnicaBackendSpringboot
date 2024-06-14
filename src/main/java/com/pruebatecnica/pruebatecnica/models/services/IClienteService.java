package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;

import com.pruebatecnica.pruebatecnica.models.Cliente;

public interface IClienteService  {

    public List<Cliente> findAll();

    public Cliente findByid(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
    
}
