package org.aluraspring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.aluraspring.models.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager produtoManager;
	
	
	public void salvar(Produto produto){
		produtoManager.persist(produto);
	}

}
