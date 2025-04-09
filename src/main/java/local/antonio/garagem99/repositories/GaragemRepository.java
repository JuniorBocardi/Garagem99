/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.antonio.garagem99.repositories;

import java.util.List;
import local.antonio.garagem99.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface GaragemRepository extends JpaRepository<Veiculos, Long>{
    
    List<Veiculos> findById(long id);
    
}
