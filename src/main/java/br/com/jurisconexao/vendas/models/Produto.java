/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.models;

import jakarta.persistence.*;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "produtos")
public class Produto {
    
   
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, unique = false, length = 30)
    private String codigo;
    @Column(nullable = false, unique = false, length = 300)
    private String descricao;
    @Column(nullable = false, unique = false, length = 100)
    private String precoun;
    @Column(nullable = true, unique = false, length = 100)
    private String Ventrada;
    @Column(nullable = false, unique = false, length = 100)
    private float quantidade;
    @Column(nullable = false, unique = false, length = 100)
    private String tipo;
    @Column(nullable = true, unique = false, length = 100)
    private String Unidade;
    @Column(nullable = true, unique = false, length = 20)
    private String UnidadeTributavel;
    @Column(nullable = false, unique = false, length = 20)
    private String data;
    @Column(nullable = true, unique = false, length = 20)
    private String loja = "Sede";
    @Column(nullable = true, unique = false, length = 20)
    private float SubTotal;
    
    @Column(nullable = false, unique = false, length = 20)
    private String vendedor_id;
    @Column(nullable = true, unique = false, length = 20)
    private String CST;
    @Column(nullable = true, unique = false, length = 20)
    private String CFOP;
    @Column(nullable = true, unique = false, length = 20)
    private String BaseICMS;
    @Column(nullable = true, unique = false, length = 20)
    private String ICMS;
    @Column(nullable = true, unique = false, length = 20)
    private String AliquotaICMS;
    
    @Column(nullable = true, unique = false, length = 20)
    private String CEST;
    @Column(nullable = true, unique = false, length = 20)
    private String CEAN;
    @Column(nullable = true, unique = false, length = 20)
    private String CEANTrib;
    @Column(nullable = true, unique = false, length = 20)
    private String QTrib;
    @Column(nullable = true, unique = false, length = 20)
    private String VUnTrib;
    
@Column(nullable = true, unique = false, length = 20)
    private int Item;

    @Column(nullable = true, unique = false, length = 20)
    private String BCICMS;
    @Column(nullable = true, unique = false, length = 20)
    private String BCICMSST;
    @Column(nullable = true, unique = false, length = 20)
    private String PMVAST;
    @Column(nullable = true, unique = false, length = 20)
    private String PRedBCST;
    @Column(nullable = true, unique = false, length = 20)
    private String VBCST;
    @Column(nullable = true, unique = false, length = 20)
    private String PICMSST;//Valor
    @Column(nullable = true, unique = false, length = 20)
    private String VICMSST;//Percentual
    @Column(nullable = true, unique = false, length = 20)
    private String PRedBC;
    @Column(nullable = true, unique = false, length = 20)
    private String PDif;
    @Column(nullable = true, unique = false, length = 20)
    private String VICMSDif;
    @Column(nullable = true, unique = false, length = 20)
    private String VICMS;
    @Column(nullable = true, unique = false, length = 20)
    private String PCredSN;
    @Column(nullable = true, unique = false, length = 20)
    private String VCredICMSSN;
    
    @Column(nullable = true, unique = false, length = 20)
    private String CSTPIS;
    @Column(nullable = true, unique = false, length = 20)
    private String VBCPIS;
    @Column(nullable = true, unique = false, length = 20)
    private String PPIS;
    @Column(nullable = true, unique = false, length = 20)
    private String VPIS;
    
    @Column(nullable = true, unique = false, length = 20)
    private String CSTCOFINS;
    @Column(nullable = true, unique = false, length = 20)
    private String VBCCOFINS;
    @Column(nullable = true, unique = false, length = 20)
    private String PCOFINS;
    @Column(nullable = true, unique = false, length = 20)
    private String VCOFINS;
    
    @Column(nullable = true, unique = false, length = 20)
    private String AFederalN;
    @Column(nullable = true, unique = false, length = 20)
    private String AFederalI;
    @Column(nullable = true, unique = false, length = 20)
    private String AEstadual;
    @Column(nullable = true, unique = false, length = 20)
    private String AMunicipal;
    
    @Column(nullable = false, unique = false, length = 20)
    private Boolean destaque;

    public Produto() {
        super();
    }

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

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getBaseICMS() {
		return BaseICMS;
	}

	public void setBaseICMS(String baseICMS) {
		BaseICMS = baseICMS;
	}

	public String getICMS() {
		return ICMS;
	}

	public void setICMS(String iCMS) {
		ICMS = iCMS;
	}

	public String getAliquotaICMS() {
		return AliquotaICMS;
	}

	public void setAliquotaICMS(String aliquotaICMS) {
		AliquotaICMS = aliquotaICMS;
	}

	public String getCEST() {
		return CEST;
	}

	public void setCEST(String cEST) {
		CEST = cEST;
	}

	public String getCEAN() {
		return CEAN;
	}

	public void setCEAN(String cEAN) {
		CEAN = cEAN;
	}

	public String getCEANTrib() {
		return CEANTrib;
	}

	public void setCEANTrib(String cEANTrib) {
		CEANTrib = cEANTrib;
	}

	public String getQTrib() {
		return QTrib;
	}

	public void setQTrib(String qTrib) {
		QTrib = qTrib;
	}

	public String getVUnTrib() {
		return VUnTrib;
	}

	public void setVUnTrib(String vUnTrib) {
		VUnTrib = vUnTrib;
	}

	public int getItem() {
		return Item;
	}

	public void setItem(int item) {
		Item = item;
	}

	public String getBCICMS() {
		return BCICMS;
	}

	public void setBCICMS(String bCICMS) {
		BCICMS = bCICMS;
	}

	public String getBCICMSST() {
		return BCICMSST;
	}

	public void setBCICMSST(String bCICMSST) {
		BCICMSST = bCICMSST;
	}

	public String getPMVAST() {
		return PMVAST;
	}

	public void setPMVAST(String pMVAST) {
		PMVAST = pMVAST;
	}

	public String getPRedBCST() {
		return PRedBCST;
	}

	public void setPRedBCST(String pRedBCST) {
		PRedBCST = pRedBCST;
	}

	public String getVBCST() {
		return VBCST;
	}

	public void setVBCST(String vBCST) {
		VBCST = vBCST;
	}

	public String getPICMSST() {
		return PICMSST;
	}

	public void setPICMSST(String pICMSST) {
		PICMSST = pICMSST;
	}

	public String getVICMSST() {
		return VICMSST;
	}

	public void setVICMSST(String vICMSST) {
		VICMSST = vICMSST;
	}

	public String getPRedBC() {
		return PRedBC;
	}

	public void setPRedBC(String pRedBC) {
		PRedBC = pRedBC;
	}

	public String getPDif() {
		return PDif;
	}

	public void setPDif(String pDif) {
		PDif = pDif;
	}

	public String getVICMSDif() {
		return VICMSDif;
	}

	public void setVICMSDif(String vICMSDif) {
		VICMSDif = vICMSDif;
	}

	public String getVICMS() {
		return VICMS;
	}

	public void setVICMS(String vICMS) {
		VICMS = vICMS;
	}

	public String getPCredSN() {
		return PCredSN;
	}

	public void setPCredSN(String pCredSN) {
		PCredSN = pCredSN;
	}

	public String getVCredICMSSN() {
		return VCredICMSSN;
	}

	public void setVCredICMSSN(String vCredICMSSN) {
		VCredICMSSN = vCredICMSSN;
	}

	public String getCSTPIS() {
		return CSTPIS;
	}

	public void setCSTPIS(String cSTPIS) {
		CSTPIS = cSTPIS;
	}

	public String getVBCPIS() {
		return VBCPIS;
	}

	public void setVBCPIS(String vBCPIS) {
		VBCPIS = vBCPIS;
	}

	public String getPPIS() {
		return PPIS;
	}

	public void setPPIS(String pPIS) {
		PPIS = pPIS;
	}

	public String getVPIS() {
		return VPIS;
	}

	public void setVPIS(String vPIS) {
		VPIS = vPIS;
	}

	public String getCSTCOFINS() {
		return CSTCOFINS;
	}

	public void setCSTCOFINS(String cSTCOFINS) {
		CSTCOFINS = cSTCOFINS;
	}

	public String getVBCCOFINS() {
		return VBCCOFINS;
	}

	public void setVBCCOFINS(String vBCCOFINS) {
		VBCCOFINS = vBCCOFINS;
	}

	public String getPCOFINS() {
		return PCOFINS;
	}

	public void setPCOFINS(String pCOFINS) {
		PCOFINS = pCOFINS;
	}

	public String getVCOFINS() {
		return VCOFINS;
	}

	public void setVCOFINS(String vCOFINS) {
		VCOFINS = vCOFINS;
	}

	public String getAFederalN() {
		return AFederalN;
	}

	public void setAFederalN(String aFederalN) {
		AFederalN = aFederalN;
	}

	public String getAFederalI() {
		return AFederalI;
	}

	public void setAFederalI(String aFederalI) {
		AFederalI = aFederalI;
	}

	public String getAEstadual() {
		return AEstadual;
	}

	public void setAEstadual(String aEstadual) {
		AEstadual = aEstadual;
	}

	public String getAMunicipal() {
		return AMunicipal;
	}

	public void setAMunicipal(String aMunicipal) {
		AMunicipal = aMunicipal;
	}

	public Boolean getDestaque() {
		return destaque;
	}

	public void setDestaque(Boolean destaque) {
		this.destaque = destaque;
	}

	public Produto(Long id, String codigo, String descricao, String precoun, String ventrada, float quantidade,
			String tipo, String unidade, String unidadeTributavel, String data, String loja, float subTotal,
			String vendedor_id, String cST, String cFOP, String baseICMS, String iCMS, String aliquotaICMS, String cEST,
			String cEAN, String cEANTrib, String qTrib, String vUnTrib, int item, String bCICMS, String bCICMSST,
			String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String pRedBC, String pDif,
			String vICMSDif, String vICMS, String pCredSN, String vCredICMSSN, String cSTPIS, String vBCPIS,
			String pPIS, String vPIS, String cSTCOFINS, String vBCCOFINS, String pCOFINS, String vCOFINS,
			String aFederalN, String aFederalI, String aEstadual, String aMunicipal, Boolean destaque) {
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
		CST = cST;
		CFOP = cFOP;
		BaseICMS = baseICMS;
		ICMS = iCMS;
		AliquotaICMS = aliquotaICMS;
		CEST = cEST;
		CEAN = cEAN;
		CEANTrib = cEANTrib;
		QTrib = qTrib;
		VUnTrib = vUnTrib;
		Item = item;
		BCICMS = bCICMS;
		BCICMSST = bCICMSST;
		PMVAST = pMVAST;
		PRedBCST = pRedBCST;
		VBCST = vBCST;
		PICMSST = pICMSST;
		VICMSST = vICMSST;
		PRedBC = pRedBC;
		PDif = pDif;
		VICMSDif = vICMSDif;
		VICMS = vICMS;
		PCredSN = pCredSN;
		VCredICMSSN = vCredICMSSN;
		CSTPIS = cSTPIS;
		VBCPIS = vBCPIS;
		PPIS = pPIS;
		VPIS = vPIS;
		CSTCOFINS = cSTCOFINS;
		VBCCOFINS = vBCCOFINS;
		PCOFINS = pCOFINS;
		VCOFINS = vCOFINS;
		AFederalN = aFederalN;
		AFederalI = aFederalI;
		AEstadual = aEstadual;
		AMunicipal = aMunicipal;
		this.destaque = destaque;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", precoun=" + precoun
				+ ", Ventrada=" + Ventrada + ", quantidade=" + quantidade + ", tipo=" + tipo + ", Unidade=" + Unidade
				+ ", UnidadeTributavel=" + UnidadeTributavel + ", data=" + data + ", loja=" + loja + ", SubTotal="
				+ SubTotal + ", vendedor_id=" + vendedor_id + ", CST=" + CST + ", CFOP=" + CFOP + ", BaseICMS="
				+ BaseICMS + ", ICMS=" + ICMS + ", AliquotaICMS=" + AliquotaICMS + ", CEST=" + CEST + ", CEAN=" + CEAN
				+ ", CEANTrib=" + CEANTrib + ", QTrib=" + QTrib + ", VUnTrib=" + VUnTrib + ", Item=" + Item
				+ ", BCICMS=" + BCICMS + ", BCICMSST=" + BCICMSST + ", PMVAST=" + PMVAST + ", PRedBCST=" + PRedBCST
				+ ", VBCST=" + VBCST + ", PICMSST=" + PICMSST + ", VICMSST=" + VICMSST + ", PRedBC=" + PRedBC
				+ ", PDif=" + PDif + ", VICMSDif=" + VICMSDif + ", VICMS=" + VICMS + ", PCredSN=" + PCredSN
				+ ", VCredICMSSN=" + VCredICMSSN + ", CSTPIS=" + CSTPIS + ", VBCPIS=" + VBCPIS + ", PPIS=" + PPIS
				+ ", VPIS=" + VPIS + ", CSTCOFINS=" + CSTCOFINS + ", VBCCOFINS=" + VBCCOFINS + ", PCOFINS=" + PCOFINS
				+ ", VCOFINS=" + VCOFINS + ", AFederalN=" + AFederalN + ", AFederalI=" + AFederalI + ", AEstadual="
				+ AEstadual + ", AMunicipal=" + AMunicipal + ", destaque=" + destaque + "]";
	}

   
    
    
}
