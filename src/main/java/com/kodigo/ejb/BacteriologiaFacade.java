package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.BacteriologiaFacadeLocal;
import com.kodigo.model.Bacteriologia;


@Stateless
public class BacteriologiaFacade extends AbstractFacade<Bacteriologia> implements BacteriologiaFacadeLocal {

 
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
    public BacteriologiaFacade() {
    	super(Bacteriologia.class);
    }

}
