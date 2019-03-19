package org.aluraspring.controlador;

import java.util.List;

import javax.validation.Valid;

import org.aluraspring.dao.ProdutoDAO;
import org.aluraspring.models.Produto;
import org.aluraspring.models.TipoPreco;
import org.aluraspring.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/formproduto")
	public ModelAndView formProduto(Produto produto){
		ModelAndView modelAndView = new ModelAndView("produtos/formproduto");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new ProdutoValidation());
	}
	
	@RequestMapping()
	public ModelAndView salvar( MultipartFile sumario , @Valid Produto produto, BindingResult result, RedirectAttributes redAttributes ){		
		if(result.hasErrors()){
			return formProduto(produto);
		}
		
		//String sumarioPath = this.fileSaver.write("sumarios", sumario);
		//produto.setSumarioPath(sumarioPath);
		produtoDAO.salvar(produto);
		redAttributes.addFlashAttribute("msgSucesso", "Novo produto cadastrado com sucesso.");
		ModelAndView modelAndView = new ModelAndView("redirect:produtos/listaprodutos");
		return modelAndView ;
	}	
	
	@RequestMapping("/detalhe")
	public ModelAndView detalhe(int produtoId){
		ModelAndView modelAndView = new ModelAndView("produtos/detalhe");
		Produto produto = this.produtoDAO.findById(produtoId);
		modelAndView.addObject("produto", produto);
		return modelAndView;
	}
	
	@RequestMapping("/listaprodutos")
	public ModelAndView listarProdutos(){
		ModelAndView modelAndView = new ModelAndView("produtos/listaprodutos");
		List<Produto> produtos = this.produtoDAO.listar();
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
}