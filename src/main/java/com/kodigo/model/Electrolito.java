package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the electrolitos database table.
 * 
 */
@Entity
@Table(name="electrolitos")
@NamedQuery(name="Electrolito.findAll", query="SELECT e FROM Electrolito e")
public class Electrolito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_electrolitos")
	private int idElectrolitos;

	@Column(name="calcio_ionico")
	private String calcioIonico;

	@Column(name="calcio_total")
	private String calcioTotal;

	private String cloro;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String fosforo;

	@Column(name="id_paciente")
	private int idPaciente;

	private String litio;

	private String magnesio;

	private String plomo;

	private String potasio;

	private String sodio;

	public Electrolito() {
	}

	public int getIdElectrolitos() {
		return this.idElectrolitos;
	}

	public void setIdElectrolitos(int idElectrolitos) {
		this.idElectrolitos = idElectrolitos;
	}

	public String getCalcioIonico() {
		return this.calcioIonico;
	}

	public void setCalcioIonico(String calcioIonico) {
		this.calcioIonico = calcioIonico;
	}

	public String getCalcioTotal() {
		return this.calcioTotal;
	}

	public void setCalcioTotal(String calcioTotal) {
		this.calcioTotal = calcioTotal;
	}

	public String getCloro() {
		return this.cloro;
	}

	public void setCloro(String cloro) {
		this.cloro = cloro;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFosforo() {
		return this.fosforo;
	}

	public void setFosforo(String fosforo) {
		this.fosforo = fosforo;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getLitio() {
		return this.litio;
	}

	public void setLitio(String litio) {
		this.litio = litio;
	}

	public String getMagnesio() {
		return this.magnesio;
	}

	public void setMagnesio(String magnesio) {
		this.magnesio = magnesio;
	}

	public String getPlomo() {
		return this.plomo;
	}

	public void setPlomo(String plomo) {
		this.plomo = plomo;
	}

	public String getPotasio() {
		return this.potasio;
	}

	public void setPotasio(String potasio) {
		this.potasio = potasio;
	}

	public String getSodio() {
		return this.sodio;
	}

	public void setSodio(String sodio) {
		this.sodio = sodio;
	}

}