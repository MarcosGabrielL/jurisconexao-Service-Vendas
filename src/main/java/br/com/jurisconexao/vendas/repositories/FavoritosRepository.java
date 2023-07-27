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
public interface FavoritosRepository extends JpaRepository<Favotitos, Long> {
    
     Optional<Favotitos> findFavoritosById(Long id);
     
     void deleteFavoritosById(Long id);
     
      @Query("SELECT u FROM Favotitos u WHERE u.idpost = ?1  order by u.id")
      List<Favotitos> findByIdProduto(String id);

      @Query("SELECT CASE WHEN EXISTS (SELECT u FROM Favotitos u WHERE u.idpost = ?1 and u.idcliente=?2 ) THEN TRUE ELSE FALSE END")
      boolean existsByVendedor(String produto, String cliente);
}

    
    

