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
public class Paciente_TipoExamenFacade extends AbstractFacade<Paciente_TipoExamen>
		implements Paciente_TipoExamenFacadeLocal {

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
	public List<Paciente_TipoExamen> buscarDisponibles(Integer id_paciente) {
		String consulta;
		List<Paciente_TipoExamen> lista;
		try {
			lista = new ArrayList<Paciente_TipoExamen>();
			consulta = "FROM Paciente_TipoExamen Pte WHERE Pte.id_paciente = ?1";
			Query query = em.createQuery(consulta);
			query.setParameter(1, id_paciente);
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

	@Override
	public void eliminarPaciente(Integer id_paciente) {
		String consulta;
		Integer maximo;
		try {
			consulta = "DELETE Paciente_TipoExamen pte WHERE pte.id_paciente = ?1 and pte.id_paciente_tipo_examen = ?2";
			maximo = obtenerMaximo();
			Query query = em.createQuery(consulta);
			query.setParameter(1, id_paciente);
			query.setParameter(2, maximo);
			query.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al eliminar ultimo registro paciente tipo examen: " + e);
		}

	}

	@SuppressWarnings("unchecked")
	private Integer obtenerMaximo() {
		String consulta;
		Integer maximo = null;
		List<Integer> lista;

		try {
			consulta = "select max(id_paciente_tipo_examen) as max from Paciente_TipoExamen pte";
			Query query = em.createQuery(consulta);
			lista = query.getResultList();
			maximo = lista.get(0);
			if (maximo == 0) {
				System.out.println("Tabla paciente tipo examen esta vacia");
				return 0;
			}
			return maximo;
		} catch (Exception e) {
			System.out.println("error al obterner maximo de paciente tipo examen: " + e);
			throw e;
		}

	}

}
