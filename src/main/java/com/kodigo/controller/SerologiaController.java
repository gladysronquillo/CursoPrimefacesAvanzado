package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.SerologiaFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Serologia;

@Named
@SessionScoped
public class SerologiaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private SerologiaFacadeLocal serologiaEjb;

	private Serologia serologia;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		serologia = new Serologia();
	}

	public void registrar(Integer id_paciente) {
		try {
			serologia.setIdPaciente(id_paciente);

			Date fecha = new Date();

			serologia.setFecha(fecha);
			serologiaEjb.create(serologia);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			FacesContext contextTipoExamen = FacesContext.getCurrentInstance();
			TipoExamenController beanTipoExamen = contextTipoExamen.getApplication().evaluateExpressionGet(contextTipoExamen,
					"#{tipoExamenController}", TipoExamenController.class);
						
			Integer id_tipo_examen=  beanTipoExamen.getId_tipo_examen();
			bean.eliminarPaciente(id_paciente, id_tipo_examen);

			desabilitado = false;
			serologia = new Serologia();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		serologia = new Serologia();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Serologia getSerologia() {
		return serologia;
	}

	public void setSerologia(Serologia serologia) {
		this.serologia = serologia;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
