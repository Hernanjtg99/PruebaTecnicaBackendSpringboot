package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;


import com.pruebatecnica.pruebatecnica.models.ReferenciaPersonal;

public interface IReferenciaPersonalService {

    
    public List<ReferenciaPersonal> findAll();

    public ReferenciaPersonal findByid(Long id);

    public ReferenciaPersonal save(ReferenciaPersonal referenciapersonal);

    public void delete(Long id);
    
}
