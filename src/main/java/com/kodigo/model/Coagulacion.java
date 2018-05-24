package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the coagulacion database table.
 * 
 */
@Entity
@NamedQuery(name="Coagulacion.findAll", query="SELECT c FROM Coagulacion c")
public class Coagulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coagulacion")
	private int idCoagulacion;

	private String actividad;

	@Column(name="anti_lupico")
	private String antiLupico;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String fibrinogeno;

	@Column(name="id_paciente")
	private int idPaciente;

	private String inr;

	private String plaquetas;

	private String retraccion;

	@Column(name="t_coagulacion")
	private String tCoagulacion;

	@Column(name="t_hemorragia")
	private String tHemorragia;

	@Column(name="t_trombina")
	private String tTrombina;

	private String tp;

	private String ttp;

	public Coagulacion() {
	}

	public int getIdCoagulacion() {
		return this.idCoagulacion;
	}

	public void setIdCoagulacion(int idCoagulacion) {
		this.idCoagulacion = idCoagulacion;
	}

	public String getActividad() {
		return this.actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getAntiLupico() {
		return this.antiLupico;
	}

	public void setAntiLupico(String antiLupico) {
		this.antiLupico = antiLupico;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFibrinogeno() {
		return this.fibrinogeno;
	}

	public void setFibrinogeno(String fibrinogeno) {
		this.fibrinogeno = fibrinogeno;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getInr() {
		return this.inr;
	}

	public void setInr(String inr) {
		this.inr = inr;
	}

	public String getPlaquetas() {
		return this.plaquetas;
	}

	public void setPlaquetas(String plaquetas) {
		this.plaquetas = plaquetas;
	}

	public String getRetraccion() {
		return this.retraccion;
	}

	public void setRetraccion(String retraccion) {
		this.retraccion = retraccion;
	}

	public String getTCoagulacion() {
		return this.tCoagulacion;
	}

	public void setTCoagulacion(String tCoagulacion) {
		this.tCoagulacion = tCoagulacion;
	}

	public String getTHemorragia() {
		return this.tHemorragia;
	}

	public void setTHemorragia(String tHemorragia) {
		this.tHemorragia = tHemorragia;
	}

	public String getTTrombina() {
		return this.tTrombina;
	}

	public void setTTrombina(String tTrombina) {
		this.tTrombina = tTrombina;
	}

	public String getTp() {
		return this.tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getTtp() {
		return this.ttp;
	}

	public void setTtp(String ttp) {
		this.ttp = ttp;
	}

}