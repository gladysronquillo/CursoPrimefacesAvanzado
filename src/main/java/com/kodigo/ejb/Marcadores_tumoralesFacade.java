package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Marcadores_tumoralesFacadeLocal;
import com.kodigo.model.Marcadores_tumorales;

@Stateless
public class Marcadores_tumoralesFacade extends AbstractFacade<Marcadores_tumorales> implements Marcadores_tumoralesFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public Marcadores_tumoralesFacade() {
		super(Marcadores_tumorales.class);
	}

}
