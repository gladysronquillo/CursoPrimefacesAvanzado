package com.kodigo.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.model.Paciente_TipoExamen;
import com.kodigo.model.TipoExamen;

@Named
@SessionScoped
public class Paciente_TipoExamenController implements Serializable {
	private static final long serialVersionUID = -2100646532889129175L;

	@EJB
	private Paciente_TipoExamenFacadeLocal paciente_TipoExamenEjb;

	private List<Paciente_TipoExamen> listaPaciente_TipoExamen;
	private Paciente_TipoExamen paciente_TipoExamen;

	public void listar(Integer id_paciente) {
		try {
			listaPaciente_TipoExamen = paciente_TipoExamenEjb.buscarDisponibles(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}

	public void eliminarPaciente(Integer id_paciente,Integer id_tipo_examen) {
		try {
			paciente_TipoExamenEjb.eliminarPaciente(id_paciente,id_tipo_examen);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}

	public void listarTipoExamen(Integer id_paciente) {
		try {
			listaPaciente_TipoExamen = paciente_TipoExamenEjb.buscarDisponibles(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}

	public void eliminarPacienteTipoExamen(Paciente_TipoExamen pacienteTipoExamen) {
		try {
			paciente_TipoExamenEjb.remove(pacienteTipoExamen);
			this.listarTipoExamen(pacienteTipoExamen.getId_paciente());

			FacesContext context = FacesContext.getCurrentInstance();
			TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{tipoExamenController}", TipoExamenController.class);

			bean.listarTipoExamenesPaciente(pacienteTipoExamen.getId_paciente());
		} catch (Exception e) {
			System.out.println("Error al eliminar Paciente tipo examen" + e);
		}
	}

	public void registrar(Integer id_paciente, Integer[] listaTipoExamenSeleccionados) {
		try {
			paciente_TipoExamen = new Paciente_TipoExamen();

			for (Integer id_tipoExamen : listaTipoExamenSeleccionados) {

				TipoExamen tipoExamen = new TipoExamen();

				FacesContext context = FacesContext.getCurrentInstance();
				TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
						"#{tipoExamenController}", TipoExamenController.class);

				tipoExamen = bean.buscarTipoExamen(id_tipoExamen);

				paciente_TipoExamen.setId_paciente(id_paciente);
				paciente_TipoExamen.setId_tipo_examen(tipoExamen.getId_tipo_examen());

				paciente_TipoExamenEjb.create(paciente_TipoExamen);
				paciente_TipoExamen = new Paciente_TipoExamen();
			}

		} catch (Exception e) {
			System.out.println("Error al registrar paciente_tipo_examen :" + e);
		}
	}

	public List<Paciente_TipoExamen> getListaPaciente_TipoExamen() {
		return listaPaciente_TipoExamen;
	}

	public void setListaPaciente_TipoExamen(List<Paciente_TipoExamen> listaPaciente_TipoExamen) {
		this.listaPaciente_TipoExamen = listaPaciente_TipoExamen;
	}

}
