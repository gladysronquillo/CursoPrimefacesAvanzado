package com.kodigo.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoExamen> buscarTipoExamenPorPaciente(Integer id_paciente) {
		String consulta;
		List<TipoExamen> listaTipoExamen = new ArrayList<TipoExamen>();
		
		try {
			consulta = "FROM TipoExamen te WHERE te.id_tipo_examen not in (SELECT id_tipo_examen FROM Paciente_TipoExamen pte WHERE pte.id_paciente = ?1)"; 
			Query query = em.createQuery(consulta);
			query.setParameter(1, id_paciente);
			
			List<TipoExamen> lista = query.getResultList();
			
			if (!lista.isEmpty()) {
				listaTipoExamen =  lista;
			}else {
				System.out.println("No existen tipo examen para este paciente");
			}
		} catch (Exception e) {
			System.out.println("Error al buscar lista tipo examen por paciente: " + e);
		} 
		
		return listaTipoExamen;
	}

}
