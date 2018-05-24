package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bioquimica_sanguinea database table.
 * 
 */
@Entity
@Table(name="bioquimica_sanguinea")
@NamedQuery(name="BioquimicaSanguinea.findAll", query="SELECT b FROM BioquimicaSanguinea b")
public class BioquimicaSanguinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_bioquimica_sanguinea")
	private int idBioquimicaSanguinea;

	@Column(name="acido_folico")
	private String acidoFolico;

	@Column(name="acido_urico")
	private String acidoUrico;

	private String albumina;

	private String aldolasa;

	private String amilasa;

	@Column(name="apo_a1")
	private String apoA1;

	@Column(name="apo_b100")
	private String apoB100;

	@Column(name="bil_directa")
	private String bilDirecta;

	@Column(name="bil_indirecta")
	private String bilIndirecta;

	@Column(name="bil_total")
	private String bilTotal;

	@Column(name="cap_transferrina")
	private String capTransferrina;

	@Column(name="ck_mb")
	private String ckMb;

	private String colesterol;

	private String colinesterasa;

	private String cpk;

	private String creatinina;

	@Column(name="esteres_colest")
	private String esteresColest;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String ferritina;

	@Column(name="fosfatasa_ac_prost")
	private String fosfatasaAcProst;

	@Column(name="fosfatasa_acida")
	private String fosfatasaAcida;

	@Column(name="fosfatasa_alcalina")
	private String fosfatasaAlcalina;

	private String fosfolipidos;

	private String fructosamina;

	private String gamma;

	private String globulina;

	private String glucosa;

	@Column(name="glucosa_ayunas")
	private String glucosaAyunas;

	@Column(name="glucosa_ayunas_1h")
	private String glucosaAyunas1h;

	@Column(name="glucosa_ayunas_2h")
	private String glucosaAyunas2h;

	@Column(name="glucosa_ayunas_3h")
	private String glucosaAyunas3h;

	@Column(name="glucosa_ayunas_4h")
	private String glucosaAyunas4h;

	@Column(name="glucosa_ayunas_5h")
	private String glucosaAyunas5h;

	@Column(name="glucosa_post")
	private String glucosaPost;

	@Column(name="glucosa_sullivan")
	private String glucosaSullivan;

	private String hba1c;

	@Column(name="hdl_colesterol")
	private String hdlColesterol;

	@Column(name="hierro_serico")
	private String hierroSerico;

	@Column(name="id_paciente")
	private int idPaciente;

	private String ldh;

	@Column(name="ldl_colesterol")
	private String ldlColesterol;

	private String lipasa;

	@Column(name="lipidos_totales")
	private String lipidosTotales;

	@Column(name="n_ureico")
	private String nUreico;

	@Column(name="proteinas_totales")
	private String proteinasTotales;

	@Column(name="sat_transferrina")
	private String satTransferrina;

	private String sgot;

	private String sgpt;

	private String trigliceridos;

	private String troponina;

	private String urea;

	@Column(name="vitamina_b12")
	private String vitaminaB12;

	private String vldl;

	public BioquimicaSanguinea() {
	}

	public int getIdBioquimicaSanguinea() {
		return this.idBioquimicaSanguinea;
	}

	public void setIdBioquimicaSanguinea(int idBioquimicaSanguinea) {
		this.idBioquimicaSanguinea = idBioquimicaSanguinea;
	}

	public String getAcidoFolico() {
		return this.acidoFolico;
	}

	public void setAcidoFolico(String acidoFolico) {
		this.acidoFolico = acidoFolico;
	}

	public String getAcidoUrico() {
		return this.acidoUrico;
	}

	public void setAcidoUrico(String acidoUrico) {
		this.acidoUrico = acidoUrico;
	}

	public String getAlbumina() {
		return this.albumina;
	}

	public void setAlbumina(String albumina) {
		this.albumina = albumina;
	}

	public String getAldolasa() {
		return this.aldolasa;
	}

	public void setAldolasa(String aldolasa) {
		this.aldolasa = aldolasa;
	}

	public String getAmilasa() {
		return this.amilasa;
	}

	public void setAmilasa(String amilasa) {
		this.amilasa = amilasa;
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

	public String getBilDirecta() {
		return this.bilDirecta;
	}

	public void setBilDirecta(String bilDirecta) {
		this.bilDirecta = bilDirecta;
	}

	public String getBilIndirecta() {
		return this.bilIndirecta;
	}

	public void setBilIndirecta(String bilIndirecta) {
		this.bilIndirecta = bilIndirecta;
	}

	public String getBilTotal() {
		return this.bilTotal;
	}

	public void setBilTotal(String bilTotal) {
		this.bilTotal = bilTotal;
	}

	public String getCapTransferrina() {
		return this.capTransferrina;
	}

	public void setCapTransferrina(String capTransferrina) {
		this.capTransferrina = capTransferrina;
	}

	public String getCkMb() {
		return this.ckMb;
	}

	public void setCkMb(String ckMb) {
		this.ckMb = ckMb;
	}

	public String getColesterol() {
		return this.colesterol;
	}

	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}

	public String getColinesterasa() {
		return this.colinesterasa;
	}

	public void setColinesterasa(String colinesterasa) {
		this.colinesterasa = colinesterasa;
	}

	public String getCpk() {
		return this.cpk;
	}

	public void setCpk(String cpk) {
		this.cpk = cpk;
	}

	public String getCreatinina() {
		return this.creatinina;
	}

	public void setCreatinina(String creatinina) {
		this.creatinina = creatinina;
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

	public String getFosfatasaAcProst() {
		return this.fosfatasaAcProst;
	}

	public void setFosfatasaAcProst(String fosfatasaAcProst) {
		this.fosfatasaAcProst = fosfatasaAcProst;
	}

	public String getFosfatasaAcida() {
		return this.fosfatasaAcida;
	}

	public void setFosfatasaAcida(String fosfatasaAcida) {
		this.fosfatasaAcida = fosfatasaAcida;
	}

	public String getFosfatasaAlcalina() {
		return this.fosfatasaAlcalina;
	}

	public void setFosfatasaAlcalina(String fosfatasaAlcalina) {
		this.fosfatasaAlcalina = fosfatasaAlcalina;
	}

	public String getFosfolipidos() {
		return this.fosfolipidos;
	}

	public void setFosfolipidos(String fosfolipidos) {
		this.fosfolipidos = fosfolipidos;
	}

	public String getFructosamina() {
		return this.fructosamina;
	}

	public void setFructosamina(String fructosamina) {
		this.fructosamina = fructosamina;
	}

	public String getGamma() {
		return this.gamma;
	}

	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	public String getGlobulina() {
		return this.globulina;
	}

	public void setGlobulina(String globulina) {
		this.globulina = globulina;
	}

	public String getGlucosa() {
		return this.glucosa;
	}

	public void setGlucosa(String glucosa) {
		this.glucosa = glucosa;
	}

	public String getGlucosaAyunas() {
		return this.glucosaAyunas;
	}

	public void setGlucosaAyunas(String glucosaAyunas) {
		this.glucosaAyunas = glucosaAyunas;
	}

	public String getGlucosaAyunas1h() {
		return this.glucosaAyunas1h;
	}

	public void setGlucosaAyunas1h(String glucosaAyunas1h) {
		this.glucosaAyunas1h = glucosaAyunas1h;
	}

	public String getGlucosaAyunas2h() {
		return this.glucosaAyunas2h;
	}

	public void setGlucosaAyunas2h(String glucosaAyunas2h) {
		this.glucosaAyunas2h = glucosaAyunas2h;
	}

	public String getGlucosaAyunas3h() {
		return this.glucosaAyunas3h;
	}

	public void setGlucosaAyunas3h(String glucosaAyunas3h) {
		this.glucosaAyunas3h = glucosaAyunas3h;
	}

	public String getGlucosaAyunas4h() {
		return this.glucosaAyunas4h;
	}

	public void setGlucosaAyunas4h(String glucosaAyunas4h) {
		this.glucosaAyunas4h = glucosaAyunas4h;
	}

	public String getGlucosaAyunas5h() {
		return this.glucosaAyunas5h;
	}

	public void setGlucosaAyunas5h(String glucosaAyunas5h) {
		this.glucosaAyunas5h = glucosaAyunas5h;
	}

	public String getGlucosaPost() {
		return this.glucosaPost;
	}

	public void setGlucosaPost(String glucosaPost) {
		this.glucosaPost = glucosaPost;
	}

	public String getGlucosaSullivan() {
		return this.glucosaSullivan;
	}

	public void setGlucosaSullivan(String glucosaSullivan) {
		this.glucosaSullivan = glucosaSullivan;
	}

	public String getHba1c() {
		return this.hba1c;
	}

	public void setHba1c(String hba1c) {
		this.hba1c = hba1c;
	}

	public String getHdlColesterol() {
		return this.hdlColesterol;
	}

	public void setHdlColesterol(String hdlColesterol) {
		this.hdlColesterol = hdlColesterol;
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

	public String getLdh() {
		return this.ldh;
	}

	public void setLdh(String ldh) {
		this.ldh = ldh;
	}

	public String getLdlColesterol() {
		return this.ldlColesterol;
	}

	public void setLdlColesterol(String ldlColesterol) {
		this.ldlColesterol = ldlColesterol;
	}

	public String getLipasa() {
		return this.lipasa;
	}

	public void setLipasa(String lipasa) {
		this.lipasa = lipasa;
	}

	public String getLipidosTotales() {
		return this.lipidosTotales;
	}

	public void setLipidosTotales(String lipidosTotales) {
		this.lipidosTotales = lipidosTotales;
	}

	public String getNUreico() {
		return this.nUreico;
	}

	public void setNUreico(String nUreico) {
		this.nUreico = nUreico;
	}

	public String getProteinasTotales() {
		return this.proteinasTotales;
	}

	public void setProteinasTotales(String proteinasTotales) {
		this.proteinasTotales = proteinasTotales;
	}

	public String getSatTransferrina() {
		return this.satTransferrina;
	}

	public void setSatTransferrina(String satTransferrina) {
		this.satTransferrina = satTransferrina;
	}

	public String getSgot() {
		return this.sgot;
	}

	public void setSgot(String sgot) {
		this.sgot = sgot;
	}

	public String getSgpt() {
		return this.sgpt;
	}

	public void setSgpt(String sgpt) {
		this.sgpt = sgpt;
	}

	public String getTrigliceridos() {
		return this.trigliceridos;
	}

	public void setTrigliceridos(String trigliceridos) {
		this.trigliceridos = trigliceridos;
	}

	public String getTroponina() {
		return this.troponina;
	}

	public void setTroponina(String troponina) {
		this.troponina = troponina;
	}

	public String getUrea() {
		return this.urea;
	}

	public void setUrea(String urea) {
		this.urea = urea;
	}

	public String getVitaminaB12() {
		return this.vitaminaB12;
	}

	public void setVitaminaB12(String vitaminaB12) {
		this.vitaminaB12 = vitaminaB12;
	}

	public String getVldl() {
		return this.vldl;
	}

	public void setVldl(String vldl) {
		this.vldl = vldl;
	}

}