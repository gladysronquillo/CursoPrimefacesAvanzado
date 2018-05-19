package com.kodigo.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.PersonaFacadeLocal;
import com.kodigo.interfarces.UsuarioFacadeLocal;
import com.kodigo.model.Persona;
import com.kodigo.model.Usuario;

@Named
@SessionScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -8897171540234535640L;

	@EJB
	private UsuarioFacadeLocal usuarioEjb;

	@EJB
	private PersonaFacadeLocal perosnaEjb;

	private Usuario usuario;
	private Persona persona;

	@PostConstruct // Se va a ejecutar luego que el contructor se halla
					// inicializado.
	public void init() {
		usuario = new Usuario();
		persona = new Persona(); // instanciando aky evito un nullpoite
									// exception.
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public void registrar() {
		try {

			perosnaEjb.create(persona);
			this.usuario.setId_usuario(persona);

			usuarioEjb.create(usuario);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se Registró"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));

		}

	}

}
