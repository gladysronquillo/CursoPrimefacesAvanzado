package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the marcadores_tumorales database table.
 * 
 */
@Entity
@Table(name="marcadores_tumorales")
@NamedQuery(name="MarcadoresTumorale.findAll", query="SELECT m FROM MarcadoresTumorale m")
public class MarcadoresTumorale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_marcadores_tumorales")
	private int idMarcadoresTumorales;

	private String afp;

	@Column(name="ca_gastrico")
	private String caGastrico;

	@Column(name="ca_mama")
	private String caMama;

	@Column(name="ca_ovarios")
	private String caOvarios;

	private String cea;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="psa_libre")
	private String psaLibre;

	@Column(name="psa_total")
	private String psaTotal;

	public MarcadoresTumorale() {
	}

	public int getIdMarcadoresTumorales() {
		return this.idMarcadoresTumorales;
	}

	public void setIdMarcadoresTumorales(int idMarcadoresTumorales) {
		this.idMarcadoresTumorales = idMarcadoresTumorales;
	}

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getCaGastrico() {
		return this.caGastrico;
	}

	public void setCaGastrico(String caGastrico) {
		this.caGastrico = caGastrico;
	}

	public String getCaMama() {
		return this.caMama;
	}

	public void setCaMama(String caMama) {
		this.caMama = caMama;
	}

	public String getCaOvarios() {
		return this.caOvarios;
	}

	public void setCaOvarios(String caOvarios) {
		this.caOvarios = caOvarios;
	}

	public String getCea() {
		return this.cea;
	}

	public void setCea(String cea) {
		this.cea = cea;
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

	public String getPsaLibre() {
		return this.psaLibre;
	}

	public void setPsaLibre(String psaLibre) {
		this.psaLibre = psaLibre;
	}

	public String getPsaTotal() {
		return this.psaTotal;
	}

	public void setPsaTotal(String psaTotal) {
		this.psaTotal = psaTotal;
	}

}