package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.pruebatecnica.models.ReferenciaPersonal;
import com.pruebatecnica.pruebatecnica.models.dao.IReferenciaPersonalDao;

import jakarta.transaction.Transactional;

@Service
public class ReferenciaPersonalServiceImpl implements IReferenciaPersonalService
{
    @Autowired
    private IReferenciaPersonalDao referenciaPersonalDao;
    @Override
    @Transactional
    public List<ReferenciaPersonal> findAll() {
     return referenciaPersonalDao.findAll();
    }

    @Override
    @Transactional
    public ReferenciaPersonal findByid(Long id) {
        return referenciaPersonalDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ReferenciaPersonal save(ReferenciaPersonal referenciapersonal) {
        return referenciaPersonalDao.save(referenciapersonal);
    }

    @Override
    @Transactional
    public void delete(Long id) {
     referenciaPersonalDao.deleteById(id);
    }
}    

