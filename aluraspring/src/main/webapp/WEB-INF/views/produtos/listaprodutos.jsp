<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Lista de Produtos Cadastrados</title>
</head>
<body>
	<div class="container">
		<h2>Produtos atualmente cadastrados</h2>
		
		<h3>${msgSucesso}</h3>
		
		<table class="table table-bordered table-hover"> 
			<tr>
				<td>Título</td>
				<td>Descrição</td>
				<td>Páginas</td>
			</tr>
			<c:forEach items="${produtos}" var="produto">
				<tr>					
					<td><a href="detalhe?id=${produto.id}">${produto.titulo }</a></td>
					<td>${produto.descricao }</td>
					<td>${produto.paginas }</td>	
				</tr>
			</c:forEach>		
		</table>
		<p/>
		<form action="/aluraspring">
			<button type="submit" class="btn btn-primary">Voltar</button>
		</form>
	</div>		
</body>
</html>