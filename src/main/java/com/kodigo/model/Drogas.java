package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the drogas database table.
 * 
 */
@Entity
@Table(name="drogas")
@NamedQuery(name="Drogas.findAll", query="SELECT d FROM Drogas d")
public class Drogas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_drogas")
	private int idDrogas;

	@Column(name="acido_valproico")
	private String acidoValproico;

	@Column(name="alcohol_serico")
	private String alcoholSerico;

	private String anfetaminas;

	private String carbamazepina;

	private String cocaina;

	private String difenilhidantoina;

	private String digoxina;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String fenobarbital;

	@Column(name="id_paciente")
	private int idPaciente;

	private String marihuana;

	public Drogas() {
	}

	public int getIdDrogas() {
		return this.idDrogas;
	}

	public void setIdDrogas(int idDrogas) {
		this.idDrogas = idDrogas;
	}

	public String getAcidoValproico() {
		return this.acidoValproico;
	}

	public void setAcidoValproico(String acidoValproico) {
		this.acidoValproico = acidoValproico;
	}

	public String getAlcoholSerico() {
		return this.alcoholSerico;
	}

	public void setAlcoholSerico(String alcoholSerico) {
		this.alcoholSerico = alcoholSerico;
	}

	public String getAnfetaminas() {
		return this.anfetaminas;
	}

	public void setAnfetaminas(String anfetaminas) {
		this.anfetaminas = anfetaminas;
	}

	public String getCarbamazepina() {
		return this.carbamazepina;
	}

	public void setCarbamazepina(String carbamazepina) {
		this.carbamazepina = carbamazepina;
	}

	public String getCocaina() {
		return this.cocaina;
	}

	public void setCocaina(String cocaina) {
		this.cocaina = cocaina;
	}

	public String getDifenilhidantoina() {
		return this.difenilhidantoina;
	}

	public void setDifenilhidantoina(String difenilhidantoina) {
		this.difenilhidantoina = difenilhidantoina;
	}

	public String getDigoxina() {
		return this.digoxina;
	}

	public void setDigoxina(String digoxina) {
		this.digoxina = digoxina;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFenobarbital() {
		return this.fenobarbital;
	}

	public void setFenobarbital(String fenobarbital) {
		this.fenobarbital = fenobarbital;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getMarihuana() {
		return this.marihuana;
	}

	public void setMarihuana(String marihuana) {
		this.marihuana = marihuana;
	}

}