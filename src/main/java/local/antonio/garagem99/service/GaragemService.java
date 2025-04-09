/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.antonio.garagem99.service;

import java.util.List;
import local.antonio.garagem99.entities.Veiculos;
import local.antonio.garagem99.repositories.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List <Veiculos> findAll() {
        
        List<Veiculos> result = garagemRepository.findAll();
        return result;
    }
    
}
