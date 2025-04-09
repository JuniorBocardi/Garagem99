/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.antonio.garagem99.controllers;

import java.util.List;
import local.antonio.garagem99.entities.Veiculos;
import local.antonio.garagem99.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Veiculos> findAll() {
        List<Veiculos> result = garagemService.findAll();
        return result;
    }
    
}
