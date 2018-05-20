package com.kodigo.reportes;

import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.kodigo.model.Paciente;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@Named
@SessionScoped
public class ReporteSerologia implements Serializable {
	private static final long serialVersionUID = 2072950384835762455L;

	private Connection conn;
	private final String login = "root"; // usuario de acceso a MySQL
	private final String password = "admin"; // contraseña de usuario
	private String url = "jdbc:mysql://localhost/laboratorio";

	public ReporteSerologia() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // se carga el driver
			conn = DriverManager.getConnection(url, login, password);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void exportarPDF(Paciente paciente) {
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
				// Nombre del archivo jrxml con el template del reporte
				String filename = "serologia";
				// Dirección física del archivo
				String jrxmlReport = "E:\\workspace\\CursoPrimefacesAvanzado\\src\\main\\webapp\\reportes\\" + filename
						+ ".jrxml";
				// Lectura y compilación del archivo jrxml a .jasper
				InputStream input = new FileInputStream(new File(jrxmlReport));
				JasperDesign design = JRXmlLoader.load(input);
				JasperReport report = JasperCompileManager.compileReport(design);
				// Se envia la conexión y parámetro id_cliente al reporte
				JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros, conn);

				// Se prepara para exportar el reporte en el navegador
				HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance()
						.getExternalContext().getResponse();
				response.addHeader("Content-disposition",
						"attachment; filename=" + filename + "_" + patientname + "_" + fecha + ".pdf");
				ServletOutputStream outputStream = response.getOutputStream();

				JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
				FacesContext.getCurrentInstance().responseComplete();
			}
		}

		catch (Exception ex) {
			System.out.println("Mensaje de Error:" + ex.getMessage());
		}
	}

	public void cerrar() {
		try {
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
