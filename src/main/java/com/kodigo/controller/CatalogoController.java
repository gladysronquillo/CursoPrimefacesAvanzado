package com.kodigo.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.kodigo.interfarces.CatalogoFacadeLocal;
import com.kodigo.model.Catalogo;

@Named
@SessionScoped
public class CatalogoController implements Serializable {
	private static final long serialVersionUID = 4705396839159039277L;

	@EJB
	private CatalogoFacadeLocal catalogoEjb;

	private List<Catalogo> listaCatalogo;
	private String[] listaCatalogoMuySensible;
	private String[] listaCatalogoMedSensible;
	private String[] listaCatalogoResistente;

	@PostConstruct
	public void init() {
		this.listarCatalogo();
	}

	public void listarCatalogo() {
		listaCatalogo = catalogoEjb.findAll();
	}

	public List<Catalogo> getListaCatalogo() {
		return listaCatalogo;
	}

	public void setListaCatalogo(List<Catalogo> listaCatalogo) {
		this.listaCatalogo = listaCatalogo;
	}

	public String[] getListaCatalogoMuySensible() {
		return listaCatalogoMuySensible;
	}

	public void setListaCatalogoMuySensible(String[] listaCatalogoMuySensible) {
		this.listaCatalogoMuySensible = listaCatalogoMuySensible;
	}

	public String[] getListaCatalogoMedSensible() {
		return listaCatalogoMedSensible;
	}

	public void setListaCatalogoMedSensible(String[] listaCatalogoMedSensible) {
		this.listaCatalogoMedSensible = listaCatalogoMedSensible;
	}

	public String[] getListaCatalogoResistente() {
		return listaCatalogoResistente;
	}

	public void setListaCatalogoResistente(String[] listaCatalogoResistente) {
		this.listaCatalogoResistente = listaCatalogoResistente;
	}

}
