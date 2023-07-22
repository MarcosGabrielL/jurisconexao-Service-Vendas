/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.file;

/**
 *
 * @author Marcos
 */

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, Long> {
    
     @Query("SELECT u FROM FileDB u WHERE u.idpost = ?1")
     public  List<FileDB> findByIdProduto(String idpost);
     
     @Query("SELECT u FROM FileDB u WHERE u.idvendedor = ?1 AND u.type != 'banner'")
     public  List<FileDB> findByIdVendedor(String idvendedor);
     
     @Query("SELECT u FROM FileDB u WHERE u.idvendedor = ?1  AND u.type = 'banner'")
     public  List<FileDB> findBannerByIdProduto(String idpost);
     
     @Modifying
     @Query("DELETE FROM FileDB u WHERE u.idvendedor = ?1 AND u.type = 'banner'")
     void deleteBannersFromVendedor(String idvendedor);

}

