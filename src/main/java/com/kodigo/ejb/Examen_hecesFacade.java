package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Examen_hecesFacadeLocal;
import com.kodigo.model.Examen_heces;

@Stateless
public class Examen_hecesFacade extends AbstractFacade<Examen_heces> implements Examen_hecesFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public Examen_hecesFacade() {
		super(Examen_heces.class);
	}

}
