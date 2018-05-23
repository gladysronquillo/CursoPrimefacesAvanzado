package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.kodigo.interfarces.PacienteFacadeLocal;
import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.interfarces.TipoExamenFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Paciente_TipoExamen;
import com.kodigo.model.TipoExamen;

@Named
@SessionScoped
public class PacienteController implements Serializable {

	private static final long serialVersionUID = -4208608376105933660L;

	@EJB
	private PacienteFacadeLocal pacienteEjb;
	
	@EJB
	private Paciente_TipoExamenFacadeLocal paciente_TipoExamenEjb;
	
	@EJB
	private TipoExamenFacadeLocal tipoExamenEjb;

	private List<Paciente> listaPaciente;
	private Paciente paciente;
	private String accion;
	private boolean desabilitado = true;
	private List<Paciente_TipoExamen> paciente_TipoExamen;
	private List<TipoExamen> listaTipoExamenPaciente;


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
				desabilitado = false;
				this.listarTipoExamen(paciente.getId_paciente());
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
	
	public void listarTipoExamen(Integer id_paciente) {
		try {
			paciente_TipoExamen = paciente_TipoExamenEjb.buscarDisponibles(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}
	
	public void eliminarPacienteTipoExamen(Paciente_TipoExamen pacienteTipoExamen) {
		try {
			paciente_TipoExamenEjb.remove(pacienteTipoExamen);
			this.listarTipoExamen(pacienteTipoExamen.getId_paciente());
		} catch (Exception e) {
			System.out.println("Error al eliminar Paciente tipo examen" + e);
		}
	}
	
	public List<TipoExamen> getListaTipoExamenPaciente() {
		return listaTipoExamenPaciente;
	}

	public void setListaTipoExamenPaciente(List<TipoExamen> listaTipoExamenPaciente) {
		this.listaTipoExamenPaciente = listaTipoExamenPaciente;
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
	
	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

	public List<Paciente_TipoExamen> getPaciente_TipoExamen() {
		return paciente_TipoExamen;
	}

	public void setPaciente_TipoExamen(List<Paciente_TipoExamen> paciente_TipoExamen) {
		this.paciente_TipoExamen = paciente_TipoExamen;
	}
	
}
