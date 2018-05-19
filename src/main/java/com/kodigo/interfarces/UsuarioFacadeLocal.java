package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Usuario;

@Local
public interface UsuarioFacadeLocal {

	void create(Usuario usuario);

	void edit(Usuario usuario);

	void remove(Usuario usuario);

	Usuario find(Object id);

	List<Usuario> findAll();

	List<Usuario> findRange(int[] range);

	int count();
	
	Usuario iniciarSesion(Usuario us);

}
