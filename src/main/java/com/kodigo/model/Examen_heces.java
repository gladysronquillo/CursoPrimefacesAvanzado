package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the examen_heces database table.
 * 
 */
@Entity
@Table(name="Examen_heces")
@NamedQuery(name="Examen_heces.findAll", query="SELECT e FROM Examen_heces e")
public class Examen_heces implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_examen_heces")
	private int idExamenHeces;

	private String almidones;

	@Column(name="ameba_coli")
	private String amebaColi;

	@Column(name="ameba_histolitica")
	private String amebaHistolitica;

	@Column(name="ascaris_lumbricoides")
	private String ascarisLumbricoides;

	@Column(name="blastocistis_hominis")
	private String blastocistisHominis;

	@Column(name="chilomastix_mesnili")
	private String chilomastixMesnili;

	private String clinitest;

	private String color;

	private String cosistencia;

	@Column(name="embadomonas_hominis")
	private String embadomonasHominis;

	@Column(name="endolimax_nana")
	private String endolimaxNana;

	@Column(name="esporas_hongos")
	private String esporasHongos;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="flora_bacteriana")
	private String floraBacteriana;

	@Column(name="giardia_lamblia")
	private String giardiaLamblia;

	private String grasas;

	@Column(name="helicobacter_pylori")
	private String helicobacterPylori;

	private String hematies;

	@Column(name="himenolepis_diminuta")
	private String himenolepisDiminuta;

	@Column(name="himenolepis_nana")
	private String himenolepisNana;

	@Column(name="id_paciente")
	private int idPaciente;

	private String ipmn;

	private String levaduras;

	private String moco;

	private String oxiuros;

	private String parasitario;

	private String ph;

	private String piocitos;

	@Column(name="restos_vegetales")
	private String restosVegetales;

	private String rotavirus;

	private String saginata;

	@Column(name="sangre_oculta")
	private String sangreOculta;

	@Column(name="strongiloides_stercoralis")
	private String strongiloidesStercoralis;

	@Column(name="sudan_iii")
	private String sudanIii;

	@Column(name="tenias_solium")
	private String teniasSolium;

	@Column(name="trichomonas_hominis")
	private String trichomonasHominis;

	private String tricocefalos;

	private String uncinairas;

	@Column(name="yodameba_butschlii")
	private String yodamebaButschlii;

	public Examen_heces() {
	}

	public int getIdExamenHeces() {
		return this.idExamenHeces;
	}

	public void setIdExamenHeces(int idExamenHeces) {
		this.idExamenHeces = idExamenHeces;
	}

	public String getAlmidones() {
		return this.almidones;
	}

	public void setAlmidones(String almidones) {
		this.almidones = almidones;
	}

	public String getAmebaColi() {
		return this.amebaColi;
	}

	public void setAmebaColi(String amebaColi) {
		this.amebaColi = amebaColi;
	}

	public String getAmebaHistolitica() {
		return this.amebaHistolitica;
	}

	public void setAmebaHistolitica(String amebaHistolitica) {
		this.amebaHistolitica = amebaHistolitica;
	}

	public String getAscarisLumbricoides() {
		return this.ascarisLumbricoides;
	}

	public void setAscarisLumbricoides(String ascarisLumbricoides) {
		this.ascarisLumbricoides = ascarisLumbricoides;
	}

	public String getBlastocistisHominis() {
		return this.blastocistisHominis;
	}

	public void setBlastocistisHominis(String blastocistisHominis) {
		this.blastocistisHominis = blastocistisHominis;
	}

	public String getChilomastixMesnili() {
		return this.chilomastixMesnili;
	}

	public void setChilomastixMesnili(String chilomastixMesnili) {
		this.chilomastixMesnili = chilomastixMesnili;
	}

	public String getClinitest() {
		return this.clinitest;
	}

	public void setClinitest(String clinitest) {
		this.clinitest = clinitest;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCosistencia() {
		return this.cosistencia;
	}

	public void setCosistencia(String cosistencia) {
		this.cosistencia = cosistencia;
	}

	public String getEmbadomonasHominis() {
		return this.embadomonasHominis;
	}

	public void setEmbadomonasHominis(String embadomonasHominis) {
		this.embadomonasHominis = embadomonasHominis;
	}

	public String getEndolimaxNana() {
		return this.endolimaxNana;
	}

	public void setEndolimaxNana(String endolimaxNana) {
		this.endolimaxNana = endolimaxNana;
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

	public String getFloraBacteriana() {
		return this.floraBacteriana;
	}

	public void setFloraBacteriana(String floraBacteriana) {
		this.floraBacteriana = floraBacteriana;
	}

	public String getGiardiaLamblia() {
		return this.giardiaLamblia;
	}

	public void setGiardiaLamblia(String giardiaLamblia) {
		this.giardiaLamblia = giardiaLamblia;
	}

	public String getGrasas() {
		return this.grasas;
	}

	public void setGrasas(String grasas) {
		this.grasas = grasas;
	}

	public String getHelicobacterPylori() {
		return this.helicobacterPylori;
	}

	public void setHelicobacterPylori(String helicobacterPylori) {
		this.helicobacterPylori = helicobacterPylori;
	}

	public String getHematies() {
		return this.hematies;
	}

	public void setHematies(String hematies) {
		this.hematies = hematies;
	}

	public String getHimenolepisDiminuta() {
		return this.himenolepisDiminuta;
	}

	public void setHimenolepisDiminuta(String himenolepisDiminuta) {
		this.himenolepisDiminuta = himenolepisDiminuta;
	}

	public String getHimenolepisNana() {
		return this.himenolepisNana;
	}

	public void setHimenolepisNana(String himenolepisNana) {
		this.himenolepisNana = himenolepisNana;
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIpmn() {
		return this.ipmn;
	}

	public void setIpmn(String ipmn) {
		this.ipmn = ipmn;
	}

	public String getLevaduras() {
		return this.levaduras;
	}

	public void setLevaduras(String levaduras) {
		this.levaduras = levaduras;
	}

	public String getMoco() {
		return this.moco;
	}

	public void setMoco(String moco) {
		this.moco = moco;
	}

	public String getOxiuros() {
		return this.oxiuros;
	}

	public void setOxiuros(String oxiuros) {
		this.oxiuros = oxiuros;
	}

	public String getParasitario() {
		return this.parasitario;
	}

	public void setParasitario(String parasitario) {
		this.parasitario = parasitario;
	}

	public String getPh() {
		return this.ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getPiocitos() {
		return this.piocitos;
	}

	public void setPiocitos(String piocitos) {
		this.piocitos = piocitos;
	}

	public String getRestosVegetales() {
		return this.restosVegetales;
	}

	public void setRestosVegetales(String restosVegetales) {
		this.restosVegetales = restosVegetales;
	}

	public String getRotavirus() {
		return this.rotavirus;
	}

	public void setRotavirus(String rotavirus) {
		this.rotavirus = rotavirus;
	}

	public String getSaginata() {
		return this.saginata;
	}

	public void setSaginata(String saginata) {
		this.saginata = saginata;
	}

	public String getSangreOculta() {
		return this.sangreOculta;
	}

	public void setSangreOculta(String sangreOculta) {
		this.sangreOculta = sangreOculta;
	}

	public String getStrongiloidesStercoralis() {
		return this.strongiloidesStercoralis;
	}

	public void setStrongiloidesStercoralis(String strongiloidesStercoralis) {
		this.strongiloidesStercoralis = strongiloidesStercoralis;
	}

	public String getSudanIii() {
		return this.sudanIii;
	}

	public void setSudanIii(String sudanIii) {
		this.sudanIii = sudanIii;
	}

	public String getTeniasSolium() {
		return this.teniasSolium;
	}

	public void setTeniasSolium(String teniasSolium) {
		this.teniasSolium = teniasSolium;
	}

	public String getTrichomonasHominis() {
		return this.trichomonasHominis;
	}

	public void setTrichomonasHominis(String trichomonasHominis) {
		this.trichomonasHominis = trichomonasHominis;
	}

	public String getTricocefalos() {
		return this.tricocefalos;
	}

	public void setTricocefalos(String tricocefalos) {
		this.tricocefalos = tricocefalos;
	}

	public String getUncinairas() {
		return this.uncinairas;
	}

	public void setUncinairas(String uncinairas) {
		this.uncinairas = uncinairas;
	}

	public String getYodamebaButschlii() {
		return this.yodamebaButschlii;
	}

	public void setYodamebaButschlii(String yodamebaButschlii) {
		this.yodamebaButschlii = yodamebaButschlii;
	}

}