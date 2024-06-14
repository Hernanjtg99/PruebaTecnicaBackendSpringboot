package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.pruebatecnica.models.ReferenciaFamiliar;
import com.pruebatecnica.pruebatecnica.models.dao.IReferenciaFamiliar;

import jakarta.transaction.Transactional;

@Service
public class ReferenciaFamiliarImpl implements IReferenciaFamiliarService{

    @Autowired
    private IReferenciaFamiliar referenciaFamiliar;

    @Override
    @Transactional
    public List<ReferenciaFamiliar> findAll() {
        return referenciaFamiliar.findAll();
    }

    @Override
    @Transactional
    public ReferenciaFamiliar findByid(Long id) {
       return referenciaFamiliar.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ReferenciaFamiliar save(ReferenciaFamiliar referenciafamiliar) {
        return referenciaFamiliar.save(referenciafamiliar);
    }

    @Override
    @Transactional
    public void delete(Long id) {
      
        referenciaFamiliar.deleteById(id);
    }
    
}
