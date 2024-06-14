package com.pruebatecnica.pruebatecnica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.pruebatecnica.models.Cliente;
import com.pruebatecnica.pruebatecnica.models.ReferenciaPersonal;
import com.pruebatecnica.pruebatecnica.models.services.IClienteService;
import com.pruebatecnica.pruebatecnica.models.services.IReferenciaPersonalService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api")
public class ReferenciaPersonalController {

    @Autowired 
    IReferenciaPersonalService referenciaPersonalService;

      @Autowired
    IClienteService clienteService;

    @GetMapping("/referenciaspersonales")
    public List<ReferenciaPersonal>  findAllRp() {
        return referenciaPersonalService.findAll();
    }

    @GetMapping("/referenciaspersonales/{id}")
    public ReferenciaPersonal findReferenciaPersonalByid(@PathVariable Long id)
    {
        return referenciaPersonalService.findByid(id);
    }
    
     @PostMapping("referenciaspersonales/{clienteId}")
    public ReferenciaPersonal createReferenciaPersonal(@PathVariable Long clienteId, @RequestBody ReferenciaPersonal referenciaPersonal) {
        Cliente cliente = clienteService.findByid(clienteId);
        if (cliente != null) {
            referenciaPersonal.setCliente(cliente);
            return referenciaPersonalService.save(referenciaPersonal);
        }
        return null;
    }

    @PutMapping("referenciasPersonales/{id}")
    public ReferenciaPersonal putReferenciaPersonal(@PathVariable Long id, @RequestBody ReferenciaPersonal referenciaPersonal) {
        ReferenciaPersonal referenciaActual = referenciaPersonalService.findByid(id);

        referenciaActual.setCiudad(referenciaPersonal.getCiudad());
        referenciaActual.setCliente(referenciaPersonal.getCliente());
        referenciaActual.setDireccion(referenciaPersonal.getDireccion());
        referenciaActual.setEmail(referenciaPersonal.getEmail());
        referenciaActual.setNombre(referenciaPersonal.getNombre());
        referenciaActual.setTelefono(referenciaPersonal.getTelefono());

        return referenciaPersonalService.save(referenciaActual);
    }

    @DeleteMapping("/referenciasPersonales/{id}")
    public void deleteReferenciasPersonales(@PathVariable Long id) 
    {
       referenciaPersonalService.delete(id);
    }

}
