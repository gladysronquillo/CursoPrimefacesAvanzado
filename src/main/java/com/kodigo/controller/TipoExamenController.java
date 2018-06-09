package com.kodigo.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.menu.MenuModel;

import com.kodigo.interfarces.TipoExamenFacadeLocal;
import com.kodigo.model.TipoExamen;

@Named
@SessionScoped
public class TipoExamenController implements Serializable {
	private static final long serialVersionUID = -7396697051900133313L;

	@EJB
	private TipoExamenFacadeLocal tipoExamenEjb;

	private List<TipoExamen> listaTipoExamen;
	private Integer[] listaTipoExamenSeleccionados;
	private MenuModel model;
	private TipoExamen tipoExamen;
	private Integer id_tipo_examen;


	public TipoExamen buscarTipoExamen(Integer id_tipoExamen) {
		tipoExamen = new TipoExamen();
		tipoExamen = tipoExamenEjb.find(id_tipoExamen);
		return tipoExamen;
	}

	public void listarTipoExamenesPaciente(Integer id_paciente) {
		try {
			listaTipoExamen = tipoExamenEjb.buscarTipoExamenPorPaciente(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al buscar tipos de examenes: " + e);
		}
	}

	public void registrarExamenesSelecionados(Integer id_paciente, Integer[] listaTipoExamenSeleccionados) {

		FacesContext context = FacesContext.getCurrentInstance();
		Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
				"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);

		bean.registrar(id_paciente, listaTipoExamenSeleccionados);
	}

	
	public String obtenerNombreTipoExamen(Integer id_tipo_examen) {
		tipoExamen = new TipoExamen();
		tipoExamen = tipoExamenEjb.find(id_tipo_examen);
		
		return tipoExamen.getNombre();
		
	}
	
	public String obtenerUrl(Integer id_tipo_examen) {
		tipoExamen = new TipoExamen();
		tipoExamen = tipoExamenEjb.find(id_tipo_examen);
		this.id_tipo_examen = id_tipo_examen;
		return tipoExamen.getDetalle();
		
	}

	public List<TipoExamen> getListaTipoExamen() {
		return listaTipoExamen;
	}

	public void setListaTipoExamen(List<TipoExamen> listaTipoExamen) {
		this.listaTipoExamen = listaTipoExamen;
	}

	public Integer[] getListaTipoExamenSeleccionados() {
		return listaTipoExamenSeleccionados;
	}

	public void setListaTipoExamenSeleccionados(Integer[] listaTipoExamenSeleccionados) {
		this.listaTipoExamenSeleccionados = listaTipoExamenSeleccionados;
	}

	public MenuModel getModel() {
		return model;
	}

	public void setModel(MenuModel model) {
		this.model = model;
	}

	public Integer getId_tipo_examen() {
		return id_tipo_examen;
	}

	public void setId_tipo_examen(Integer id_tipo_examen) {
		this.id_tipo_examen = id_tipo_examen;
	}


}
