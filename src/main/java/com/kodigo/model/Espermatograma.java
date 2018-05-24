package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the espermatograma database table.
 * 
 */
@Entity
@NamedQuery(name="Espermatograma.findAll", query="SELECT e FROM Espermatograma e")
public class Espermatograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_espermatograma")
	private int idEspermatograma;

	private String aspecto;

	private String color;

	private String consistencia;

	@Column(name="contaje_espermatozoides")
	private String contajeEspermatozoides;

	@Column(name="doble_cabeza")
	private String dobleCabeza;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="id_paciente")
	private int idPaciente;

	private String licuación;

	private String macrocefalos;

	private String microcefalos;

	private String motilidad;

	private String normales;

	private String ph;

	@Column(name="sin_cola")
	private String sinCola;

	private String volumen;

	public Espermatograma() {
	}

	public int getIdEspermatograma() {
		return this.idEspermatograma;
	}

	public void setIdEspermatograma(int idEspermatograma) {
		this.idEspermatograma = idEspermatograma;
	}

	public String getAspecto() {
		return this.aspecto;
	}

	public void setAspecto(String aspecto) {
		this.aspecto = aspecto;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsistencia() {
		return this.consistencia;
	}

	public void setConsistencia(String consistencia) {
		this.consistencia = consistencia;
	}

	public String getContajeEspermatozoides() {
		return this.contajeEspermatozoides;
	}

	public void setContajeEspermatozoides(String contajeEspermatozoides) {
		this.contajeEspermatozoides = contajeEspermatozoides;
	}

	public String getDobleCabeza() {
		return this.dobleCabeza;
	}

	public void setDobleCabeza(String dobleCabeza) {
		this.dobleCabeza = dobleCabeza;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getLicuación() {
		return this.licuación;
	}

	public void setLicuación(String licuación) {
		this.licuación = licuación;
	}

	public String getMacrocefalos() {
		return this.macrocefalos;
	}

	public void setMacrocefalos(String macrocefalos) {
		this.macrocefalos = macrocefalos;
	}

	public String getMicrocefalos() {
		return this.microcefalos;
	}

	public void setMicrocefalos(String microcefalos) {
		this.microcefalos = microcefalos;
	}

	public String getMotilidad() {
		return this.motilidad;
	}

	public void setMotilidad(String motilidad) {
		this.motilidad = motilidad;
	}

	public String getNormales() {
		return this.normales;
	}

	public void setNormales(String normales) {
		this.normales = normales;
	}

	public String getPh() {
		return this.ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getSinCola() {
		return this.sinCola;
	}

	public void setSinCola(String sinCola) {
		this.sinCola = sinCola;
	}

	public String getVolumen() {
		return this.volumen;
	}

	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}

}