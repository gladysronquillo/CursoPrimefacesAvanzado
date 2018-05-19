package com.kodigo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kodigo.interfarces.TipoExamenFacadeLocal;
import com.kodigo.model.TipoExamen;


@Stateless
public class TipoExamenFacade extends AbstractFacade<TipoExamen> implements TipoExamenFacadeLocal {

 
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
    public TipoExamenFacade() {
    	super(TipoExamen.class);
    }

}
