package org.loja.web;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import org.loja.dao.FrutaDao;
import org.loja.model.Fruta;

@WebService
public class FrutaWS {
	
	@Inject
	private FrutaDao dao;

	public List<Fruta> getTodos() {

		return dao.listaTodos();
	}
	
}
