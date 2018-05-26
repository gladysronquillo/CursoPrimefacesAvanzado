package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the examen_sangre database table.
 * 
 */
@Entity
@Table(name="examen_sangre")
@NamedQuery(name="Examen_sangre.findAll", query="SELECT e FROM Examen_sangre e")
public class Examen_sangre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_examen_sangre")
	private int idExamenSangre;

	private String anisocitosis;

	@Column(name="celulas_le")
	private String celulasLe;

	private String chcm;

	@Column(name="cooms_directo")
	private String coomsDirecto;

	@Column(name="cooms_indirecto")
	private String coomsIndirecto;

	private String eosinofilos;

	@Column(name="factor_rh")
	private String factorRh;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="globulos_blancos")
	private String globulosBlancos;

	@Column(name="globulos_rojos")
	private String globulosRojos;

	@Column(name="grupo_sanguineo")
	private String grupoSanguineo;
	
	@Column(name="plaquetas")
	private String plaquetas;

	private String hcm;

	private String hematocrito;

	private String hematozoario;

	private String hemoglobina;

	private String hipocromia;

	@Column(name="id_paciente")
	private int idPaciente;

	private String linfocitos;

	private String monocitos;

	private String poiquilocitosis;

	private String reticulocitos;

	private String sedimentacion;

	private String segmentados;

	private String vcm;

	public Examen_sangre() {
	}

	public int getIdExamenSangre() {
		return this.idExamenSangre;
	}

	public void setIdExamenSangre(int idExamenSangre) {
		this.idExamenSangre = idExamenSangre;
	}

	public String getAnisocitosis() {
		return this.anisocitosis;
	}

	public void setAnisocitosis(String anisocitosis) {
		this.anisocitosis = anisocitosis;
	}

	public String getCelulasLe() {
		return this.celulasLe;
	}

	public void setCelulasLe(String celulasLe) {
		this.celulasLe = celulasLe;
	}

	public String getChcm() {
		return this.chcm;
	}

	public void setChcm(String chcm) {
		this.chcm = chcm;
	}

	public String getCoomsDirecto() {
		return this.coomsDirecto;
	}

	public void setCoomsDirecto(String coomsDirecto) {
		this.coomsDirecto = coomsDirecto;
	}

	public String getCoomsIndirecto() {
		return this.coomsIndirecto;
	}

	public void setCoomsIndirecto(String coomsIndirecto) {
		this.coomsIndirecto = coomsIndirecto;
	}

	public String getEosinofilos() {
		return this.eosinofilos;
	}

	public void setEosinofilos(String eosinofilos) {
		this.eosinofilos = eosinofilos;
	}

	public String getFactorRh() {
		return this.factorRh;
	}

	public void setFactorRh(String factorRh) {
		this.factorRh = factorRh;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getGlobulosBlancos() {
		return this.globulosBlancos;
	}

	public void setGlobulosBlancos(String globulosBlancos) {
		this.globulosBlancos = globulosBlancos;
	}

	public String getGlobulosRojos() {
		return this.globulosRojos;
	}

	public void setGlobulosRojos(String globulosRojos) {
		this.globulosRojos = globulosRojos;
	}

	public String getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getHcm() {
		return this.hcm;
	}

	public void setHcm(String hcm) {
		this.hcm = hcm;
	}

	public String getHematocrito() {
		return this.hematocrito;
	}

	public void setHematocrito(String hematocrito) {
		this.hematocrito = hematocrito;
	}

	public String getHematozoario() {
		return this.hematozoario;
	}

	public void setHematozoario(String hematozoario) {
		this.hematozoario = hematozoario;
	}

	public String getHemoglobina() {
		return this.hemoglobina;
	}

	public void setHemoglobina(String hemoglobina) {
		this.hemoglobina = hemoglobina;
	}

	public String getHipocromia() {
		return this.hipocromia;
	}

	public void setHipocromia(String hipocromia) {
		this.hipocromia = hipocromia;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getLinfocitos() {
		return this.linfocitos;
	}

	public void setLinfocitos(String linfocitos) {
		this.linfocitos = linfocitos;
	}

	public String getMonocitos() {
		return this.monocitos;
	}

	public void setMonocitos(String monocitos) {
		this.monocitos = monocitos;
	}

	public String getPoiquilocitosis() {
		return this.poiquilocitosis;
	}

	public void setPoiquilocitosis(String poiquilocitosis) {
		this.poiquilocitosis = poiquilocitosis;
	}

	public String getReticulocitos() {
		return this.reticulocitos;
	}

	public void setReticulocitos(String reticulocitos) {
		this.reticulocitos = reticulocitos;
	}

	public String getSedimentacion() {
		return this.sedimentacion;
	}

	public void setSedimentacion(String sedimentacion) {
		this.sedimentacion = sedimentacion;
	}

	public String getSegmentados() {
		return this.segmentados;
	}

	public void setSegmentados(String segmentados) {
		this.segmentados = segmentados;
	}

	public String getVcm() {
		return this.vcm;
	}

	public void setVcm(String vcm) {
		this.vcm = vcm;
	}

	public String getPlaquetas() {
		return plaquetas;
	}

	public void setPlaquetas(String plaquetas) {
		this.plaquetas = plaquetas;
	}
	
	

}