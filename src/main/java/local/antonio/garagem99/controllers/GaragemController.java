/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.antonio.garagem99.controllers;

import java.util.List;
import local.antonio.garagem99.DTO.VeiculoDTO;
import local.antonio.garagem99.entities.Veiculos;
import local.antonio.garagem99.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    @GetMapping ("/forsale")
    public ResponseEntity<List<VeiculoDTO>> findAll() {
        List<VeiculoDTO> result = garagemService.findAll();
        
        if (result.isEmpty()) {
            // Lista vazia, retornando 404
            return ResponseEntity.notFound().build();
        } else {
            // Dados encontrados, retornando 200
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping ("/forsale/{id}")
    public ResponseEntity<List<Veiculos>> findById(@PathVariable long id) {
        List<Veiculos> result = garagemService.findById(id);
       
        if (result.isEmpty()) {
            // Lista vazia, retornando 404
            return ResponseEntity.notFound().build();
        } else {
            // Dados encontrados, retornando 200
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping ("/color/{cor}")
    public ResponseEntity<List<VeiculoDTO>>findByCorIgnoreCase(@PathVariable String cor) {
        List<VeiculoDTO> result = garagemService.findByCor(cor);

        
        if (result.isEmpty()) {
            // Lista vazia, retornando 404
            return ResponseEntity.notFound().build();
        } else {
            // Dados encontrados, retornando 200
            return ResponseEntity.ok(result);
        }
        
        
    }
    @GetMapping ("/year/{ano}")
    public ResponseEntity<List<VeiculoDTO>> findByAno(@PathVariable int ano) {
        List<VeiculoDTO> result = garagemService.findByAno(ano);
        
        if (result.isEmpty()) {
            // Lista vazia, retornando 404
            return ResponseEntity.notFound().build();
        } else {
            // Dados encontrados, retornando 200
            return ResponseEntity.ok(result);
        }
    }
    
    
    
}   
