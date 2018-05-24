package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cultivo_antibiograma database table.
 * 
 */
@Entity
@Table(name="cultivo_antibiograma")
@NamedQuery(name="Cultivo_antibiograma.findAll", query="SELECT c FROM Cultivo_antibiograma c")
public class Cultivo_antibiograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cultivo_antibiograma")
	private int idCultivoAntibiograma;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="germen_identificado")
	private String germenIdentificado;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="med_sensible")
	private String medSensible;

	@Column(name="muy_sensible")
	private String muySensible;

	@Column(name="nombre_cultivo")
	private String nombreCultivo;

	private String resistente;

	public Cultivo_antibiograma() {
	}

	public int getIdCultivoAntibiograma() {
		return this.idCultivoAntibiograma;
	}

	public void setIdCultivoAntibiograma(int idCultivoAntibiograma) {
		this.idCultivoAntibiograma = idCultivoAntibiograma;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getGermenIdentificado() {
		return this.germenIdentificado;
	}

	public void setGermenIdentificado(String germenIdentificado) {
		this.germenIdentificado = germenIdentificado;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getMedSensible() {
		return this.medSensible;
	}

	public void setMedSensible(String medSensible) {
		this.medSensible = medSensible;
	}

	public String getMuySensible() {
		return this.muySensible;
	}

	public void setMuySensible(String muySensible) {
		this.muySensible = muySensible;
	}

	public String getNombreCultivo() {
		return this.nombreCultivo;
	}

	public void setNombreCultivo(String nombreCultivo) {
		this.nombreCultivo = nombreCultivo;
	}

	public String getResistente() {
		return this.resistente;
	}

	public void setResistente(String resistente) {
		this.resistente = resistente;
	}

}