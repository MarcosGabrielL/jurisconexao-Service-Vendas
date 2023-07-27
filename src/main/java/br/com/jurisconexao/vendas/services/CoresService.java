/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.services;

import br.com.jurisconexao.vendas.exception.UserNotFoundException;
import br.com.jurisconexao.vendas.models.Cores;
import br.com.jurisconexao.vendas.repositories.CoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcos
 */
 @Service
public class CoresService {
    
    @Autowired
    private CoresRepository rp;
    
     public List<Cores> findAll() {
        return rp.findAll();
    }
     
     public Cores findCoresById(Long id) {
        return rp.findCoresById(id)
                .orElseThrow(() -> new UserNotFoundException("Cores by id " + id + " was not found"));
    }
     
     public List<Cores> findByIdProduto(String id) {
        return rp.findByIdProduto(id);
    }
     
     public Cores addCores(Cores cinefilo) {
        return rp.save(cinefilo);
    }
     
      public Cores updateCores(Cores cinefilo) {
        return rp.save(cinefilo);
    }
      
      public void deleteCores(Long id){
        try{
          rp.deleteCoresById(id);  
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityViolationException(
                    "Não foi possivel deletar o Cores");
        }
    }

    
}
