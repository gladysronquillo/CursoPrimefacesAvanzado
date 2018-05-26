package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.CoagulacionFacadeLocal;
import com.kodigo.model.Coagulacion;

@Stateless
public class CoagulacionFacade extends AbstractFacade<Coagulacion> implements CoagulacionFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public CoagulacionFacade() {
		super(Coagulacion.class);
	}

}
