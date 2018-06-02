package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.InmunologiaFacadeLocal;
import com.kodigo.model.Inmunologia;

@Stateless
public class InmunologiaFacade extends AbstractFacade<Inmunologia> implements InmunologiaFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public InmunologiaFacade() {
		super(Inmunologia.class);
	}

}
