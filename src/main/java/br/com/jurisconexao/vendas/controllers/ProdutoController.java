/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */

import br.com.jurisconexao.vendas.file.FileDB;
import br.com.jurisconexao.vendas.file.FileStorageService;
import br.com.jurisconexao.vendas.models.Product;
import br.com.jurisconexao.vendas.models.Produto;
import br.com.jurisconexao.vendas.models.ProdutoDTO;
import br.com.jurisconexao.vendas.models.ProdutoDTO2;
import br.com.jurisconexao.vendas.repositories.ProdutoRepository;
import br.com.jurisconexao.vendas.services.CoresService;
import br.com.jurisconexao.vendas.services.FavoritosService;
import br.com.jurisconexao.vendas.services.ProdutoService;
import br.com.jurisconexao.vendas.util.validateToken;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    
     @Autowired
    private ProdutoService vs;
     
     @Autowired
     private validateToken validatetoken;
     
      @Autowired
  private FileStorageService storageService;
      
      @Autowired
      private CoresService coresService;
      
      @Autowired
      private FavoritosService favoritoService;
     
    @GetMapping
    public ResponseEntity<List<Produto>> getAll() {
        List<Produto> produtos =  vs.findAll();
        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }
    
    //GEt Produto
    @GetMapping(path = "/produto")
    public ResponseEntity<Produto> getCienfiloById (
            @RequestParam("token") String token,
            @RequestParam("id") Long id) {
        
        
        
       // if(!validatetoken.isLogged(token)){
         //    throw new IllegalStateException("token not valid");
       // }
        
        Produto produto = vs.findProdutoById(id);
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

	@GetMapping("/produto/byvendedor")
    public ResponseEntity<List<Produto>> getProdutoByIdVendedor (
            @RequestParam("token") String token,
            @RequestParam("id") String id) {
        
        
        
       // if(!validatetoken.isLogged(token)){
         //    throw new IllegalStateException("token not valid");
       // }
        
        List<Produto> produtos = vs.findProdutoByIdVendedor(id);
        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }
    
    @GetMapping("/produtodto/byvendedor")
    public ResponseEntity<List<ProdutoDTO>> getProdutoDAOByIdVendedor (
            @RequestParam("token") String token,
            @RequestParam("id") String id) {
        
        
        
       // if(!validatetoken.isLogged(token)){
         //    throw new IllegalStateException("token not valid");
       // }
       
        List<Produto> produtos = vs.findProdutoByIdVendedor(id);
        
        List<ProdutoDTO> produtosdao = new ArrayList();
        
        for(Produto p: produtos){
            ProdutoDTO pdao = new ProdutoDTO();
            pdao.setId(p.getId());
            pdao.setCodigo(p.getCodigo());
            pdao.setDescricao(p.getDescricao());
            pdao.setPrecoun(p.getPrecoun());
            pdao.setQuantidade(p.getQuantidade());
            pdao.setTipo(p.getTipo());
            pdao.setUnidade(p.getUnidade());
            pdao.setData(p.getData());
            pdao.setVendedor_id(p.getVendedor_id());
            
            List<FileDB> files = storageService.findByIdProduto(p.getId().toString());
            pdao.setFiles(files);
            
             System.out.println("Pdao Files"+pdao.getFiles());
            for(FileDB d: files){
            System.out.println("Files: "+ d.getName());
                    }
            
            List<String> urls = new ArrayList();
            for(FileDB f: files){
                urls.add("data:image/png;base64,"+Arrays.toString(f.getData()));
            }
            pdao.setUrls(urls);
            
             System.out.println("Files"+pdao.getUrls());
            
            produtosdao.add(pdao);
        }
        
        
        return new ResponseEntity<>(produtosdao, HttpStatus.OK);
    }
    
    
    @PostMapping("/produto/add")
    public ResponseEntity<Produto> addProduto(@RequestBody Produto produto
    ,@RequestParam("token") String token,
    @RequestParam("vendedorid") String id) {
        
       // if(!validatetoken.isLogged(token)){
        //     throw new IllegalStateException("token not valid");
      //  }
      
      System.out.println("ID Vendedor: "+id);
       produto.setVendedor_id(id);
        Produto newProduto = vs.addProduto(produto);
        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest().path("/produto/{id}").buildAndExpand(produto.getId()).toUri();
        
        return new ResponseEntity<>(newProduto, HttpStatus.CREATED);
    }
    
    //Update nome,telefone,idade,foto;
    @PutMapping("/produto/update/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable("id") Long id, 
            @RequestBody Produto newproduto, 
            @RequestParam("token") String token) {
        
        if(!validatetoken.isLogged(token)){
             throw new IllegalStateException("token not valid");
        }
        
        
        Produto produto = vs.findProdutoById(id);
        produto.setDescricao(newproduto.getDescricao());
        produto.setQuantidade(newproduto.getQuantidade());
        produto.setPrecoun(newproduto.getPrecoun());
        produto.setUnidade(newproduto.getUnidade());
        //produto.setFoto(newproduto.getFoto);
        
        Produto updateProduto = vs.updateProduto(produto);//s
        return new ResponseEntity<>(updateProduto, HttpStatus.OK);
    }
    
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduto(@PathVariable("id") Long id,
            @RequestParam("token") String token) {
        
        if(!validatetoken.isLogged(token)){
             throw new IllegalStateException("token not valid");
        }
        
        vs.deleteProduto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("destaque/produtodto/byvendedor")
    public ResponseEntity<List<ProdutoDTO2>> getProdutoDestaqueDAOByIdVendedor (
            @RequestParam("token") String token,
            @RequestParam("id") String id) {
        
    	  
      
       List<Produto> produtos = vs.findProdutosDestacadosByIdVendedor(id);
       
       List<ProdutoDTO2> produtosdao = new ArrayList();
       
       for(Produto p: produtos){
    	   ProdutoDTO2 pdao = new ProdutoDTO2();
           pdao.setId(p.getId());
           pdao.setCodigo(p.getCodigo());
           pdao.setDescricao(p.getDescricao());
           pdao.setPrecoun(p.getPrecoun());
           pdao.setQuantidade(p.getQuantidade());
           pdao.setTipo(p.getTipo());
           pdao.setUnidade(p.getUnidade());
           pdao.setData(p.getData());
           pdao.setVendedor_id(p.getVendedor_id());
           
           List<FileDB> files = storageService.findByIdProduto(p.getId().toString());
          
           
           List<byte[]> urls = new ArrayList();
           for(FileDB f: files){
               urls.add(f.getData());
           }
           pdao.setUrls(urls);
           
            System.out.println("Files"+pdao.getUrls());
           
           produtosdao.add(pdao);
       }
       
        
        return new ResponseEntity<>(produtosdao, HttpStatus.OK);
    }
    
    @GetMapping("destaque/produtodetails/by/vendedor/cliente")
    public ResponseEntity<List<Product>> getAllProductsByIdVendedor (
            @RequestParam("token") String token,
            @RequestParam("idvendedor") String idvendedor,
            @RequestParam("idcliente") String idcliente) {
        
    	  
      
       List<Produto> produtos = vs.findProdutoByIdVendedor(idvendedor);
       
       List<Product> produtosdao = new ArrayList();
       
       for(Produto p: produtos){
    	   Product pdao = new Product();
           pdao.setId(p.getId());
           pdao.setCodigo(p.getCodigo());
           pdao.setDescricao(p.getDescricao());
           pdao.setPrecoun(p.getPrecoun());
           pdao.setQuantidade(p.getQuantidade());
           pdao.setTipo(p.getTipo());
           pdao.setUnidade(p.getUnidade());
           pdao.setData(p.getData());
           pdao.setVendedor_id(p.getVendedor_id());
           pdao.setDestaque(p.getDestaque());
           
           List<FileDB> files = storageService.findByIdProduto(p.getId().toString());
           List<byte[]> urls = new ArrayList();
           for(FileDB f: files){
               urls.add(f.getData());
           }
           pdao.setUrls(urls);
           pdao.setCores(coresService.findByIdProduto(p.getId().toString()));
           pdao.setFavorito(favoritoService.existsByVendedor(p.getId().toString(),idcliente));
           
           produtosdao.add(pdao);
       }
       
        
        return new ResponseEntity<>(produtosdao, HttpStatus.OK);
    }
    
}

