package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.EspermatogramaFacadeLocal;
import com.kodigo.model.Espermatograma;

@Stateless
public class EspermatogramaFacade extends AbstractFacade<Espermatograma> implements EspermatogramaFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public EspermatogramaFacade() {
		super(Espermatograma.class);
	}

}
