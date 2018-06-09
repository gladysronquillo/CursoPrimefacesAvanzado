package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Examen_orinaFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Examen_orina;

@Named
@SessionScoped
public class Examen_orinaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private Examen_orinaFacadeLocal examen_orinaEjb;

	private Examen_orina examen_orina;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		examen_orina = new Examen_orina();
	}

	public void registrar(Integer id_paciente) {
		try {
			examen_orina.setIdPaciente(id_paciente);

			Date fecha = new Date();

			examen_orina.setFecha(fecha);
			examen_orinaEjb.create(examen_orina);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			FacesContext contextTipoExamen = FacesContext.getCurrentInstance();
			TipoExamenController beanTipoExamen = contextTipoExamen.getApplication().evaluateExpressionGet(contextTipoExamen,
					"#{tipoExamenController}", TipoExamenController.class);
						
			Integer id_tipo_examen=  beanTipoExamen.getId_tipo_examen();
			bean.eliminarPaciente(id_paciente, id_tipo_examen);

			desabilitado = false;
			examen_orina = new Examen_orina();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		examen_orina = new Examen_orina();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Examen_orina getExamen_orina() {
		return examen_orina;
	}

	public void setExamen_orina(Examen_orina examen_orina) {
		this.examen_orina = examen_orina;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
