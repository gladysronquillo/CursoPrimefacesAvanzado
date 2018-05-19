package com.kodigo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoexamen")
public class TipoExamen implements Serializable {
	private static final long serialVersionUID = -684577236644199436L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_examen", nullable = false)
	private Integer id_tipo_examen;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "detalle")
	private String detalle;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public Integer getId_tipo_examen() {
		return id_tipo_examen;
	}

	public void setId_tipo_examen(Integer id_tipo_examen) {
		this.id_tipo_examen = id_tipo_examen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_tipo_examen == null) ? 0 : id_tipo_examen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoExamen other = (TipoExamen) obj;
		if (id_tipo_examen == null) {
			if (other.id_tipo_examen != null)
				return false;
		} else if (!id_tipo_examen.equals(other.id_tipo_examen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoExamen [id_tipo_examen=" + id_tipo_examen + "]";
	}

	
	
}
