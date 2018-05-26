package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Examen_orinaFacadeLocal;
import com.kodigo.model.Examen_orina;


@Stateless
public class Examen_orinaFacade extends AbstractFacade<Examen_orina> implements Examen_orinaFacadeLocal {

 
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
    public Examen_orinaFacade() {
    	super(Examen_orina.class);
    }

}
