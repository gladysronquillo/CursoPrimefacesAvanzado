package com.kodigo.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class BioquimicaSanguinea implements Serializable {
	private static final long serialVersionUID = -7762192841558378970L;

	public String linkBioquimicaSanguinea() {
		return "/formularios/bioquimicaSanguinea?faces-redirect=true";
	}

	

}
