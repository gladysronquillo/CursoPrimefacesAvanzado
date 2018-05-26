package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hormonas database table.
 * 
 */
@Entity
@Table(name="Hormonas")
@NamedQuery(name="Hormonas.findAll", query="SELECT h FROM Hormonas h")
public class Hormonas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hormonas")
	private int idHormonas;

	private String cortisol;

	private String dheas;

	private String estradiol;

	private String estrogenos;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String fsh;

	private String ft3;

	private String ft4;

	private String hcgb;

	private String hgh;

	@Column(name="id_paciente")
	private int idPaciente;

	private String insulina;

	private String lh;

	private String paratohormona;

	@Column(name="peptido_c")
	private String peptidoC;

	private String progesterona;

	private String prolactina;

	@Column(name="prueba_embarazo")
	private String pruebaEmbarazo;

	private String t3;

	private String t4;

	private String testosterona;

	private String tsh;

	public Hormonas() {
	}

	public int getIdHormonas() {
		return this.idHormonas;
	}

	public void setIdHormonas(int idHormonas) {
		this.idHormonas = idHormonas;
	}

	public String getCortisol() {
		return this.cortisol;
	}

	public void setCortisol(String cortisol) {
		this.cortisol = cortisol;
	}

	public String getDheas() {
		return this.dheas;
	}

	public void setDheas(String dheas) {
		this.dheas = dheas;
	}

	public String getEstradiol() {
		return this.estradiol;
	}

	public void setEstradiol(String estradiol) {
		this.estradiol = estradiol;
	}

	public String getEstrogenos() {
		return this.estrogenos;
	}

	public void setEstrogenos(String estrogenos) {
		this.estrogenos = estrogenos;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFsh() {
		return this.fsh;
	}

	public void setFsh(String fsh) {
		this.fsh = fsh;
	}

	public String getFt3() {
		return this.ft3;
	}

	public void setFt3(String ft3) {
		this.ft3 = ft3;
	}

	public String getFt4() {
		return this.ft4;
	}

	public void setFt4(String ft4) {
		this.ft4 = ft4;
	}

	public String getHcgb() {
		return this.hcgb;
	}

	public void setHcgb(String hcgb) {
		this.hcgb = hcgb;
	}

	public String getHgh() {
		return this.hgh;
	}

	public void setHgh(String hgh) {
		this.hgh = hgh;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getInsulina() {
		return this.insulina;
	}

	public void setInsulina(String insulina) {
		this.insulina = insulina;
	}

	public String getLh() {
		return this.lh;
	}

	public void setLh(String lh) {
		this.lh = lh;
	}

	public String getParatohormona() {
		return this.paratohormona;
	}

	public void setParatohormona(String paratohormona) {
		this.paratohormona = paratohormona;
	}

	public String getPeptidoC() {
		return this.peptidoC;
	}

	public void setPeptidoC(String peptidoC) {
		this.peptidoC = peptidoC;
	}

	public String getProgesterona() {
		return this.progesterona;
	}

	public void setProgesterona(String progesterona) {
		this.progesterona = progesterona;
	}

	public String getProlactina() {
		return this.prolactina;
	}

	public void setProlactina(String prolactina) {
		this.prolactina = prolactina;
	}

	public String getPruebaEmbarazo() {
		return this.pruebaEmbarazo;
	}

	public void setPruebaEmbarazo(String pruebaEmbarazo) {
		this.pruebaEmbarazo = pruebaEmbarazo;
	}

	public String getT3() {
		return this.t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}

	public String getT4() {
		return this.t4;
	}

	public void setT4(String t4) {
		this.t4 = t4;
	}

	public String getTestosterona() {
		return this.testosterona;
	}

	public void setTestosterona(String testosterona) {
		this.testosterona = testosterona;
	}

	public String getTsh() {
		return this.tsh;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
	}

}