/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.models;

import java.util.List;

import jakarta.persistence.*;

/**
 *
 * @author Marcos
 */
@Entity
public class Cores {
    
     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
     @Column(nullable = false, unique = true, length = 30)
   private String idpost;
   private List<String> cores;
   private boolean hasvariedade;
   @Column(nullable = false, unique = false, length = 30)
   private String vendedorid;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getIdpost() {
	return idpost;
}
public void setIdpost(String idpost) {
	this.idpost = idpost;
}
public List<String> getCores() {
	return cores;
}
public void setCores(List<String> cores) {
	this.cores = cores;
}
public boolean isHasvariedade() {
	return hasvariedade;
}
public void setHasvariedade(boolean hasvariedade) {
	this.hasvariedade = hasvariedade;
}
public String getVendedorid() {
	return vendedorid;
}
public void setVendedorid(String vendedorid) {
	this.vendedorid = vendedorid;
}
public Cores(Long id, String idpost, List<String> cores, boolean hasvariedade, String vendedorid) {
	super();
	this.id = id;
	this.idpost = idpost;
	this.cores = cores;
	this.hasvariedade = hasvariedade;
	this.vendedorid = vendedorid;
}
public Cores() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Cores [id=" + id + ", idpost=" + idpost + ", cores=" + cores + ", hasvariedade=" + hasvariedade
			+ ", vendedorid=" + vendedorid + "]";
}
   

   
    
    
}
