package com.kodigo.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class AgendarController implements Serializable {
	private static final long serialVersionUID = -8894794232382016219L;

	public String linkAgendar() {
		return "/protegido/agendar?faces-redirect=true";
	}

}
