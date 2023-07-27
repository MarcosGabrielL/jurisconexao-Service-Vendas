/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.repositories;

import br.com.jurisconexao.vendas.models.*;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcos
 */
@Repository
public interface CoresRepository extends JpaRepository<Cores, Long> {
    
     Optional<Cores> findCoresById(Long id);
     
     void deleteCoresById(Long id);
     
      @Query("SELECT u FROM Cores u WHERE u.idpost = ?1  order by u.id")
      List<Cores> findByIdProduto(String id);

}

    
    

