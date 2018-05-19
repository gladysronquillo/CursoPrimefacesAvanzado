package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.kodigo.interfarces.PacienteFacadeLocal;
import com.kodigo.model.Paciente;

@Named
@SessionScoped
public class PacienteController implements Serializable {

	private static final long serialVersionUID = -4208608376105933660L;

	@EJB
	private PacienteFacadeLocal pacienteEjb;

	private List<Paciente> listaPaciente;
	private Paciente paciente;
	private String accion;

	@PostConstruct
	public void init() {
		paciente = new Paciente(); // probar quitando esta instanciacion
	}

	public String linkPaciente() {
		return "/protegido/paciente?faces-redirect=true";
	}

	public void listar() {
		try {

			listaPaciente = pacienteEjb.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}

	public void leerId(Paciente paciente) {
		try {
			Paciente temp = pacienteEjb.find(paciente.getId_paciente());

			if (temp != null) {
				this.paciente = temp;
				this.accion = "Modificar";
			}
		} catch (Exception e) {
			System.out.println("Error al obtener paciente" + e);
		}
	}

	public void operar() {
		switch (accion) {
		case "Registrar":
			this.registrar();
			this.limpiar();
			break;
		case "Modificar":
			this.modificar();
			this.limpiar();
			break;
		}
	}
	
	public void limpiar() {
		this.paciente.setApellidos("");
		this.paciente.setCedula("");
		this.paciente.setNombres("");
		this.paciente.setSexo("");
		Date date = null;
		this.paciente.setFechaNacimiento(date);
	}
	

	public void modificar() {
		try {
			pacienteEjb.edit(paciente);
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al modificar paciente" + e);
		}
	}

	public void registrar() {
		try {
			pacienteEjb.create(paciente);
			paciente = new Paciente();
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al registrar paciente :" + e);
		}
	}

	public void eliminar(Paciente pacienteEliminar) {
		try {
			pacienteEjb.remove(pacienteEliminar);
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar paciente" + e);
		}
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.limpiar();
		this.accion = accion;
	}

}
