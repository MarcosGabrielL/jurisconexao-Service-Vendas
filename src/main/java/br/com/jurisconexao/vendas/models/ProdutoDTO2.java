/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jurisconexao.vendas.models;

import br.com.jurisconexao.vendas.file.FileDB;
import java.io.File;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class ProdutoDTO2 {
    
    
    private Long id;
    private String codigo;
    private String descricao;
    private String precoun;
    private String Ventrada;
    private float quantidade;
    private String tipo;
    private String Unidade;
    private String UnidadeTributavel;
    private String data;
    private String loja = "Sede";
    private float SubTotal;
    private String vendedor_id;
    private List<FileDB> files;
    private List<byte[]> urls;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPrecoun() {
		return precoun;
	}
	public void setPrecoun(String precoun) {
		this.precoun = precoun;
	}
	public String getVentrada() {
		return Ventrada;
	}
	public void setVentrada(String ventrada) {
		Ventrada = ventrada;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUnidade() {
		return Unidade;
	}
	public void setUnidade(String unidade) {
		Unidade = unidade;
	}
	public String getUnidadeTributavel() {
		return UnidadeTributavel;
	}
	public void setUnidadeTributavel(String unidadeTributavel) {
		UnidadeTributavel = unidadeTributavel;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public float getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(float subTotal) {
		SubTotal = subTotal;
	}
	public String getVendedor_id() {
		return vendedor_id;
	}
	public void setVendedor_id(String vendedor_id) {
		this.vendedor_id = vendedor_id;
	}
	public List<FileDB> getFiles() {
		return files;
	}
	public void setFiles(List<FileDB> files) {
		this.files = files;
	}
	public List<byte[]> getUrls() {
		return urls;
	}
	public void setUrls(List<byte[]> urls) {
		this.urls = urls;
	}
	public ProdutoDTO2(Long id, String codigo, String descricao, String precoun, String ventrada, float quantidade,
			String tipo, String unidade, String unidadeTributavel, String data, String loja, float subTotal,
			String vendedor_id, List<FileDB> files, List<byte[]> urls) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoun = precoun;
		Ventrada = ventrada;
		this.quantidade = quantidade;
		this.tipo = tipo;
		Unidade = unidade;
		UnidadeTributavel = unidadeTributavel;
		this.data = data;
		this.loja = loja;
		SubTotal = subTotal;
		this.vendedor_id = vendedor_id;
		this.files = files;
		this.urls = urls;
	}
	public ProdutoDTO2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProdutoDTO2 [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", precoun=" + precoun
				+ ", Ventrada=" + Ventrada + ", quantidade=" + quantidade + ", tipo=" + tipo + ", Unidade=" + Unidade
				+ ", UnidadeTributavel=" + UnidadeTributavel + ", data=" + data + ", loja=" + loja + ", SubTotal="
				+ SubTotal + ", vendedor_id=" + vendedor_id + ", files=" + files + ", urls=" + urls + "]";
	}

   
    
    
}
