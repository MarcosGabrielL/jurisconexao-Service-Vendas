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
import java.util.Objects;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class FileDB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String idpost;
	@Column(nullable = true, unique = false, length = 30)
	private String idvendedor;
	@Column(nullable = true, unique = false, length = 30)
	private String idbanner;
	private String type;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "DATA", columnDefinition = "LONGBLOB", nullable = false)
	private byte[] data;

	public FileDB() {
	}

	

	public FileDB(Long id, String name, String idpost, String idvendedor, String idbanner, String type, byte[] data) {
		super();
		this.id = id;
		this.name = name;
		this.idpost = idpost;
		this.idvendedor = idvendedor;
		this.idbanner = idbanner;
		this.type = type;
		this.data = data;
	}



	public String getIdbanner() {
		return idbanner;
	}



	public void setIdbanner(String idbanner) {
		this.idbanner = idbanner;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}



}
