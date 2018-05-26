package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Bioquimica_sanguineaFacadeLocal;
import com.kodigo.model.Bioquimica_sanguinea;

@Stateless
public class Bioquimica_sanguineaFacade extends AbstractFacade<Bioquimica_sanguinea>
		implements Bioquimica_sanguineaFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public Bioquimica_sanguineaFacade() {
		super(Bioquimica_sanguinea.class);
	}

}
