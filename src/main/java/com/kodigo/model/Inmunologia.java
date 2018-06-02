package com.kodigo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the inmunologia database table.
 * 
 */
@Entity
@NamedQuery(name="Inmunologia.findAll", query="SELECT i FROM Inmunologia i")
public class Inmunologia implements Serializable {
	private static final long serialVersionUID = -8544082444150667393L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_inmunulogia")
	private int idInmunulogia;
	
	@Column(name="id_paciente")
	private int idPaciente;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;

	@Column(name="citomegalovirus_igg")
	private String citomegalovirusIgg;

	@Column(name="citomegalovirus_igm")
	private String citomegalovirusIgm;

	private String h1v12sida;

	@Column(name="helicobacter_pylori")
	private String helicobacterPylori;

	@Column(name="helicobacter_pylori_igg")
	private String helicobacterPyloriIgg;

	@Column(name="helicobacter_pylory_igm")
	private String helicobacterPyloryIgm;

	@Column(name="herpes_i_igg")
	private String herpesIIgg;

	@Column(name="herpes_i_igm")
	private String herpesIIgm;

	@Column(name="herpes_ii_igg")
	private String herpesIiIgg;

	@Column(name="herpes_ii_igm")
	private String herpesIiIgm;

	private String inmunulogiacol;

	@Column(name="rubeola_igg")
	private String rubeolaIgg;

	@Column(name="rubeola_igm")
	private String rubeolaIgm;

	@Column(name="toxoplasma_igg")
	private String toxoplasmaIgg;

	@Column(name="toxoplasma_igm")
	private String toxoplasmaIgm;

	public Inmunologia() {
	}

	public int getIdInmunulogia() {
		return this.idInmunulogia;
	}

	public void setIdInmunulogia(int idInmunulogia) {
		this.idInmunulogia = idInmunulogia;
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getCitomegalovirusIgg() {
		return this.citomegalovirusIgg;
	}

	public void setCitomegalovirusIgg(String citomegalovirusIgg) {
		this.citomegalovirusIgg = citomegalovirusIgg;
	}

	public String getCitomegalovirusIgm() {
		return this.citomegalovirusIgm;
	}

	public void setCitomegalovirusIgm(String citomegalovirusIgm) {
		this.citomegalovirusIgm = citomegalovirusIgm;
	}

	public String getH1v12sida() {
		return this.h1v12sida;
	}

	public void setH1v12sida(String h1v12sida) {
		this.h1v12sida = h1v12sida;
	}

	public String getHelicobacterPylori() {
		return this.helicobacterPylori;
	}

	public void setHelicobacterPylori(String helicobacterPylori) {
		this.helicobacterPylori = helicobacterPylori;
	}

	public String getHelicobacterPyloriIgg() {
		return this.helicobacterPyloriIgg;
	}

	public void setHelicobacterPyloriIgg(String helicobacterPyloriIgg) {
		this.helicobacterPyloriIgg = helicobacterPyloriIgg;
	}

	public String getHelicobacterPyloryIgm() {
		return this.helicobacterPyloryIgm;
	}

	public void setHelicobacterPyloryIgm(String helicobacterPyloryIgm) {
		this.helicobacterPyloryIgm = helicobacterPyloryIgm;
	}

	public String getHerpesIIgg() {
		return this.herpesIIgg;
	}

	public void setHerpesIIgg(String herpesIIgg) {
		this.herpesIIgg = herpesIIgg;
	}

	public String getHerpesIIgm() {
		return this.herpesIIgm;
	}

	public void setHerpesIIgm(String herpesIIgm) {
		this.herpesIIgm = herpesIIgm;
	}

	public String getHerpesIiIgg() {
		return this.herpesIiIgg;
	}

	public void setHerpesIiIgg(String herpesIiIgg) {
		this.herpesIiIgg = herpesIiIgg;
	}

	public String getHerpesIiIgm() {
		return this.herpesIiIgm;
	}

	public void setHerpesIiIgm(String herpesIiIgm) {
		this.herpesIiIgm = herpesIiIgm;
	}

	public String getInmunulogiacol() {
		return this.inmunulogiacol;
	}

	public void setInmunulogiacol(String inmunulogiacol) {
		this.inmunulogiacol = inmunulogiacol;
	}

	public String getRubeolaIgg() {
		return this.rubeolaIgg;
	}

	public void setRubeolaIgg(String rubeolaIgg) {
		this.rubeolaIgg = rubeolaIgg;
	}

	public String getRubeolaIgm() {
		return this.rubeolaIgm;
	}

	public void setRubeolaIgm(String rubeolaIgm) {
		this.rubeolaIgm = rubeolaIgm;
	}

	public String getToxoplasmaIgg() {
		return this.toxoplasmaIgg;
	}

	public void setToxoplasmaIgg(String toxoplasmaIgg) {
		this.toxoplasmaIgg = toxoplasmaIgg;
	}

	public String getToxoplasmaIgm() {
		return this.toxoplasmaIgm;
	}

	public void setToxoplasmaIgm(String toxoplasmaIgm) {
		this.toxoplasmaIgm = toxoplasmaIgm;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}