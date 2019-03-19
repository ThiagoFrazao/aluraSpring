package org.aluraspring.validation;

import org.aluraspring.models.Produto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class ProdutoValidation implements Validator {
	
	public void valida(Produto produto, Errors errors){		
		
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors,"titulo","field.required");		
		ValidationUtils.rejectIfEmpty(errors,"descricao","field.required");	
		
		Produto produto = (Produto) target;
		
		if(produto.getPaginas() <= 10){
			errors.rejectValue("paginas", "field.required");
		}		
	}
}
