package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the inmunologia database table.
 * 
 */
@Entity
@NamedQuery(name="Inmunologia.findAll", query="SELECT i FROM Inmunologia i")
public class Inmunologia implements Serializable {
	private static final long serialVersionUID = -6973037471957483203L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_inmunulogia")
	private int idInmunulogia;

	@Column(name="ac_antifosfolipidos_igc")
	private String acAntifosfolipidosIgc;

	@Column(name="ac_antifosfolipidos_igm")
	private String acAntifosfolipidosIgm;

	@Column(name="ac_antitiroideos")
	private String acAntitiroideos;

	private String ana;

	private String anca;

	@Column(name="anti_cpp")
	private String antiCpp;

	@Column(name="anti_dna_nativo")
	private String antiDnaNativo;

	@Column(name="anti_microsomales")
	private String antiMicrosomales;

	@Column(name="anti_tiroglobulinas")
	private String antiTiroglobulinas;

	@Column(name="anti_tpo")
	private String antiTpo;

	@Column(name="anticore_igg")
	private String anticoreIgg;

	@Column(name="anticore_igm")
	private String anticoreIgm;

	@Column(name="b2_glicoproteina_g")
	private String b2GlicoproteinaG;

	@Column(name="b2_glicoproteina_m")
	private String b2GlicoproteinaM;

	private String c3;

	private String c4;

	@Column(name="cisticercosis_igg")
	private String cisticercosisIgg;

	@Column(name="cisticercosis_igm")
	private String cisticercosisIgm;

	@Column(name="citomegalovirus_igg")
	private String citomegalovirusIgg;

	@Column(name="citomegalovirus_igm")
	private String citomegalovirusIgm;

	@Column(name="clamidea_igg")
	private String clamideaIgg;

	@Column(name="clamidea_igm")
	private String clamideaIgm;

	@Column(name="dengue_igg")
	private String dengueIgg;

	@Column(name="dengue_igm")
	private String dengueIgm;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="fta_abs_sifilis")
	private String ftaAbsSifilis;

	private String h1v12sida;

	@Column(name="hav_igg")
	private String havIgg;

	@Column(name="hav_igm")
	private String havIgm;

	@Column(name="hbsag_antigeno_austral")
	private String hbsagAntigenoAustral;

	private String hcv;

	@Column(name="helicobacter_pylori")
	private String helicobacterPylori;

	@Column(name="helicobacter_pylori_igg")
	private String helicobacterPyloriIgg;

	@Column(name="helicobacter_pylory_igm")
	private String helicobacterPyloryIgm;

	@Column(name="herpes_i_igg")
	private String herpesIIgg;

	@Column(name="herpes_i_igm")
	private String herpesIIgm;

	@Column(name="herpes_ii_igg")
	private String herpesIiIgg;

	@Column(name="herpes_ii_igm")
	private String herpesIiIgm;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="inmunoglubina_a")
	private String inmunoglubinaA;

	@Column(name="inmunoglubina_e")
	private String inmunoglubinaE;

	@Column(name="inmunoglubina_g")
	private String inmunoglubinaG;

	@Column(name="inmunoglubina_ml")
	private String inmunoglubinaMl;

	private String inmunulogiacol;

	@Column(name="mononucleosis_igg")
	private String mononucleosisIgg;

	@Column(name="mononucleosis_igm")
	private String mononucleosisIgm;

	@Column(name="rubeola_igg")
	private String rubeolaIgg;

	@Column(name="rubeola_igm")
	private String rubeolaIgm;

	private String tiroglobulina;

	@Column(name="toxoplasma_igg")
	private String toxoplasmaIgg;

	@Column(name="toxoplasma_igm")
	private String toxoplasmaIgm;

	@Column(name="vit_d_125_dihidroxi")
	private String vitD125Dihidroxi;

	@Column(name="vit_d_25_hidroxi")
	private String vitD25Hidroxi;

	public Inmunologia() {
	}

	public int getIdInmunulogia() {
		return this.idInmunulogia;
	}

	public void setIdInmunulogia(int idInmunulogia) {
		this.idInmunulogia = idInmunulogia;
	}

	public String getAcAntifosfolipidosIgc() {
		return this.acAntifosfolipidosIgc;
	}

	public void setAcAntifosfolipidosIgc(String acAntifosfolipidosIgc) {
		this.acAntifosfolipidosIgc = acAntifosfolipidosIgc;
	}

	public String getAcAntifosfolipidosIgm() {
		return this.acAntifosfolipidosIgm;
	}

	public void setAcAntifosfolipidosIgm(String acAntifosfolipidosIgm) {
		this.acAntifosfolipidosIgm = acAntifosfolipidosIgm;
	}

	public String getAcAntitiroideos() {
		return this.acAntitiroideos;
	}

	public void setAcAntitiroideos(String acAntitiroideos) {
		this.acAntitiroideos = acAntitiroideos;
	}

	public String getAna() {
		return this.ana;
	}

	public void setAna(String ana) {
		this.ana = ana;
	}

	public String getAnca() {
		return this.anca;
	}

	public void setAnca(String anca) {
		this.anca = anca;
	}

	public String getAntiCpp() {
		return this.antiCpp;
	}

	public void setAntiCpp(String antiCpp) {
		this.antiCpp = antiCpp;
	}

	public String getAntiDnaNativo() {
		return this.antiDnaNativo;
	}

	public void setAntiDnaNativo(String antiDnaNativo) {
		this.antiDnaNativo = antiDnaNativo;
	}

	public String getAntiMicrosomales() {
		return this.antiMicrosomales;
	}

	public void setAntiMicrosomales(String antiMicrosomales) {
		this.antiMicrosomales = antiMicrosomales;
	}

	public String getAntiTiroglobulinas() {
		return this.antiTiroglobulinas;
	}

	public void setAntiTiroglobulinas(String antiTiroglobulinas) {
		this.antiTiroglobulinas = antiTiroglobulinas;
	}

	public String getAntiTpo() {
		return this.antiTpo;
	}

	public void setAntiTpo(String antiTpo) {
		this.antiTpo = antiTpo;
	}

	public String getAnticoreIgg() {
		return this.anticoreIgg;
	}

	public void setAnticoreIgg(String anticoreIgg) {
		this.anticoreIgg = anticoreIgg;
	}

	public String getAnticoreIgm() {
		return this.anticoreIgm;
	}

	public void setAnticoreIgm(String anticoreIgm) {
		this.anticoreIgm = anticoreIgm;
	}

	public String getB2GlicoproteinaG() {
		return this.b2GlicoproteinaG;
	}

	public void setB2GlicoproteinaG(String b2GlicoproteinaG) {
		this.b2GlicoproteinaG = b2GlicoproteinaG;
	}

	public String getB2GlicoproteinaM() {
		return this.b2GlicoproteinaM;
	}

	public void setB2GlicoproteinaM(String b2GlicoproteinaM) {
		this.b2GlicoproteinaM = b2GlicoproteinaM;
	}

	public String getC3() {
		return this.c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return this.c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getCisticercosisIgg() {
		return this.cisticercosisIgg;
	}

	public void setCisticercosisIgg(String cisticercosisIgg) {
		this.cisticercosisIgg = cisticercosisIgg;
	}

	public String getCisticercosisIgm() {
		return this.cisticercosisIgm;
	}

	public void setCisticercosisIgm(String cisticercosisIgm) {
		this.cisticercosisIgm = cisticercosisIgm;
	}

	public String getCitomegalovirusIgg() {
		return this.citomegalovirusIgg;
	}

	public void setCitomegalovirusIgg(String citomegalovirusIgg) {
		this.citomegalovirusIgg = citomegalovirusIgg;
	}

	public String getCitomegalovirusIgm() {
		return this.citomegalovirusIgm;
	}

	public void setCitomegalovirusIgm(String citomegalovirusIgm) {
		this.citomegalovirusIgm = citomegalovirusIgm;
	}

	public String getClamideaIgg() {
		return this.clamideaIgg;
	}

	public void setClamideaIgg(String clamideaIgg) {
		this.clamideaIgg = clamideaIgg;
	}

	public String getClamideaIgm() {
		return this.clamideaIgm;
	}

	public void setClamideaIgm(String clamideaIgm) {
		this.clamideaIgm = clamideaIgm;
	}

	public String getDengueIgg() {
		return this.dengueIgg;
	}

	public void setDengueIgg(String dengueIgg) {
		this.dengueIgg = dengueIgg;
	}

	public String getDengueIgm() {
		return this.dengueIgm;
	}

	public void setDengueIgm(String dengueIgm) {
		this.dengueIgm = dengueIgm;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFtaAbsSifilis() {
		return this.ftaAbsSifilis;
	}

	public void setFtaAbsSifilis(String ftaAbsSifilis) {
		this.ftaAbsSifilis = ftaAbsSifilis;
	}

	public String getH1v12sida() {
		return this.h1v12sida;
	}

	public void setH1v12sida(String h1v12sida) {
		this.h1v12sida = h1v12sida;
	}

	public String getHavIgg() {
		return this.havIgg;
	}

	public void setHavIgg(String havIgg) {
		this.havIgg = havIgg;
	}

	public String getHavIgm() {
		return this.havIgm;
	}

	public void setHavIgm(String havIgm) {
		this.havIgm = havIgm;
	}

	public String getHbsagAntigenoAustral() {
		return this.hbsagAntigenoAustral;
	}

	public void setHbsagAntigenoAustral(String hbsagAntigenoAustral) {
		this.hbsagAntigenoAustral = hbsagAntigenoAustral;
	}

	public String getHcv() {
		return this.hcv;
	}

	public void setHcv(String hcv) {
		this.hcv = hcv;
	}

	public String getHelicobacterPylori() {
		return this.helicobacterPylori;
	}

	public void setHelicobacterPylori(String helicobacterPylori) {
		this.helicobacterPylori = helicobacterPylori;
	}

	public String getHelicobacterPyloriIgg() {
		return this.helicobacterPyloriIgg;
	}

	public void setHelicobacterPyloriIgg(String helicobacterPyloriIgg) {
		this.helicobacterPyloriIgg = helicobacterPyloriIgg;
	}

	public String getHelicobacterPyloryIgm() {
		return this.helicobacterPyloryIgm;
	}

	public void setHelicobacterPyloryIgm(String helicobacterPyloryIgm) {
		this.helicobacterPyloryIgm = helicobacterPyloryIgm;
	}

	public String getHerpesIIgg() {
		return this.herpesIIgg;
	}

	public void setHerpesIIgg(String herpesIIgg) {
		this.herpesIIgg = herpesIIgg;
	}

	public String getHerpesIIgm() {
		return this.herpesIIgm;
	}

	public void setHerpesIIgm(String herpesIIgm) {
		this.herpesIIgm = herpesIIgm;
	}

	public String getHerpesIiIgg() {
		return this.herpesIiIgg;
	}

	public void setHerpesIiIgg(String herpesIiIgg) {
		this.herpesIiIgg = herpesIiIgg;
	}

	public String getHerpesIiIgm() {
		return this.herpesIiIgm;
	}

	public void setHerpesIiIgm(String herpesIiIgm) {
		this.herpesIiIgm = herpesIiIgm;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getInmunoglubinaA() {
		return this.inmunoglubinaA;
	}

	public void setInmunoglubinaA(String inmunoglubinaA) {
		this.inmunoglubinaA = inmunoglubinaA;
	}

	public String getInmunoglubinaE() {
		return this.inmunoglubinaE;
	}

	public void setInmunoglubinaE(String inmunoglubinaE) {
		this.inmunoglubinaE = inmunoglubinaE;
	}

	public String getInmunoglubinaG() {
		return this.inmunoglubinaG;
	}

	public void setInmunoglubinaG(String inmunoglubinaG) {
		this.inmunoglubinaG = inmunoglubinaG;
	}

	public String getInmunoglubinaMl() {
		return this.inmunoglubinaMl;
	}

	public void setInmunoglubinaMl(String inmunoglubinaMl) {
		this.inmunoglubinaMl = inmunoglubinaMl;
	}

	public String getInmunulogiacol() {
		return this.inmunulogiacol;
	}

	public void setInmunulogiacol(String inmunulogiacol) {
		this.inmunulogiacol = inmunulogiacol;
	}

	public String getMononucleosisIgg() {
		return this.mononucleosisIgg;
	}

	public void setMononucleosisIgg(String mononucleosisIgg) {
		this.mononucleosisIgg = mononucleosisIgg;
	}

	public String getMononucleosisIgm() {
		return this.mononucleosisIgm;
	}

	public void setMononucleosisIgm(String mononucleosisIgm) {
		this.mononucleosisIgm = mononucleosisIgm;
	}

	public String getRubeolaIgg() {
		return this.rubeolaIgg;
	}

	public void setRubeolaIgg(String rubeolaIgg) {
		this.rubeolaIgg = rubeolaIgg;
	}

	public String getRubeolaIgm() {
		return this.rubeolaIgm;
	}

	public void setRubeolaIgm(String rubeolaIgm) {
		this.rubeolaIgm = rubeolaIgm;
	}

	public String getTiroglobulina() {
		return this.tiroglobulina;
	}

	public void setTiroglobulina(String tiroglobulina) {
		this.tiroglobulina = tiroglobulina;
	}

	public String getToxoplasmaIgg() {
		return this.toxoplasmaIgg;
	}

	public void setToxoplasmaIgg(String toxoplasmaIgg) {
		this.toxoplasmaIgg = toxoplasmaIgg;
	}

	public String getToxoplasmaIgm() {
		return this.toxoplasmaIgm;
	}

	public void setToxoplasmaIgm(String toxoplasmaIgm) {
		this.toxoplasmaIgm = toxoplasmaIgm;
	}

	public String getVitD125Dihidroxi() {
		return this.vitD125Dihidroxi;
	}

	public void setVitD125Dihidroxi(String vitD125Dihidroxi) {
		this.vitD125Dihidroxi = vitD125Dihidroxi;
	}

	public String getVitD25Hidroxi() {
		return this.vitD25Hidroxi;
	}

	public void setVitD25Hidroxi(String vitD25Hidroxi) {
		this.vitD25Hidroxi = vitD25Hidroxi;
	}

}