package org.aluraspring.controlador;

import org.aluraspring.dao.ProdutoDAO;
import org.aluraspring.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("produtos/formproduto")
	public String formProduto(){
		return "produtos/formproduto";
	}
	
	@RequestMapping("/produtos")
	public String salvar(Produto produto){
		produtoDAO.salvar(produto);
		return "OK...";
	}	
}