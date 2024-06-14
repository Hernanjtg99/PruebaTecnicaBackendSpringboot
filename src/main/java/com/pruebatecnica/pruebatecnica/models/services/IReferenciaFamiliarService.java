package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;

import com.pruebatecnica.pruebatecnica.models.ReferenciaFamiliar;

public interface IReferenciaFamiliarService {

    public List<ReferenciaFamiliar> findAll();

    public ReferenciaFamiliar findByid(Long id);

    public ReferenciaFamiliar save(ReferenciaFamiliar referenciafamiliar);

    public void delete(Long id);
    
}
