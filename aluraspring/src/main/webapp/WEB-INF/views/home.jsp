<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Curso Alura Spring MVC</title>
</head>
<body>
	<div class="container">
		<h1>Pagina Inicial Teste</h1>
	
		<h3>Produto</h3>
		<div class="form-group">
			<form action="produtos/formproduto">
				<button type="submit" class="btn btn-primary">Cadastrar Novo Produto</button>
			</form>
		</div>			
		<div class="form-group">
			<form action="produtos/listaprodutos">
				<button type="submit" class="btn btn-primary">Lista de Produtos Cadastrados</button>
			</form>
		</div>	
	</div>

</body>
</html>