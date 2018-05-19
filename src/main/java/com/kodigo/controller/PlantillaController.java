package com.kodigo.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.model.Usuario;

@Named
@SessionScoped
public class PlantillaController implements Serializable {

	private static final long serialVersionUID = -1028032967228236581L;

	public void verificarSesion() {

		try {
			FacesContext context = FacesContext.getCurrentInstance();
			Usuario usuario = (Usuario) context.getExternalContext().getSessionMap().get("usuario");

			if (usuario == null) {
				context.getExternalContext().redirect("./../permisos.xhtml");
			}
		} catch (Exception e) {
			System.out.println("Error al validar sesión");
		}
	}

}
