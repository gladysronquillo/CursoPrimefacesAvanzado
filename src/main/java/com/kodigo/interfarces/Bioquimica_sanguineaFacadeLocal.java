package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Bioquimica_sanguinea;

@Local
public interface Bioquimica_sanguineaFacadeLocal {
	void create(Bioquimica_sanguinea bioquimica_sanguinea);

	void edit(Bioquimica_sanguinea bioquimica_sanguinea);

	void remove(Bioquimica_sanguinea bioquimica_sanguinea);

	Bioquimica_sanguinea find(Object id);

	List<Bioquimica_sanguinea> findAll();
	
	List<Bioquimica_sanguinea> findRange(int[] range);

	int count();
}
