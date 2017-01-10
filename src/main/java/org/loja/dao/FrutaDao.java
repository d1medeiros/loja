package org.loja.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.loja.model.Fruta;

@Stateless
public class FrutaDao {
	
	@PersistenceContext
	private EntityManager em;

	public void inseri(Fruta fruta) {
		em.persist(fruta);
	}

	public List<Fruta> listaTodos() {

		return em.createQuery("select f from Fruta f", Fruta.class).getResultList();
	}

}
