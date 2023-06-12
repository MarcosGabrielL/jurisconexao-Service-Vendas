/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.Payment.models;

import jakarta.persistence.*;

/**
 *
 * @author Marcos
 */
@Entity
public class PayIdExternal {
    
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
     public String type;

    public PayIdExternal() {
        super();
    }

    public PayIdExternal(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
     

    
}
