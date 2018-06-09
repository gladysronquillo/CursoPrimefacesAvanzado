package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Examen_sangreFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Examen_sangre;

@Named
@SessionScoped
public class Examen_sangreController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private Examen_sangreFacadeLocal examen_sangreEjb;

	private Examen_sangre examen_sangre;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		examen_sangre = new Examen_sangre();
	}

	public void registrar(Integer id_paciente) {
		try {
			examen_sangre.setIdPaciente(id_paciente);

			Date fecha = new Date();

			examen_sangre.setFecha(fecha);
			examen_sangreEjb.create(examen_sangre);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			FacesContext contextTipoExamen = FacesContext.getCurrentInstance();
			TipoExamenController beanTipoExamen = contextTipoExamen.getApplication().evaluateExpressionGet(contextTipoExamen,
					"#{tipoExamenController}", TipoExamenController.class);
						
			Integer id_tipo_examen=  beanTipoExamen.getId_tipo_examen();
			bean.eliminarPaciente(id_paciente, id_tipo_examen);

			desabilitado = false;
			examen_sangre = new Examen_sangre();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		examen_sangre = new Examen_sangre();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Examen_sangre getExamen_sangre() {
		return examen_sangre;
	}

	public void setExamen_sangre(Examen_sangre examen_sangre) {
		this.examen_sangre = examen_sangre;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
