package com.pruebatecnica.pruebatecnica.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.pruebatecnica.models.Credito;

public interface ICreditoDao extends JpaRepository<Credito,Long> {
    
}
