package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the examen_orina database table.
 * 
 */
@Entity
@Table(name="examen_orina")
@NamedQuery(name="Examen_orina.findAll", query="SELECT e FROM Examen_orina e")
public class Examen_orina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_examen_orina")
	private int idExamenOrina;

	private String baar;

	private String bacterias;

	@Column(name="celulas_epiteliales")
	private String celulasEpiteliales;

	@Column(name="celulas_redondas")
	private String celulasRedondas;

	private String cilindros;

	@Column(name="clearance_creatinina")
	private String clearanceCreatinina;

	private String cristales;

	@Column(name="esporas_hongos")
	private String esporasHongos;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="filamentos_mucosos")
	private String filamentosMucosos;

	@Column(name="fisico_aspecto")
	private String fisicoAspecto;

	@Column(name="fisico_color")
	private String fisicoColor;

	@Column(name="fisico_densidad")
	private String fisicoDensidad;

	@Column(name="fisico_ph")
	private String fisicoPh;

	@Column(name="gota_fresca")
	private String gotaFresca;

	private String hematies;

	@Column(name="id_paciente")
	private int idPaciente;

	private String microalbuminuria;

	@Column(name="miscelios_hongos")
	private String misceliosHongos;

	private String muestras;

	private String piocitos;

	@Column(name="proteinuria_24")
	private String proteinuria24;

	@Column(name="proteinuria_miccional")
	private String proteinuriaMiccional;

	@Column(name="prueba_embarazo")
	private String pruebaEmbarazo;

	@Column(name="quimico_bilirubinas")
	private String quimicoBilirubinas;

	@Column(name="quimico_cetonico")
	private String quimicoCetonico;

	@Column(name="quimico_glucosa")
	private String quimicoGlucosa;

	@Column(name="quimico_leucocitos")
	private String quimicoLeucocitos;

	@Column(name="quimico_nitritos")
	private String quimicoNitritos;

	@Column(name="quimico_proteinas")
	private String quimicoProteinas;

	@Column(name="quimico_sangre")
	private String quimicoSangre;

	@Column(name="quimico_urobilinogeno")
	private String quimicoUrobilinogeno;

	private String trichomonas;

	public Examen_orina() {
	}

	public int getIdExamenOrina() {
		return this.idExamenOrina;
	}

	public void setIdExamenOrina(int idExamenOrina) {
		this.idExamenOrina = idExamenOrina;
	}

	public String getBaar() {
		return this.baar;
	}

	public void setBaar(String baar) {
		this.baar = baar;
	}

	public String getBacterias() {
		return this.bacterias;
	}

	public void setBacterias(String bacterias) {
		this.bacterias = bacterias;
	}

	public String getCelulasEpiteliales() {
		return this.celulasEpiteliales;
	}

	public void setCelulasEpiteliales(String celulasEpiteliales) {
		this.celulasEpiteliales = celulasEpiteliales;
	}

	public String getCelulasRedondas() {
		return this.celulasRedondas;
	}

	public void setCelulasRedondas(String celulasRedondas) {
		this.celulasRedondas = celulasRedondas;
	}

	public String getCilindros() {
		return this.cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	public String getClearanceCreatinina() {
		return this.clearanceCreatinina;
	}

	public void setClearanceCreatinina(String clearanceCreatinina) {
		this.clearanceCreatinina = clearanceCreatinina;
	}

	public String getCristales() {
		return this.cristales;
	}

	public void setCristales(String cristales) {
		this.cristales = cristales;
	}

	public String getEsporasHongos() {
		return this.esporasHongos;
	}

	public void setEsporasHongos(String esporasHongos) {
		this.esporasHongos = esporasHongos;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFilamentosMucosos() {
		return this.filamentosMucosos;
	}

	public void setFilamentosMucosos(String filamentosMucosos) {
		this.filamentosMucosos = filamentosMucosos;
	}

	public String getFisicoAspecto() {
		return this.fisicoAspecto;
	}

	public void setFisicoAspecto(String fisicoAspecto) {
		this.fisicoAspecto = fisicoAspecto;
	}

	public String getFisicoColor() {
		return this.fisicoColor;
	}

	public void setFisicoColor(String fisicoColor) {
		this.fisicoColor = fisicoColor;
	}

	public String getFisicoDensidad() {
		return this.fisicoDensidad;
	}

	public void setFisicoDensidad(String fisicoDensidad) {
		this.fisicoDensidad = fisicoDensidad;
	}

	public String getFisicoPh() {
		return this.fisicoPh;
	}

	public void setFisicoPh(String fisicoPh) {
		this.fisicoPh = fisicoPh;
	}

	public String getGotaFresca() {
		return this.gotaFresca;
	}

	public void setGotaFresca(String gotaFresca) {
		this.gotaFresca = gotaFresca;
	}

	public String getHematies() {
		return this.hematies;
	}

	public void setHematies(String hematies) {
		this.hematies = hematies;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getMicroalbuminuria() {
		return this.microalbuminuria;
	}

	public void setMicroalbuminuria(String microalbuminuria) {
		this.microalbuminuria = microalbuminuria;
	}

	public String getMisceliosHongos() {
		return this.misceliosHongos;
	}

	public void setMisceliosHongos(String misceliosHongos) {
		this.misceliosHongos = misceliosHongos;
	}

	public String getMuestras() {
		return this.muestras;
	}

	public void setMuestras(String muestras) {
		this.muestras = muestras;
	}

	public String getPiocitos() {
		return this.piocitos;
	}

	public void setPiocitos(String piocitos) {
		this.piocitos = piocitos;
	}

	public String getProteinuria24() {
		return this.proteinuria24;
	}

	public void setProteinuria24(String proteinuria24) {
		this.proteinuria24 = proteinuria24;
	}

	public String getProteinuriaMiccional() {
		return this.proteinuriaMiccional;
	}

	public void setProteinuriaMiccional(String proteinuriaMiccional) {
		this.proteinuriaMiccional = proteinuriaMiccional;
	}

	public String getPruebaEmbarazo() {
		return this.pruebaEmbarazo;
	}

	public void setPruebaEmbarazo(String pruebaEmbarazo) {
		this.pruebaEmbarazo = pruebaEmbarazo;
	}

	public String getQuimicoBilirubinas() {
		return this.quimicoBilirubinas;
	}

	public void setQuimicoBilirubinas(String quimicoBilirubinas) {
		this.quimicoBilirubinas = quimicoBilirubinas;
	}

	public String getQuimicoCetonico() {
		return this.quimicoCetonico;
	}

	public void setQuimicoCetonico(String quimicoCetonico) {
		this.quimicoCetonico = quimicoCetonico;
	}

	public String getQuimicoGlucosa() {
		return this.quimicoGlucosa;
	}

	public void setQuimicoGlucosa(String quimicoGlucosa) {
		this.quimicoGlucosa = quimicoGlucosa;
	}

	public String getQuimicoLeucocitos() {
		return this.quimicoLeucocitos;
	}

	public void setQuimicoLeucocitos(String quimicoLeucocitos) {
		this.quimicoLeucocitos = quimicoLeucocitos;
	}

	public String getQuimicoNitritos() {
		return this.quimicoNitritos;
	}

	public void setQuimicoNitritos(String quimicoNitritos) {
		this.quimicoNitritos = quimicoNitritos;
	}

	public String getQuimicoProteinas() {
		return this.quimicoProteinas;
	}

	public void setQuimicoProteinas(String quimicoProteinas) {
		this.quimicoProteinas = quimicoProteinas;
	}

	public String getQuimicoSangre() {
		return this.quimicoSangre;
	}

	public void setQuimicoSangre(String quimicoSangre) {
		this.quimicoSangre = quimicoSangre;
	}

	public String getQuimicoUrobilinogeno() {
		return this.quimicoUrobilinogeno;
	}

	public void setQuimicoUrobilinogeno(String quimicoUrobilinogeno) {
		this.quimicoUrobilinogeno = quimicoUrobilinogeno;
	}

	public String getTrichomonas() {
		return this.trichomonas;
	}

	public void setTrichomonas(String trichomonas) {
		this.trichomonas = trichomonas;
	}

}