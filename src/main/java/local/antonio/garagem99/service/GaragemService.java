/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.antonio.garagem99.service;

import jakarta.persistence.Id;
import java.util.List;
import local.antonio.garagem99.DTO.VeiculoDTO;
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
    
    public List <VeiculoDTO> findAll() {
        
        List<Veiculos> resultGaragem = garagemRepository.findAll();
        List<VeiculoDTO> resultDTO = resultGaragem.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        return resultDTO;
    }
    
    public List<Veiculos>findById(long id) {
        List<Veiculos> result = garagemRepository.findById(id);
        return result;
    }
    
    public List<VeiculoDTO> findByCor (String cor) {
        List<Veiculos> resultGaragem = garagemRepository.findByCorIgnoreCase(cor);
     
        List<VeiculoDTO> resultDTO = resultGaragem.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        
        return resultDTO;
    }
    
    public List<VeiculoDTO> findByAno(int ano) {
         List<Veiculos> resultGaragem = garagemRepository.findByAno(ano);
        
        List<VeiculoDTO> resultDTO = resultGaragem.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        
        return resultDTO;
        
    }
    
    
    
}
