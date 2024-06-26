/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.Payment.models;

import jakarta.persistence.*;

/**
 *
 * @author Marcos
 */@Entity
public class AutorizationCode {
    
      @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
      
    public String code;
    public String state;

    public AutorizationCode() {
        super();
    }

    public AutorizationCode(Long id, String code, String state) {
        this.id = id;
        this.code = code;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    
    
    
}
