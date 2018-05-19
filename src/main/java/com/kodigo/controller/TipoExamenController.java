package com.kodigo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.interfarces.TipoExamenFacadeLocal;
import com.kodigo.model.Paciente_TipoExamen;
import com.kodigo.model.TipoExamen;

@Named
@SessionScoped
public class TipoExamenController implements Serializable {
	private static final long serialVersionUID = -7396697051900133313L;

	@EJB
	private TipoExamenFacadeLocal tipoExamenEjb;
	
	@EJB
	private Paciente_TipoExamenFacadeLocal paciente_TipoExamenEjb;

	private List<TipoExamen> listaTipoExamen;
	private List<TipoExamen> listaTipoExamenSelecionadosTablaDinamica;
	private Integer[] listaTipoExamenSeleccionados;
	private MenuModel model;
	private TipoExamen tipoExamen;
	private Paciente_TipoExamen paciente_TipoExamen;

	@PostConstruct
	public void init() {
		this.listarTodosTipoExamenes();
		

	}

	public void listarTodosTipoExamenes() {
		try {
			listaTipoExamen = tipoExamenEjb.findAll();
		} catch (Exception e) {
			System.out.println("Error al buscar tipos de examenes: " + e);
		}
	}

	public void registrarExamenesSelecionados(Integer id_paciente, Integer[] listaTipoExamenSeleccionados) {
		this.establecerPermisos();
		this.registrar(id_paciente, listaTipoExamenSeleccionados);
	}
	
	public String link(TipoExamen tipoExamen) {
		return tipoExamen.getDetalle();
	}

	public void establecerPermisos() {
		model = new DefaultMenuModel();
		tipoExamen = new TipoExamen();
		listaTipoExamenSelecionadosTablaDinamica = new ArrayList<TipoExamen>();
		for (TipoExamen examenes : listaTipoExamen) {
			for (Integer examenesSeleccionados : this.listaTipoExamenSeleccionados) {
				if (examenes.getId_tipo_examen().intValue() == examenesSeleccionados.intValue()) {
					tipoExamen = tipoExamenEjb.find(examenes.getId_tipo_examen().intValue());
					DefaultSubMenu firstSubMenu = new DefaultSubMenu(examenes.getNombre());
					model.addElement(firstSubMenu);
					listaTipoExamenSelecionadosTablaDinamica.add(tipoExamen);
				}
			}

		}
	}
	
	public void registrar(Integer id_paciente, Integer[] listaTipoExamenSeleccionados) {
		try {
			paciente_TipoExamen = new Paciente_TipoExamen();

			for (Integer i : listaTipoExamenSeleccionados) {
				paciente_TipoExamen.setId_paciente(id_paciente);
				paciente_TipoExamen.setId_tipo_examen(i.intValue());
				
				
				paciente_TipoExamen.setDisponible(1);
				paciente_TipoExamenEjb.create(paciente_TipoExamen);
				paciente_TipoExamen = new Paciente_TipoExamen();
			}
			
		} catch (Exception e) {
			System.out.println("Error al registrar paciente_tipo_examen :" + e);
		}
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

	public List<TipoExamen> getListaTipoExamenSelecionadosTablaDinamica() {
		return listaTipoExamenSelecionadosTablaDinamica;
	}

	public void setListaTipoExamenSelecionadosTablaDinamica(List<TipoExamen> listaTipoExamenSelecionadosTablaDinamica) {
		this.listaTipoExamenSelecionadosTablaDinamica = listaTipoExamenSelecionadosTablaDinamica;
	}

}
