package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.HormonasFacadeLocal;
import com.kodigo.model.Hormonas;

@Stateless
public class HormonasFacade extends AbstractFacade<Hormonas> implements HormonasFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public HormonasFacade() {
		super(Hormonas.class);
	}

}
