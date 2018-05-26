package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Cultivo_antibiogramaFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Cultivo_antibiograma;

@Named
@SessionScoped
public class Cultivo_antibiogramaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private Cultivo_antibiogramaFacadeLocal cultivo_antibiogramaEjb;

	private Cultivo_antibiograma cultivo_antibiograma;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		cultivo_antibiograma = new Cultivo_antibiograma();
	}

	public void registrar(Integer id_paciente) {
		try {
			cultivo_antibiograma.setIdPaciente(id_paciente);

			Date fecha = new Date();

			cultivo_antibiograma.setFecha(fecha);
			cultivo_antibiogramaEjb.create(cultivo_antibiograma);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			cultivo_antibiograma = new Cultivo_antibiograma();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente m�s tarde"));
			System.out.println("Error al registrar examen Serolog�a :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		cultivo_antibiograma = new Cultivo_antibiograma();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Cultivo_antibiograma getCultivo_antibiograma() {
		return cultivo_antibiograma;
	}

	public void setCultivo_antibiograma(Cultivo_antibiograma cultivo_antibiograma) {
		this.cultivo_antibiograma = cultivo_antibiograma;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}