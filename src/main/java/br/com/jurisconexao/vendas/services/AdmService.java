/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.services;


import br.com.jurisconexao.vendas.exception.UserNotFoundException;
import br.com.jurisconexao.vendas.models.ADM;
import br.com.jurisconexao.vendas.repositories.ADMRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Marcos
 */
  @Service
public class AdmService {
      
      
      @Autowired
    private ADMRepository rp;
    
     public List<ADM> findAll() {
        return rp.findAll();
    }
     
     public ADM findCienfiloById(Integer id) {
        return rp.findADMById(id)
                .orElseThrow(() -> new UserNotFoundException("ADM by id " + id + " was not found"));
    }
     
     public ADM addADM(ADM cinefilo) {
        return rp.save(cinefilo);
    }
     
      public ADM updateADM(ADM cinefilo) {
        return rp.save(cinefilo);
    }
      
      public void deleteADM(Integer id){
        try{
          rp.deleteADMById(id);  
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityViolationException(
                    "Não foi possivel deletar o ADM");
        }
    }
      
  }
