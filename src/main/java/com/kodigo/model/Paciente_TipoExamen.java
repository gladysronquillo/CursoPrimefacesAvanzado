package com.kodigo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente_tipo_examen")
public class Paciente_TipoExamen implements Serializable {
	private static final long serialVersionUID = -3369770144607916322L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente_tipo_examen", nullable = false)
	private Integer id_paciente_tipo_examen;
	
	@Column(name = "id_paciente")
	private Integer id_paciente;
	
	@Column(name = "id_tipo_examen")
	private String id_tipo_examen;
	
	@Column(name = "disponible")
	private Integer disponible;
	
	@Column(name = "detalle")
	private String detalle;

	public Integer getId_paciente_tipo_examen() {
		return id_paciente_tipo_examen;
	}

	public void setId_paciente_tipo_examen(Integer id_paciente_tipo_examen) {
		this.id_paciente_tipo_examen = id_paciente_tipo_examen;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getId_tipo_examen() {
		return id_tipo_examen;
	}

	public void setId_tipo_examen(String id_tipo_examen) {
		this.id_tipo_examen = id_tipo_examen;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Integer getDisponible() {
		return disponible;
	}

	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_paciente_tipo_examen == null) ? 0 : id_paciente_tipo_examen.hashCode());
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
		Paciente_TipoExamen other = (Paciente_TipoExamen) obj;
		if (id_paciente_tipo_examen == null) {
			if (other.id_paciente_tipo_examen != null)
				return false;
		} else if (!id_paciente_tipo_examen.equals(other.id_paciente_tipo_examen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente_TipoExamen [id_paciente_tipo_examen=" + id_paciente_tipo_examen + "]";
	}

	
	
}