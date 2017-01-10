package org.loja.bean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.loja.dao.FrutaDao;
import org.loja.model.Fruta;

@Model
public class FrutaBean {
	
	private Fruta fruta = new Fruta();
	@Inject
	private FrutaDao dao;

	public Fruta getFruta() {
		return fruta;
	}

	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}
	
	@Transactional
	public void salva() {

		System.out.println("fruta " + fruta.getNome());
		dao.inseri(fruta);
		fruta = new Fruta();
	}
	
}