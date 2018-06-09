package com.kodigo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the examen_heces database table.
 * 
 */
@Entity
@Table(name="examen_heces")
@NamedQuery(name="ExamenHece.findAll", query="SELECT e FROM Examen_heces e")
public class Examen_heces implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_examen_heces")
	private int idExamenHeces;

	@Column(name="dos_almidones")
	private String dosAlmidones;

	@Column(name="dos_ameba_coli")
	private String dosAmebaColi;

	@Column(name="dos_ameba_histolitica")
	private String dosAmebaHistolitica;

	@Column(name="dos_ascaris_lumbricoides")
	private String dosAscarisLumbricoides;

	@Column(name="dos_blastocistis_hominis")
	private String dosBlastocistisHominis;

	@Column(name="dos_chilomastix_mesnili")
	private String dosChilomastixMesnili;

	@Column(name="dos_clinitest")
	private String dosClinitest;

	@Column(name="dos_color")
	private String dosColor;

	@Column(name="dos_cosistencia")
	private String dosCosistencia;

	@Column(name="dos_embadomonas_hominis")
	private String dosEmbadomonasHominis;

	@Column(name="dos_endolimax_nana")
	private String dosEndolimaxNana;

	@Column(name="dos_esporas_hongos")
	private String dosEsporasHongos;

	@Column(name="dos_flora_bacteriana")
	private String dosFloraBacteriana;

	@Column(name="dos_giardia_lamblia")
	private String dosGiardiaLamblia;

	@Column(name="dos_grasas")
	private String dosGrasas;

	@Column(name="dos_helicobacter_pylori")
	private String dosHelicobacterPylori;

	@Column(name="dos_hematies")
	private String dosHematies;

	@Column(name="dos_himenolepis_diminuta")
	private String dosHimenolepisDiminuta;

	@Column(name="dos_himenolepis_nana")
	private String dosHimenolepisNana;

	@Column(name="dos_ipmn")
	private String dosIpmn;

	@Column(name="dos_levaduras")
	private String dosLevaduras;

	@Column(name="dos_moco")
	private String dosMoco;

	@Column(name="dos_oxiuros")
	private String dosOxiuros;

	@Column(name="dos_parasitario")
	private String dosParasitario;

	@Column(name="dos_ph")
	private String dosPh;

	@Column(name="dos_piocitos")
	private String dosPiocitos;

	@Column(name="dos_restos_vegetales")
	private String dosRestosVegetales;

	@Column(name="dos_rotavirus")
	private String dosRotavirus;

	@Column(name="dos_saginata")
	private String dosSaginata;

	@Column(name="dos_sangre_oculta")
	private String dosSangreOculta;

	@Column(name="dos_strongiloides_stercoralis")
	private String dosStrongiloidesStercoralis;

	@Column(name="dos_sudan_iii")
	private String dosSudanIii;

	@Column(name="dos_tenias_solium")
	private String dosTeniasSolium;

	@Column(name="dos_trichomonas_hominis")
	private String dosTrichomonasHominis;

	@Column(name="dos_tricocefalos")
	private String dosTricocefalos;

	@Column(name="dos_uncinairas")
	private String dosUncinairas;

	@Column(name="dos_yodameba_butschlii")
	private String dosYodamebaButschlii;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="id_paciente")
	private int idPaciente;

	@Column(name="tres_almidones")
	private String tresAlmidones;

	@Column(name="tres_ameba_coli")
	private String tresAmebaColi;

	@Column(name="tres_ameba_histolitica")
	private String tresAmebaHistolitica;

	@Column(name="tres_ascaris_lumbricoides")
	private String tresAscarisLumbricoides;

	@Column(name="tres_blastocistis_hominis")
	private String tresBlastocistisHominis;

	@Column(name="tres_chilomastix_mesnili")
	private String tresChilomastixMesnili;

	@Column(name="tres_clinitest")
	private String tresClinitest;

	@Column(name="tres_color")
	private String tresColor;

	@Column(name="tres_cosistencia")
	private String tresCosistencia;

	@Column(name="tres_embadomonas_hominis")
	private String tresEmbadomonasHominis;

	@Column(name="tres_endolimax_nana")
	private String tresEndolimaxNana;

	@Column(name="tres_esporas_hongos")
	private String tresEsporasHongos;

	@Column(name="tres_flora_bacteriana")
	private String tresFloraBacteriana;

	@Column(name="tres_giardia_lamblia")
	private String tresGiardiaLamblia;

	@Column(name="tres_grasas")
	private String tresGrasas;

	@Column(name="tres_helicobacter_pylori")
	private String tresHelicobacterPylori;

	@Column(name="tres_hematies")
	private String tresHematies;

	@Column(name="tres_himenolepis_diminuta")
	private String tresHimenolepisDiminuta;

	@Column(name="tres_himenolepis_nana")
	private String tresHimenolepisNana;

	@Column(name="tres_ipmn")
	private String tresIpmn;

	@Column(name="tres_levaduras")
	private String tresLevaduras;

	@Column(name="tres_moco")
	private String tresMoco;

	@Column(name="tres_oxiuros")
	private String tresOxiuros;

	@Column(name="tres_parasitario")
	private String tresParasitario;

	@Column(name="tres_ph")
	private String tresPh;

	@Column(name="tres_piocitos")
	private String tresPiocitos;

	@Column(name="tres_restos_vegetales")
	private String tresRestosVegetales;

	@Column(name="tres_rotavirus")
	private String tresRotavirus;

	@Column(name="tres_saginata")
	private String tresSaginata;

	@Column(name="tres_sangre_oculta")
	private String tresSangreOculta;

	@Column(name="tres_strongiloides_stercoralis")
	private String tresStrongiloidesStercoralis;

	@Column(name="tres_sudan_iii")
	private String tresSudanIii;

	@Column(name="tres_tenias_solium")
	private String tresTeniasSolium;

	@Column(name="tres_trichomonas_hominis")
	private String tresTrichomonasHominis;

	@Column(name="tres_tricocefalos")
	private String tresTricocefalos;

	@Column(name="tres_uncinairas")
	private String tresUncinairas;

	@Column(name="tres_yodameba_butschlii")
	private String tresYodamebaButschlii;

	@Column(name="uno_almidones")
	private String unoAlmidones;

	@Column(name="uno_ameba_coli")
	private String unoAmebaColi;

	@Column(name="uno_ameba_histolitica")
	private String unoAmebaHistolitica;

	@Column(name="uno_ascaris_lumbricoides")
	private String unoAscarisLumbricoides;

	@Column(name="uno_blastocistis_hominis")
	private String unoBlastocistisHominis;

	@Column(name="uno_chilomastix_mesnili")
	private String unoChilomastixMesnili;

	@Column(name="uno_clinitest")
	private String unoClinitest;

	@Column(name="uno_color")
	private String unoColor;

	@Column(name="uno_cosistencia")
	private String unoCosistencia;

	@Column(name="uno_embadomonas_hominis")
	private String unoEmbadomonasHominis;

	@Column(name="uno_endolimax_nana")
	private String unoEndolimaxNana;

	@Column(name="uno_esporas_hongos")
	private String unoEsporasHongos;

	@Column(name="uno_flora_bacteriana")
	private String unoFloraBacteriana;

	@Column(name="uno_giardia_lamblia")
	private String unoGiardiaLamblia;

	@Column(name="uno_grasas")
	private String unoGrasas;

	@Column(name="uno_helicobacter_pylori")
	private String unoHelicobacterPylori;

	@Column(name="uno_hematies")
	private String unoHematies;

	@Column(name="uno_himenolepis_diminuta")
	private String unoHimenolepisDiminuta;

	@Column(name="uno_himenolepis_nana")
	private String unoHimenolepisNana;

	@Column(name="uno_ipmn")
	private String unoIpmn;

	@Column(name="uno_levaduras")
	private String unoLevaduras;

	@Column(name="uno_moco")
	private String unoMoco;

	@Column(name="uno_oxiuros")
	private String unoOxiuros;

	@Column(name="uno_parasitario")
	private String unoParasitario;

	@Column(name="uno_ph")
	private String unoPh;

	@Column(name="uno_piocitos")
	private String unoPiocitos;

	@Column(name="uno_restos_vegetales")
	private String unoRestosVegetales;

	@Column(name="uno_rotavirus")
	private String unoRotavirus;

	@Column(name="uno_saginata")
	private String unoSaginata;

	@Column(name="uno_sangre_oculta")
	private String unoSangreOculta;

	@Column(name="uno_strongiloides_stercoralis")
	private String unoStrongiloidesStercoralis;

	@Column(name="uno_sudan_iii")
	private String unoSudanIii;

	@Column(name="uno_tenias_solium")
	private String unoTeniasSolium;

	@Column(name="uno_trichomonas_hominis")
	private String unoTrichomonasHominis;

	@Column(name="uno_tricocefalos")
	private String unoTricocefalos;

	@Column(name="uno_uncinairas")
	private String unoUncinairas;

	@Column(name="uno_yodameba_butschlii")
	private String unoYodamebaButschlii;

	public Examen_heces() {
	}

	public int getIdExamenHeces() {
		return this.idExamenHeces;
	}

	public void setIdExamenHeces(int idExamenHeces) {
		this.idExamenHeces = idExamenHeces;
	}

	public String getDosAlmidones() {
		return this.dosAlmidones;
	}

	public void setDosAlmidones(String dosAlmidones) {
		this.dosAlmidones = dosAlmidones;
	}

	public String getDosAmebaColi() {
		return this.dosAmebaColi;
	}

	public void setDosAmebaColi(String dosAmebaColi) {
		this.dosAmebaColi = dosAmebaColi;
	}

	public String getDosAmebaHistolitica() {
		return this.dosAmebaHistolitica;
	}

	public void setDosAmebaHistolitica(String dosAmebaHistolitica) {
		this.dosAmebaHistolitica = dosAmebaHistolitica;
	}

	public String getDosAscarisLumbricoides() {
		return this.dosAscarisLumbricoides;
	}

	public void setDosAscarisLumbricoides(String dosAscarisLumbricoides) {
		this.dosAscarisLumbricoides = dosAscarisLumbricoides;
	}

	public String getDosBlastocistisHominis() {
		return this.dosBlastocistisHominis;
	}

	public void setDosBlastocistisHominis(String dosBlastocistisHominis) {
		this.dosBlastocistisHominis = dosBlastocistisHominis;
	}

	public String getDosChilomastixMesnili() {
		return this.dosChilomastixMesnili;
	}

	public void setDosChilomastixMesnili(String dosChilomastixMesnili) {
		this.dosChilomastixMesnili = dosChilomastixMesnili;
	}

	public String getDosClinitest() {
		return this.dosClinitest;
	}

	public void setDosClinitest(String dosClinitest) {
		this.dosClinitest = dosClinitest;
	}

	public String getDosColor() {
		return this.dosColor;
	}

	public void setDosColor(String dosColor) {
		this.dosColor = dosColor;
	}

	public String getDosCosistencia() {
		return this.dosCosistencia;
	}

	public void setDosCosistencia(String dosCosistencia) {
		this.dosCosistencia = dosCosistencia;
	}

	public String getDosEmbadomonasHominis() {
		return this.dosEmbadomonasHominis;
	}

	public void setDosEmbadomonasHominis(String dosEmbadomonasHominis) {
		this.dosEmbadomonasHominis = dosEmbadomonasHominis;
	}

	public String getDosEndolimaxNana() {
		return this.dosEndolimaxNana;
	}

	public void setDosEndolimaxNana(String dosEndolimaxNana) {
		this.dosEndolimaxNana = dosEndolimaxNana;
	}

	public String getDosEsporasHongos() {
		return this.dosEsporasHongos;
	}

	public void setDosEsporasHongos(String dosEsporasHongos) {
		this.dosEsporasHongos = dosEsporasHongos;
	}

	public String getDosFloraBacteriana() {
		return this.dosFloraBacteriana;
	}

	public void setDosFloraBacteriana(String dosFloraBacteriana) {
		this.dosFloraBacteriana = dosFloraBacteriana;
	}

	public String getDosGiardiaLamblia() {
		return this.dosGiardiaLamblia;
	}

	public void setDosGiardiaLamblia(String dosGiardiaLamblia) {
		this.dosGiardiaLamblia = dosGiardiaLamblia;
	}

	public String getDosGrasas() {
		return this.dosGrasas;
	}

	public void setDosGrasas(String dosGrasas) {
		this.dosGrasas = dosGrasas;
	}

	public String getDosHelicobacterPylori() {
		return this.dosHelicobacterPylori;
	}

	public void setDosHelicobacterPylori(String dosHelicobacterPylori) {
		this.dosHelicobacterPylori = dosHelicobacterPylori;
	}

	public String getDosHematies() {
		return this.dosHematies;
	}

	public void setDosHematies(String dosHematies) {
		this.dosHematies = dosHematies;
	}

	public String getDosHimenolepisDiminuta() {
		return this.dosHimenolepisDiminuta;
	}

	public void setDosHimenolepisDiminuta(String dosHimenolepisDiminuta) {
		this.dosHimenolepisDiminuta = dosHimenolepisDiminuta;
	}

	public String getDosHimenolepisNana() {
		return this.dosHimenolepisNana;
	}

	public void setDosHimenolepisNana(String dosHimenolepisNana) {
		this.dosHimenolepisNana = dosHimenolepisNana;
	}

	public String getDosIpmn() {
		return this.dosIpmn;
	}

	public void setDosIpmn(String dosIpmn) {
		this.dosIpmn = dosIpmn;
	}

	public String getDosLevaduras() {
		return this.dosLevaduras;
	}

	public void setDosLevaduras(String dosLevaduras) {
		this.dosLevaduras = dosLevaduras;
	}

	public String getDosMoco() {
		return this.dosMoco;
	}

	public void setDosMoco(String dosMoco) {
		this.dosMoco = dosMoco;
	}

	public String getDosOxiuros() {
		return this.dosOxiuros;
	}

	public void setDosOxiuros(String dosOxiuros) {
		this.dosOxiuros = dosOxiuros;
	}

	public String getDosParasitario() {
		return this.dosParasitario;
	}

	public void setDosParasitario(String dosParasitario) {
		this.dosParasitario = dosParasitario;
	}

	public String getDosPh() {
		return this.dosPh;
	}

	public void setDosPh(String dosPh) {
		this.dosPh = dosPh;
	}

	public String getDosPiocitos() {
		return this.dosPiocitos;
	}

	public void setDosPiocitos(String dosPiocitos) {
		this.dosPiocitos = dosPiocitos;
	}

	public String getDosRestosVegetales() {
		return this.dosRestosVegetales;
	}

	public void setDosRestosVegetales(String dosRestosVegetales) {
		this.dosRestosVegetales = dosRestosVegetales;
	}

	public String getDosRotavirus() {
		return this.dosRotavirus;
	}

	public void setDosRotavirus(String dosRotavirus) {
		this.dosRotavirus = dosRotavirus;
	}

	public String getDosSaginata() {
		return this.dosSaginata;
	}

	public void setDosSaginata(String dosSaginata) {
		this.dosSaginata = dosSaginata;
	}

	public String getDosSangreOculta() {
		return this.dosSangreOculta;
	}

	public void setDosSangreOculta(String dosSangreOculta) {
		this.dosSangreOculta = dosSangreOculta;
	}

	public String getDosStrongiloidesStercoralis() {
		return this.dosStrongiloidesStercoralis;
	}

	public void setDosStrongiloidesStercoralis(String dosStrongiloidesStercoralis) {
		this.dosStrongiloidesStercoralis = dosStrongiloidesStercoralis;
	}

	public String getDosSudanIii() {
		return this.dosSudanIii;
	}

	public void setDosSudanIii(String dosSudanIii) {
		this.dosSudanIii = dosSudanIii;
	}

	public String getDosTeniasSolium() {
		return this.dosTeniasSolium;
	}

	public void setDosTeniasSolium(String dosTeniasSolium) {
		this.dosTeniasSolium = dosTeniasSolium;
	}

	public String getDosTrichomonasHominis() {
		return this.dosTrichomonasHominis;
	}

	public void setDosTrichomonasHominis(String dosTrichomonasHominis) {
		this.dosTrichomonasHominis = dosTrichomonasHominis;
	}

	public String getDosTricocefalos() {
		return this.dosTricocefalos;
	}

	public void setDosTricocefalos(String dosTricocefalos) {
		this.dosTricocefalos = dosTricocefalos;
	}

	public String getDosUncinairas() {
		return this.dosUncinairas;
	}

	public void setDosUncinairas(String dosUncinairas) {
		this.dosUncinairas = dosUncinairas;
	}

	public String getDosYodamebaButschlii() {
		return this.dosYodamebaButschlii;
	}

	public void setDosYodamebaButschlii(String dosYodamebaButschlii) {
		this.dosYodamebaButschlii = dosYodamebaButschlii;
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

	public String getTresAlmidones() {
		return this.tresAlmidones;
	}

	public void setTresAlmidones(String tresAlmidones) {
		this.tresAlmidones = tresAlmidones;
	}

	public String getTresAmebaColi() {
		return this.tresAmebaColi;
	}

	public void setTresAmebaColi(String tresAmebaColi) {
		this.tresAmebaColi = tresAmebaColi;
	}

	public String getTresAmebaHistolitica() {
		return this.tresAmebaHistolitica;
	}

	public void setTresAmebaHistolitica(String tresAmebaHistolitica) {
		this.tresAmebaHistolitica = tresAmebaHistolitica;
	}

	public String getTresAscarisLumbricoides() {
		return this.tresAscarisLumbricoides;
	}

	public void setTresAscarisLumbricoides(String tresAscarisLumbricoides) {
		this.tresAscarisLumbricoides = tresAscarisLumbricoides;
	}

	public String getTresBlastocistisHominis() {
		return this.tresBlastocistisHominis;
	}

	public void setTresBlastocistisHominis(String tresBlastocistisHominis) {
		this.tresBlastocistisHominis = tresBlastocistisHominis;
	}

	public String getTresChilomastixMesnili() {
		return this.tresChilomastixMesnili;
	}

	public void setTresChilomastixMesnili(String tresChilomastixMesnili) {
		this.tresChilomastixMesnili = tresChilomastixMesnili;
	}

	public String getTresClinitest() {
		return this.tresClinitest;
	}

	public void setTresClinitest(String tresClinitest) {
		this.tresClinitest = tresClinitest;
	}

	public String getTresColor() {
		return this.tresColor;
	}

	public void setTresColor(String tresColor) {
		this.tresColor = tresColor;
	}

	public String getTresCosistencia() {
		return this.tresCosistencia;
	}

	public void setTresCosistencia(String tresCosistencia) {
		this.tresCosistencia = tresCosistencia;
	}

	public String getTresEmbadomonasHominis() {
		return this.tresEmbadomonasHominis;
	}

	public void setTresEmbadomonasHominis(String tresEmbadomonasHominis) {
		this.tresEmbadomonasHominis = tresEmbadomonasHominis;
	}

	public String getTresEndolimaxNana() {
		return this.tresEndolimaxNana;
	}

	public void setTresEndolimaxNana(String tresEndolimaxNana) {
		this.tresEndolimaxNana = tresEndolimaxNana;
	}

	public String getTresEsporasHongos() {
		return this.tresEsporasHongos;
	}

	public void setTresEsporasHongos(String tresEsporasHongos) {
		this.tresEsporasHongos = tresEsporasHongos;
	}

	public String getTresFloraBacteriana() {
		return this.tresFloraBacteriana;
	}

	public void setTresFloraBacteriana(String tresFloraBacteriana) {
		this.tresFloraBacteriana = tresFloraBacteriana;
	}

	public String getTresGiardiaLamblia() {
		return this.tresGiardiaLamblia;
	}

	public void setTresGiardiaLamblia(String tresGiardiaLamblia) {
		this.tresGiardiaLamblia = tresGiardiaLamblia;
	}

	public String getTresGrasas() {
		return this.tresGrasas;
	}

	public void setTresGrasas(String tresGrasas) {
		this.tresGrasas = tresGrasas;
	}

	public String getTresHelicobacterPylori() {
		return this.tresHelicobacterPylori;
	}

	public void setTresHelicobacterPylori(String tresHelicobacterPylori) {
		this.tresHelicobacterPylori = tresHelicobacterPylori;
	}

	public String getTresHematies() {
		return this.tresHematies;
	}

	public void setTresHematies(String tresHematies) {
		this.tresHematies = tresHematies;
	}

	public String getTresHimenolepisDiminuta() {
		return this.tresHimenolepisDiminuta;
	}

	public void setTresHimenolepisDiminuta(String tresHimenolepisDiminuta) {
		this.tresHimenolepisDiminuta = tresHimenolepisDiminuta;
	}

	public String getTresHimenolepisNana() {
		return this.tresHimenolepisNana;
	}

	public void setTresHimenolepisNana(String tresHimenolepisNana) {
		this.tresHimenolepisNana = tresHimenolepisNana;
	}

	public String getTresIpmn() {
		return this.tresIpmn;
	}

	public void setTresIpmn(String tresIpmn) {
		this.tresIpmn = tresIpmn;
	}

	public String getTresLevaduras() {
		return this.tresLevaduras;
	}

	public void setTresLevaduras(String tresLevaduras) {
		this.tresLevaduras = tresLevaduras;
	}

	public String getTresMoco() {
		return this.tresMoco;
	}

	public void setTresMoco(String tresMoco) {
		this.tresMoco = tresMoco;
	}

	public String getTresOxiuros() {
		return this.tresOxiuros;
	}

	public void setTresOxiuros(String tresOxiuros) {
		this.tresOxiuros = tresOxiuros;
	}

	public String getTresParasitario() {
		return this.tresParasitario;
	}

	public void setTresParasitario(String tresParasitario) {
		this.tresParasitario = tresParasitario;
	}

	public String getTresPh() {
		return this.tresPh;
	}

	public void setTresPh(String tresPh) {
		this.tresPh = tresPh;
	}

	public String getTresPiocitos() {
		return this.tresPiocitos;
	}

	public void setTresPiocitos(String tresPiocitos) {
		this.tresPiocitos = tresPiocitos;
	}

	public String getTresRestosVegetales() {
		return this.tresRestosVegetales;
	}

	public void setTresRestosVegetales(String tresRestosVegetales) {
		this.tresRestosVegetales = tresRestosVegetales;
	}

	public String getTresRotavirus() {
		return this.tresRotavirus;
	}

	public void setTresRotavirus(String tresRotavirus) {
		this.tresRotavirus = tresRotavirus;
	}

	public String getTresSaginata() {
		return this.tresSaginata;
	}

	public void setTresSaginata(String tresSaginata) {
		this.tresSaginata = tresSaginata;
	}

	public String getTresSangreOculta() {
		return this.tresSangreOculta;
	}

	public void setTresSangreOculta(String tresSangreOculta) {
		this.tresSangreOculta = tresSangreOculta;
	}

	public String getTresStrongiloidesStercoralis() {
		return this.tresStrongiloidesStercoralis;
	}

	public void setTresStrongiloidesStercoralis(String tresStrongiloidesStercoralis) {
		this.tresStrongiloidesStercoralis = tresStrongiloidesStercoralis;
	}

	public String getTresSudanIii() {
		return this.tresSudanIii;
	}

	public void setTresSudanIii(String tresSudanIii) {
		this.tresSudanIii = tresSudanIii;
	}

	public String getTresTeniasSolium() {
		return this.tresTeniasSolium;
	}

	public void setTresTeniasSolium(String tresTeniasSolium) {
		this.tresTeniasSolium = tresTeniasSolium;
	}

	public String getTresTrichomonasHominis() {
		return this.tresTrichomonasHominis;
	}

	public void setTresTrichomonasHominis(String tresTrichomonasHominis) {
		this.tresTrichomonasHominis = tresTrichomonasHominis;
	}

	public String getTresTricocefalos() {
		return this.tresTricocefalos;
	}

	public void setTresTricocefalos(String tresTricocefalos) {
		this.tresTricocefalos = tresTricocefalos;
	}

	public String getTresUncinairas() {
		return this.tresUncinairas;
	}

	public void setTresUncinairas(String tresUncinairas) {
		this.tresUncinairas = tresUncinairas;
	}

	public String getTresYodamebaButschlii() {
		return this.tresYodamebaButschlii;
	}

	public void setTresYodamebaButschlii(String tresYodamebaButschlii) {
		this.tresYodamebaButschlii = tresYodamebaButschlii;
	}

	public String getUnoAlmidones() {
		return this.unoAlmidones;
	}

	public void setUnoAlmidones(String unoAlmidones) {
		this.unoAlmidones = unoAlmidones;
	}

	public String getUnoAmebaColi() {
		return this.unoAmebaColi;
	}

	public void setUnoAmebaColi(String unoAmebaColi) {
		this.unoAmebaColi = unoAmebaColi;
	}

	public String getUnoAmebaHistolitica() {
		return this.unoAmebaHistolitica;
	}

	public void setUnoAmebaHistolitica(String unoAmebaHistolitica) {
		this.unoAmebaHistolitica = unoAmebaHistolitica;
	}

	public String getUnoAscarisLumbricoides() {
		return this.unoAscarisLumbricoides;
	}

	public void setUnoAscarisLumbricoides(String unoAscarisLumbricoides) {
		this.unoAscarisLumbricoides = unoAscarisLumbricoides;
	}

	public String getUnoBlastocistisHominis() {
		return this.unoBlastocistisHominis;
	}

	public void setUnoBlastocistisHominis(String unoBlastocistisHominis) {
		this.unoBlastocistisHominis = unoBlastocistisHominis;
	}

	public String getUnoChilomastixMesnili() {
		return this.unoChilomastixMesnili;
	}

	public void setUnoChilomastixMesnili(String unoChilomastixMesnili) {
		this.unoChilomastixMesnili = unoChilomastixMesnili;
	}

	public String getUnoClinitest() {
		return this.unoClinitest;
	}

	public void setUnoClinitest(String unoClinitest) {
		this.unoClinitest = unoClinitest;
	}

	public String getUnoColor() {
		return this.unoColor;
	}

	public void setUnoColor(String unoColor) {
		this.unoColor = unoColor;
	}

	public String getUnoCosistencia() {
		return this.unoCosistencia;
	}

	public void setUnoCosistencia(String unoCosistencia) {
		this.unoCosistencia = unoCosistencia;
	}

	public String getUnoEmbadomonasHominis() {
		return this.unoEmbadomonasHominis;
	}

	public void setUnoEmbadomonasHominis(String unoEmbadomonasHominis) {
		this.unoEmbadomonasHominis = unoEmbadomonasHominis;
	}

	public String getUnoEndolimaxNana() {
		return this.unoEndolimaxNana;
	}

	public void setUnoEndolimaxNana(String unoEndolimaxNana) {
		this.unoEndolimaxNana = unoEndolimaxNana;
	}

	public String getUnoEsporasHongos() {
		return this.unoEsporasHongos;
	}

	public void setUnoEsporasHongos(String unoEsporasHongos) {
		this.unoEsporasHongos = unoEsporasHongos;
	}

	public String getUnoFloraBacteriana() {
		return this.unoFloraBacteriana;
	}

	public void setUnoFloraBacteriana(String unoFloraBacteriana) {
		this.unoFloraBacteriana = unoFloraBacteriana;
	}

	public String getUnoGiardiaLamblia() {
		return this.unoGiardiaLamblia;
	}

	public void setUnoGiardiaLamblia(String unoGiardiaLamblia) {
		this.unoGiardiaLamblia = unoGiardiaLamblia;
	}

	public String getUnoGrasas() {
		return this.unoGrasas;
	}

	public void setUnoGrasas(String unoGrasas) {
		this.unoGrasas = unoGrasas;
	}

	public String getUnoHelicobacterPylori() {
		return this.unoHelicobacterPylori;
	}

	public void setUnoHelicobacterPylori(String unoHelicobacterPylori) {
		this.unoHelicobacterPylori = unoHelicobacterPylori;
	}

	public String getUnoHematies() {
		return this.unoHematies;
	}

	public void setUnoHematies(String unoHematies) {
		this.unoHematies = unoHematies;
	}

	public String getUnoHimenolepisDiminuta() {
		return this.unoHimenolepisDiminuta;
	}

	public void setUnoHimenolepisDiminuta(String unoHimenolepisDiminuta) {
		this.unoHimenolepisDiminuta = unoHimenolepisDiminuta;
	}

	public String getUnoHimenolepisNana() {
		return this.unoHimenolepisNana;
	}

	public void setUnoHimenolepisNana(String unoHimenolepisNana) {
		this.unoHimenolepisNana = unoHimenolepisNana;
	}

	public String getUnoIpmn() {
		return this.unoIpmn;
	}

	public void setUnoIpmn(String unoIpmn) {
		this.unoIpmn = unoIpmn;
	}

	public String getUnoLevaduras() {
		return this.unoLevaduras;
	}

	public void setUnoLevaduras(String unoLevaduras) {
		this.unoLevaduras = unoLevaduras;
	}

	public String getUnoMoco() {
		return this.unoMoco;
	}

	public void setUnoMoco(String unoMoco) {
		this.unoMoco = unoMoco;
	}

	public String getUnoOxiuros() {
		return this.unoOxiuros;
	}

	public void setUnoOxiuros(String unoOxiuros) {
		this.unoOxiuros = unoOxiuros;
	}

	public String getUnoParasitario() {
		return this.unoParasitario;
	}

	public void setUnoParasitario(String unoParasitario) {
		this.unoParasitario = unoParasitario;
	}

	public String getUnoPh() {
		return this.unoPh;
	}

	public void setUnoPh(String unoPh) {
		this.unoPh = unoPh;
	}

	public String getUnoPiocitos() {
		return this.unoPiocitos;
	}

	public void setUnoPiocitos(String unoPiocitos) {
		this.unoPiocitos = unoPiocitos;
	}

	public String getUnoRestosVegetales() {
		return this.unoRestosVegetales;
	}

	public void setUnoRestosVegetales(String unoRestosVegetales) {
		this.unoRestosVegetales = unoRestosVegetales;
	}

	public String getUnoRotavirus() {
		return this.unoRotavirus;
	}

	public void setUnoRotavirus(String unoRotavirus) {
		this.unoRotavirus = unoRotavirus;
	}

	public String getUnoSaginata() {
		return this.unoSaginata;
	}

	public void setUnoSaginata(String unoSaginata) {
		this.unoSaginata = unoSaginata;
	}

	public String getUnoSangreOculta() {
		return this.unoSangreOculta;
	}

	public void setUnoSangreOculta(String unoSangreOculta) {
		this.unoSangreOculta = unoSangreOculta;
	}

	public String getUnoStrongiloidesStercoralis() {
		return this.unoStrongiloidesStercoralis;
	}

	public void setUnoStrongiloidesStercoralis(String unoStrongiloidesStercoralis) {
		this.unoStrongiloidesStercoralis = unoStrongiloidesStercoralis;
	}

	public String getUnoSudanIii() {
		return this.unoSudanIii;
	}

	public void setUnoSudanIii(String unoSudanIii) {
		this.unoSudanIii = unoSudanIii;
	}

	public String getUnoTeniasSolium() {
		return this.unoTeniasSolium;
	}

	public void setUnoTeniasSolium(String unoTeniasSolium) {
		this.unoTeniasSolium = unoTeniasSolium;
	}

	public String getUnoTrichomonasHominis() {
		return this.unoTrichomonasHominis;
	}

	public void setUnoTrichomonasHominis(String unoTrichomonasHominis) {
		this.unoTrichomonasHominis = unoTrichomonasHominis;
	}

	public String getUnoTricocefalos() {
		return this.unoTricocefalos;
	}

	public void setUnoTricocefalos(String unoTricocefalos) {
		this.unoTricocefalos = unoTricocefalos;
	}

	public String getUnoUncinairas() {
		return this.unoUncinairas;
	}

	public void setUnoUncinairas(String unoUncinairas) {
		this.unoUncinairas = unoUncinairas;
	}

	public String getUnoYodamebaButschlii() {
		return this.unoYodamebaButschlii;
	}

	public void setUnoYodamebaButschlii(String unoYodamebaButschlii) {
		this.unoYodamebaButschlii = unoYodamebaButschlii;
	}

}