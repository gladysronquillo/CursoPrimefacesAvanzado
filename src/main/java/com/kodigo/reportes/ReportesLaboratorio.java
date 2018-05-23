package com.kodigo.reportes;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.kodigo.model.Paciente;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@Named
@SessionScoped
public class ReportesLaboratorio implements Serializable {
	private static final long serialVersionUID = 2072950384835762455L;
	Conexion conn = new Conexion();
	String pathReport = "C:\\workspace\\CursoPrimefacesAvanzado\\src\\main\\webapp\\reportes\\";

	// Método general que exporta PDF
	public void exportarPDF(Paciente paciente, String filename) {
		try {
			if (!paciente.equals(null)) {
				// Fecha
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				String fecha = dateFormat.format(date);
				// Se obtiene nombre del paciente
				String patientname = paciente.getApellidos() + "_" + paciente.getNombres();

				// Parámetros a enviarse al reporte jasper
				Map<String, Object> parametros = new HashMap<String, Object>();
				parametros.put("id_paciente", paciente.getId_paciente());
				// Dirección física del archivo
				String jrxmlReport = pathReport + filename + ".jrxml";
				// Lectura y compilación del archivo jrxml a .jasper
				InputStream input = new FileInputStream(new File(jrxmlReport));
				JasperDesign design = JRXmlLoader.load(input);
				JasperReport report = JasperCompileManager.compileReport(design);
				// Se envia la conexión y parámetro id_cliente al reporte
				JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros, conn.abirConexion());

				// Se prepara para exportar el reporte en el navegador
				HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance()
						.getExternalContext().getResponse();
				response.addHeader("Content-disposition",
						"attachment; filename=" + filename + "_" + patientname + "_" + fecha + ".pdf");
				ServletOutputStream outputStream = response.getOutputStream();

				JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
				FacesContext.getCurrentInstance().responseComplete();

				conn.cerrar();
			}
		}

		catch (Exception ex) {
			System.out.println("Mensaje de Error:" + ex.getMessage());
		}
	}

	// Reporte PDF de Serología llamado desde la vista
	public void exportarSerologiaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "serologia";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Bacteriología llamado desde la vista
	public void exportarBacteriologiaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "bacteriologia";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Bioquimica Sanguinea llamado desde la vista
	public void exportarBioquimicaSanguineaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "bioquimica_sanguinea_1";
		this.exportarPDF(paciente, filename);
		String filename2 = "bioquimica_sanguinea_2";
		this.exportarPDF(paciente, filename2);
		String filename3 = "bioquimica_sanguinea_3";
		this.exportarPDF(paciente, filename3);
	}

	// Reporte PDF de Coagulación llamado desde la vista
	public void exportarCoagulacionPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "coagulacion";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Cultivo Antibiograma llamado desde la vista
	public void exportarCultivoAntibiogramaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "cultivo_antibiograma";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Drogas llamado desde la vista
	public void exportarDrogasPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "drogas";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Electrolitos llamado desde la vista
	public void exportarElectrolitosPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "electrolitos";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Espermatograma llamado desde la vista
	public void exportarEspermatogramaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "espermatograma";
		this.exportarPDF(paciente, filename);
	}

	// Reporte PDF de Examen Orina llamado desde la vista
	public void exportarExamenOrinaPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "examen_orina_1";
		String filename2 = "examen_orina_2";
		this.exportarPDF(paciente, filename);
		this.exportarPDF(paciente, filename2);
	}

	// Reporte PDF de Examen Sangre llamado desde la vista
	public void exportarExamenSangrePDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "examen_sangre_1";
		String filename2 = "examen_sangre_2";
		this.exportarPDF(paciente, filename);
		this.exportarPDF(paciente, filename2);
	}

	// Reporte PDF de Electrolitos llamado desde la vista
	public void exportarHormonasPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "hormonas_1";
		String filename2 = "hormonas_2";
		this.exportarPDF(paciente, filename);
		this.exportarPDF(paciente, filename2);
	}

	// Reporte PDF de Marcadores Tumorales llamado desde la vista
	public void exportarMarcadoresTumoralesPDF(Paciente paciente) {
		// Nombre del archivo jrxml con el template del reporte
		String filename = "marcadores_tumorales";
		this.exportarPDF(paciente, filename);
	}

}
