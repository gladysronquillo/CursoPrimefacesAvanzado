package com.kodigo.model;

import java.io.Serializable;
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
@Table(name = "serologia")
public class Serologia implements Serializable {

	private static final long serialVersionUID = -6593903181636405971L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_serologia")
	private int idSerologia;

	@Column(name="aglutinaciones")
	private String aglutinaciones;

	@Column(name="asto_cuantitativo")
	private String astoCuantitativo;

	@Column(name="brucella_abortus")
	private String brucellaAbortus;

	@Column(name="brucellosis")
	private String brucellosis;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;

	@Column(name="fr_cuantitativo")
	private String frCuantitativo;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="latex_cuantitativo")
	private String latexCuantitativo;

	@Column(name="mucoproteinas")
	private String mucoproteinas;

	@Column(name="paratifico_a")
	private String paratificoA;

	@Column(name="paratifico_b")
	private String paratificoB;

	@Column(name="pcr_cuantitativo")
	private String pcrCuantitativo;

	@Column(name="proteus_ox19")
	private String proteusOx19;

	@Column(name="tifico_h")
	private String tificoH;

	@Column(name="tifico_o")
	private String tificoO;

	@Column(name="vdrl")
	private String vdrl;

	@Column(name="waller_rose")
	private String wallerRose;

	public Serologia() {
	}

	public int getIdSerologia() {
		return this.idSerologia;
	}

	public void setIdSerologia(int idSerologia) {
		this.idSerologia = idSerologia;
	}

	public String getAglutinaciones() {
		return this.aglutinaciones;
	}

	public void setAglutinaciones(String aglutinaciones) {
		this.aglutinaciones = aglutinaciones;
	}

	public String getAstoCuantitativo() {
		return this.astoCuantitativo;
	}

	public void setAstoCuantitativo(String astoCuantitativo) {
		this.astoCuantitativo = astoCuantitativo;
	}

	public String getBrucellaAbortus() {
		return this.brucellaAbortus;
	}

	public void setBrucellaAbortus(String brucellaAbortus) {
		this.brucellaAbortus = brucellaAbortus;
	}

	public String getBrucellosis() {
		return this.brucellosis;
	}

	public void setBrucellosis(String brucellosis) {
		this.brucellosis = brucellosis;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFrCuantitativo() {
		return this.frCuantitativo;
	}

	public void setFrCuantitativo(String frCuantitativo) {
		this.frCuantitativo = frCuantitativo;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getLatexCuantitativo() {
		return this.latexCuantitativo;
	}

	public void setLatexCuantitativo(String latexCuantitativo) {
		this.latexCuantitativo = latexCuantitativo;
	}

	public String getMucoproteinas() {
		return this.mucoproteinas;
	}

	public void setMucoproteinas(String mucoproteinas) {
		this.mucoproteinas = mucoproteinas;
	}

	public String getParatificoA() {
		return this.paratificoA;
	}

	public void setParatificoA(String paratificoA) {
		this.paratificoA = paratificoA;
	}

	public String getParatificoB() {
		return this.paratificoB;
	}

	public void setParatificoB(String paratificoB) {
		this.paratificoB = paratificoB;
	}

	public String getPcrCuantitativo() {
		return this.pcrCuantitativo;
	}

	public void setPcrCuantitativo(String pcrCuantitativo) {
		this.pcrCuantitativo = pcrCuantitativo;
	}

	public String getProteusOx19() {
		return this.proteusOx19;
	}

	public void setProteusOx19(String proteusOx19) {
		this.proteusOx19 = proteusOx19;
	}

	public String getTificoH() {
		return this.tificoH;
	}

	public void setTificoH(String tificoH) {
		this.tificoH = tificoH;
	}

	public String getTificoO() {
		return this.tificoO;
	}

	public void setTificoO(String tificoO) {
		this.tificoO = tificoO;
	}

	public String getVdrl() {
		return this.vdrl;
	}

	public void setVdrl(String vdrl) {
		this.vdrl = vdrl;
	}

	public String getWallerRose() {
		return this.wallerRose;
	}

	public void setWallerRose(String wallerRose) {
		this.wallerRose = wallerRose;
	}

}