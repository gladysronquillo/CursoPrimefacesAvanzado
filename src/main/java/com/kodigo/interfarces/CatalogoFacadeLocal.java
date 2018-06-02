package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Catalogo;

@Local
public interface CatalogoFacadeLocal {
	void create(Catalogo catalogo);

	void edit(Catalogo catalogo);

	void remove(Catalogo catalogo);

	Catalogo find(Object id);

	List<Catalogo> findAll();
	
	List<Catalogo> findRange(int[] range);

	int count();
}
