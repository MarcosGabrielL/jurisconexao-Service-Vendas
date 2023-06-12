/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.repositories;


import br.com.jurisconexao.vendas.models.ADM;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcos
 */
@Repository
public interface ADMRepository extends JpaRepository<ADM, Long> {
    
     Optional<ADM> findADMById(Integer id);
     
     void deleteADMById(Integer id);
}
