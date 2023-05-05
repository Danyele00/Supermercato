package com.BcSoft.ih.testfinale.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="articolo")
public class Articolo {

	@Id
	@Column(name = "CODART", nullable = false)
	private String codArt;
	
	@Column(name = "DESCRIZIONE")
	private String descrizione;
	
	@Column(name = "UM")
	private String um;
	
	@Column(name = "CODSTAT")
	private String codStat;
	
	@Column(name = "PZCART")
	private Integer pzCart;
	
	@Column(name = "PESONETTO")
	private Integer pesoNetto;
	
	@Column(name = "IDIVA")
	private Integer idIva;
	
	@Column(name = "IDSTATOART")
	private String idStatOArt;
	
	@Column(name = "DATACREAZIONE")
	@Temporal(TemporalType.DATE)
	private Date dataCreazione;
	
	@Column(name = "IDFAMASS")
	private Integer idFamass;
		

	public Articolo() {
		super();
	}

	public Articolo(String codArt, String descrizione, String um, String codStat, int pzCart, int pesoNetto, int idIva,
			String idStatOArt, Date dataCreazione, int idFamass) {
		super();
		this.codArt = codArt;
		this.descrizione = descrizione;
		this.um = um;
		this.codStat = codStat;
		this.pzCart = pzCart;
		this.pesoNetto = pesoNetto;
		this.idIva = idIva;
		this.idStatOArt = idStatOArt;
		this.dataCreazione = dataCreazione;
		this.idFamass = idFamass;
	}




	@Override
	public String toString() {
		return "Articolo [codArt=" + codArt + ", descrizione=" + descrizione + ", um=" + um + ", codStat=" + codStat
				+ ", pzCart=" + pzCart + ", idIva=" + idIva + ", idStatOArt=" + idStatOArt + ", dataCreazione="
				+ dataCreazione + "]";
	}

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public String getCodStat() {
		return codStat;
	}

	public void setCodStat(String codStat) {
		this.codStat = codStat;
	}

	public Integer getPzCart() {
		return pzCart;
	}

	public void setPzCart(Integer pzCart) {
		this.pzCart = pzCart;
	}

	public Integer getPesoNetto() {
		return pesoNetto;
	}

	public void setPesoNetto(Integer pesoNetto) {
		this.pesoNetto = pesoNetto;
	}

	public Integer getIdIva() {
		return idIva;
	}

	public void setIdIva(Integer idIva) {
		this.idIva = idIva;
	}

	public String getIdStatOArt() {
		return idStatOArt;
	}

	public void setIdStatOArt(String idStatOArt) {
		this.idStatOArt = idStatOArt;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Integer getIdFamass() {
		return idFamass;
	}

	public void setIdFamass(Integer idFamass) {
		this.idFamass = idFamass;
	}



}
