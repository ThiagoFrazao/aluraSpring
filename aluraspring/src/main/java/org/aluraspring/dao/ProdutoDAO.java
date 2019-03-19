package org.aluraspring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.aluraspring.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager produtoManager;	
	
	public void salvar(Produto produto){
		produtoManager.persist(produto);
	}

	public List<Produto> listar() {
		return this.produtoManager.createQuery("select p from Produto p", Produto.class).getResultList();
	}

	public Produto findById(int produtoId) {
		return this.produtoManager.find(Produto.class, produtoId);
	}
}
