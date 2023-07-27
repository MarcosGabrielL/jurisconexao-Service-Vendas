/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.services;

import br.com.jurisconexao.vendas.exception.UserNotFoundException;
import br.com.jurisconexao.vendas.models.Favotitos;
import br.com.jurisconexao.vendas.repositories.FavoritosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcos
 */
 @Service
public class FavoritosService {
    
    @Autowired
    private FavoritosRepository rp;
    
     public List<Favotitos> findAll() {
        return rp.findAll();
    }
     
     public Favotitos findFavoritosById(Long id) {
        return rp.findFavoritosById(id)
                .orElseThrow(() -> new UserNotFoundException("Favoritos by id " + id + " was not found"));
    }
     
     public List<Favotitos> findByIdProduto(String id) {
        return rp.findByIdProduto(id);
    }
     
     public Favotitos addFavoritos(Favotitos cinefilo) {
        return rp.save(cinefilo);
    }
     
      public Favotitos updateFavoritos(Favotitos cinefilo) {
        return rp.save(cinefilo);
    }
      
      public void deleteFavoritos(Long id){
        try{
          rp.deleteFavoritosById(id);  
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityViolationException(
                    "Não foi possivel deletar o Favoritos");
        }
    }

	public boolean existsByVendedor(String idproduto, String idcliente) {
		 return rp.existsByVendedor(idproduto,idcliente);
	}

    
}
