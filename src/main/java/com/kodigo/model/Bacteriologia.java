package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bacteriologia database table.
 * 
 */
@Entity
@NamedQuery(name="Bacteriologia.findAll", query="SELECT b FROM Bacteriologia b")
public class Bacteriologia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_bacteriologia")
	private int idBacteriologia;

	@Column(name="eosinofilos_nasal")
	private String eosinofilosNasal;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String fresco;

	private String gram;

	@Column(name="id_paciente")
	private int idPaciente;

	private String koh;

	private String secrecion;

	private String zhiel;

	public Bacteriologia() {
	}

	public int getIdBacteriologia() {
		return this.idBacteriologia;
	}

	public void setIdBacteriologia(int idBacteriologia) {
		this.idBacteriologia = idBacteriologia;
	}

	public String getEosinofilosNasal() {
		return this.eosinofilosNasal;
	}

	public void setEosinofilosNasal(String eosinofilosNasal) {
		this.eosinofilosNasal = eosinofilosNasal;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFresco() {
		return this.fresco;
	}

	public void setFresco(String fresco) {
		this.fresco = fresco;
	}

	public String getGram() {
		return this.gram;
	}

	public void setGram(String gram) {
		this.gram = gram;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getKoh() {
		return this.koh;
	}

	public void setKoh(String koh) {
		this.koh = koh;
	}

	public String getSecrecion() {
		return this.secrecion;
	}

	public void setSecrecion(String secrecion) {
		this.secrecion = secrecion;
	}

	public String getZhiel() {
		return this.zhiel;
	}

	public void setZhiel(String zhiel) {
		this.zhiel = zhiel;
	}

}