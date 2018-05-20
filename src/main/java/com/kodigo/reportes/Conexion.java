package com.kodigo.reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conn;
	private String login = "root";
	private String password = "admin";
	private String url = "jdbc:mysql://localhost/laboratorio";

	public Connection abirConexion() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // se carga el driver
			return conn = DriverManager.getConnection(url, login, password);
			
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
	public void cerrar() {
		try {
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}