package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.ElectrolitosFacadeLocal;
import com.kodigo.model.Electrolitos;

@Stateless
public class ElectrolitosFacade extends AbstractFacade<Electrolitos> implements ElectrolitosFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public ElectrolitosFacade() {
		super(Electrolitos.class);
	}

}
