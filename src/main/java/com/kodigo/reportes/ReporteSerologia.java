package com.kodigo.reportes;

import java.io.File;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

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

	public void runReporte() {

		try {

			String fileName = "C://workspace//CursoPrimefacesAvanzado//src//main//webapp//reportes//serologia.jrxml";

			File theFile = new File(fileName);
			JRDesignQuery newQuery = new JRDesignQuery();
			JasperDesign jasperDesign = JRXmlLoader.load(theFile);
			String theQuery = "";
			newQuery.setText(theQuery);
			jasperDesign.setQuery(newQuery);

			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
			JasperViewer jviewer = new JasperViewer(jasperPrint, false);
			jviewer.setTitle("Sistema de gestión de Cartera");
			jviewer.setVisible(true);

		}

		catch (Exception j) {
			System.out.println("Mensaje de Error:" + j.getMessage());
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
