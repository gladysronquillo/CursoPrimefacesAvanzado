package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sanguinea database table.
 * 
 */
@Entity
@NamedQuery(name="Sanguinea.findAll", query="SELECT s FROM Sanguinea s")
public class Sanguinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_sanguinea")
	private int idSanguinea;

	@Column(name="acido_folico")
	private String acidoFolico;

	private String aldolasa;

	@Column(name="apo_a1")
	private String apoA1;

	@Column(name="apo_b100")
	private String apoB100;

	@Column(name="cap_transferrina")
	private String capTransferrina;

	private String colinesterasa;

	@Column(name="esteres_colest")
	private String esteresColest;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String ferritina;

	private String fosfolipidos;

	private String glucosa;

	@Column(name="hierro_serico")
	private String hierroSerico;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="sat_transferrina")
	private String satTransferrina;

	@Column(name="vitamina_b12")
	private String vitaminaB12;

	public Sanguinea() {
	}

	public int getIdSanguinea() {
		return this.idSanguinea;
	}

	public void setIdSanguinea(int idSanguinea) {
		this.idSanguinea = idSanguinea;
	}

	public String getAcidoFolico() {
		return this.acidoFolico;
	}

	public void setAcidoFolico(String acidoFolico) {
		this.acidoFolico = acidoFolico;
	}

	public String getAldolasa() {
		return this.aldolasa;
	}

	public void setAldolasa(String aldolasa) {
		this.aldolasa = aldolasa;
	}

	public String getApoA1() {
		return this.apoA1;
	}

	public void setApoA1(String apoA1) {
		this.apoA1 = apoA1;
	}

	public String getApoB100() {
		return this.apoB100;
	}

	public void setApoB100(String apoB100) {
		this.apoB100 = apoB100;
	}

	public String getCapTransferrina() {
		return this.capTransferrina;
	}

	public void setCapTransferrina(String capTransferrina) {
		this.capTransferrina = capTransferrina;
	}

	public String getColinesterasa() {
		return this.colinesterasa;
	}

	public void setColinesterasa(String colinesterasa) {
		this.colinesterasa = colinesterasa;
	}

	public String getEsteresColest() {
		return this.esteresColest;
	}

	public void setEsteresColest(String esteresColest) {
		this.esteresColest = esteresColest;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFerritina() {
		return this.ferritina;
	}

	public void setFerritina(String ferritina) {
		this.ferritina = ferritina;
	}

	public String getFosfolipidos() {
		return this.fosfolipidos;
	}

	public void setFosfolipidos(String fosfolipidos) {
		this.fosfolipidos = fosfolipidos;
	}

	public String getGlucosa() {
		return this.glucosa;
	}

	public void setGlucosa(String glucosa) {
		this.glucosa = glucosa;
	}

	public String getHierroSerico() {
		return this.hierroSerico;
	}

	public void setHierroSerico(String hierroSerico) {
		this.hierroSerico = hierroSerico;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getSatTransferrina() {
		return this.satTransferrina;
	}

	public void setSatTransferrina(String satTransferrina) {
		this.satTransferrina = satTransferrina;
	}

	public String getVitaminaB12() {
		return this.vitaminaB12;
	}

	public void setVitaminaB12(String vitaminaB12) {
		this.vitaminaB12 = vitaminaB12;
	}

}