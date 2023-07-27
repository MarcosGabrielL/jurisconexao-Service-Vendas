/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.models;

/**
 *
 * @author Marcos
 */
import java.util.Objects;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "favoritos")
public class Favotitos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = false, length = 30)
	private String idpost;
	@Column(nullable = false, unique = false, length = 30)
	private String idvendedor;
	@Column(nullable = false, unique = false, length = 30)
	private String idcliente;
	@Column(nullable = false, unique = false, length = 30)
	private boolean favorito;
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
	public String getIdvendedor() {
		return idvendedor;
	}
	public void setIdvendedor(String idvendedor) {
		this.idvendedor = idvendedor;
	}
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public boolean isFavorito() {
		return favorito;
	}
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
	public Favotitos(Long id, String idpost, String idvendedor, String idcliente, boolean favorito) {
		super();
		this.id = id;
		this.idpost = idpost;
		this.idvendedor = idvendedor;
		this.idcliente = idcliente;
		this.favorito = favorito;
	}
	public Favotitos() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
