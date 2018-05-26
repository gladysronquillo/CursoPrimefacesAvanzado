package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.SerologiaFacadeLocal;
import com.kodigo.model.Serologia;

@Stateless
public class SerologiaFacade extends AbstractFacade<Serologia> implements SerologiaFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public SerologiaFacade() {
		super(Serologia.class);
	}

}
