package com.pruebatecnica.pruebatecnica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.pruebatecnica.models.Cliente;
import com.pruebatecnica.pruebatecnica.models.services.IClienteService;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api")
@CrossOrigin(origins =  "http://localhost:4200/")
public class ClienteController {

    @Autowired
    IClienteService clienteService;
    
    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente findClienteById(@PathVariable Long id) {
     return clienteService.findByid(id);
    }

    @PostMapping("/clientes")
    public Cliente postCliente(@RequestBody Cliente cliente)  {
      return clienteService.save(cliente);
    }

    @PutMapping("clientes/{id}")
    public Cliente putCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteActual = clienteService.findByid(id);

        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setCiudad(cliente.getCiudad());
        clienteActual.setNumeroDocumento(cliente.getNumeroDocumento());
        clienteActual.setResidencia(cliente.getResidencia());
        clienteActual.setTelefono(cliente.getTelefono());
        clienteActual.setTipoDocumento(cliente.getTipoDocumento());

        return clienteService.save(clienteActual);
    }

    @DeleteMapping("/clientes/{id}")
        public void eliminarCliente(@PathVariable Long id){
            clienteService.delete(id);
        } 

    
    
}
