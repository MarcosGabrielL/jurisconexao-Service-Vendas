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
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
     Optional<Produto> findProdutoById(Long id);
     
     void deleteProdutoById(Long id);
     
      @Query("SELECT u FROM Produto u WHERE u.vendedor_id = ?1  order by u.id")
      Optional<List<Produto>> findProdutoByIdVendedor(String id);

      @Query("SELECT u FROM Produto u WHERE u.vendedor_id = ?1 AND u.destaque = true order by u.id")
      List<Produto> findProdutosDestacadosByIdVendedor(String id);
}

    
    

