package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.DrogasFacadeLocal;
import com.kodigo.model.Drogas;

@Stateless
public class DrogasFacade extends AbstractFacade<Drogas> implements DrogasFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public DrogasFacade() {
		super(Drogas.class);
	}

}
