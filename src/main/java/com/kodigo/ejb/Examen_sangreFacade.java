package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.Examen_sangreFacadeLocal;
import com.kodigo.model.Examen_sangre;


@Stateless
public class Examen_sangreFacade extends AbstractFacade<Examen_sangre> implements Examen_sangreFacadeLocal {

 
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
    public Examen_sangreFacade() {
    	super(Examen_sangre.class);
    }

}
