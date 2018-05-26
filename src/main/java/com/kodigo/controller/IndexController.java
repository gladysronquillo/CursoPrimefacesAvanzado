package com.kodigo.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.UsuarioFacadeLocal;
import com.kodigo.model.Usuario;

@Named
@SessionScoped
public class IndexController implements Serializable{
	private static final long serialVersionUID = 5230726921444961394L;

	@EJB
	private UsuarioFacadeLocal EJBUsuario;
	
	private Usuario usuario;
	
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String iniciarSesion() {
		
		Usuario us;
		String redireccion = null;

		try {
			us = EJBUsuario.iniciarSesion(usuario);
	
			if(us!=null){
				//almacenar en la sesión de jsf
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
				
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
				redireccion = "/protegido/principal?faces-redirect=true";
			}
				else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales Incorrectas!"));
			}
			
			
		} catch (Exception e) {
			System.out.println("error inicaiar sesión :"+e);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!")); 
		}
		return redireccion;
	}
	
	public String cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();	
		return "/index?faces-redirect=true";
	}
}
