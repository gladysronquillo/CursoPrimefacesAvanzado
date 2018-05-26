package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.PacienteFacadeLocal;
import com.kodigo.model.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente> implements PacienteFacadeLocal {

	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public PacienteFacade() {
		super(Paciente.class);
	}

}
