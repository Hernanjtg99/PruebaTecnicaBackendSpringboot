package com.pruebatecnica.pruebatecnica.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.pruebatecnica.models.Cliente;

public interface IClienteDao extends JpaRepository<Cliente,Long>{
    
}
