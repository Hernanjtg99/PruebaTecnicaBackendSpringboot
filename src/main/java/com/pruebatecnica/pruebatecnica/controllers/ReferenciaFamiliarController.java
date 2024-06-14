package com.pruebatecnica.pruebatecnica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebatecnica.pruebatecnica.models.Cliente;
import com.pruebatecnica.pruebatecnica.models.ReferenciaFamiliar;
import com.pruebatecnica.pruebatecnica.models.ReferenciaPersonal;
import com.pruebatecnica.pruebatecnica.models.dao.IReferenciaFamiliar;
import com.pruebatecnica.pruebatecnica.models.services.IClienteService;
import com.pruebatecnica.pruebatecnica.models.services.IReferenciaFamiliarService;

@Controller
@RequestMapping("/api")
public class ReferenciaFamiliarController {
    
    @Autowired
    IReferenciaFamiliarService referenciaFamiliarService;

       @Autowired
    IClienteService clienteService;

    @GetMapping("/referenciasFamiliares")
    public List<ReferenciaFamiliar>  findAllRf() {
        return referenciaFamiliarService.findAll();
    }

    @GetMapping("/referenciasFamiliares/{id}")
    public ReferenciaFamiliar findReferenciaFamiliarByid(@PathVariable Long id)
    {
        return referenciaFamiliarService.findByid(id);
    }
    
     @PostMapping("referenciasFamiliares/{clienteId}")
    public ReferenciaFamiliar createReferenciaFamiliar(@PathVariable Long clienteId, @RequestBody ReferenciaFamiliar referenciaFamiliar) {
        Cliente cliente = clienteService.findByid(clienteId);
        if (cliente != null) {
            referenciaFamiliar.setCliente(cliente);
            return referenciaFamiliarService.save(referenciaFamiliar);
        }
        return null;
    }

    @PutMapping("referenciasFamiliares/{id}")
    public ReferenciaFamiliar putReferenciaFamiliar(@PathVariable Long id, @RequestBody ReferenciaFamiliar referenciaFamiliar) { 
        ReferenciaFamiliar referenciaActual = referenciaFamiliarService.findByid(id);

        referenciaActual.setCiudad(referenciaFamiliar.getCiudad());
        referenciaActual.setCliente(referenciaFamiliar.getCliente());
        referenciaActual.setDireccion(referenciaFamiliar.getDireccion());
        referenciaActual.setEmail(referenciaFamiliar.getEmail());
        referenciaActual.setNombre(referenciaFamiliar.getNombre());
        referenciaActual.setTelefono(referenciaFamiliar.getTelefono());

        return referenciaFamiliarService.save(referenciaActual);
    }

    @DeleteMapping("/referenciasFamiliares/{id}")
    public void deleteReferenciasFamiliares(@PathVariable Long id) 
    {
       referenciaFamiliarService.delete(id);
    }
}
