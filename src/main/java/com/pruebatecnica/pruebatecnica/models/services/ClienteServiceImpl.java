package com.pruebatecnica.pruebatecnica.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.pruebatecnica.models.Cliente;
import com.pruebatecnica.pruebatecnica.models.dao.IClienteDao;

import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    @Transactional
    public Cliente findByid(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
       return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
       clienteDao.deleteById(id);
    }
    
}
