package com.kodigo.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.model.Paciente_TipoExamen;


@Stateless
public class Paciente_TipoExamenFacade extends AbstractFacade<Paciente_TipoExamen> implements Paciente_TipoExamenFacadeLocal {

 
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
    public Paciente_TipoExamenFacade() {
    	super(Paciente_TipoExamen.class);
    }
    
    
    @SuppressWarnings("unchecked")
	@Override
	public List<Paciente_TipoExamen> buscarDisponibles() {
		String consulta;
		List<Paciente_TipoExamen> lista; 
		try {
			lista = new ArrayList<Paciente_TipoExamen>();
			consulta = "FROM Paciente_TipoExamen Pte WHERE Pte.disponible = 1 "; 
			Query query = em.createQuery(consulta);
			
			lista = query.getResultList();
			
			if (!lista.isEmpty()) {
				return lista;
			}
			
		} catch (Exception e) {
			System.out.println("error al recuperar lista tipo examenes disponibles: " + e);
			throw e;
		} 
		return lista;
	}

}
