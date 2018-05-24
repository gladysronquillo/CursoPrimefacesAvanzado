package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Cultivo_antibiogramaFacadeLocal;
import com.kodigo.model.Cultivo_antibiograma;

@Stateless
public class Cultivo_antibiogramaFacade extends AbstractFacade<Cultivo_antibiograma>
		implements Cultivo_antibiogramaFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public Cultivo_antibiogramaFacade() {
		super(Cultivo_antibiograma.class);
	}

}
