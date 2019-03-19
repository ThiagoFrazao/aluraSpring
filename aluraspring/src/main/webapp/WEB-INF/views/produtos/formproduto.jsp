<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Cadastro de Produto</title>
</head>
<body>
	<div class="container">
		<h2>Cadastre um Novo Produto</h2>
		<form:form action="/aluraspring/produtos" method="post" commandName="produto" enctype="multipart/form-data">
			<div class="form-group">
				<div><label>Título</label></div>
				<form:errors path="titulo" />
				<form:input path="titulo"  cssClass="form-control"/>
			</div>
			<div class="form-group">
				<div><label>Descrição</label></div>
				<form:errors path="descricao" />
				<form:textarea rows="10" cols="20" path="descricao" cssClass="form-control" />
			</div>
			<div class="form-group">
				<div><label>Páginas</label></div>
				<form:errors path="paginas" />
				<form:input path="paginas" cssClass="form-control"/>
			</div>
			<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
				<div class="form-group">
					<label>${tipoPreco}</label>			
					<form:input path="precos[${status.index}].valor" cssClass="form-control" />
					<form:hidden path="precos[${status.index}].tipo"  value="${tipoPreco}" />
				</div>			
			</c:forEach>	
			<div>
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</div>			
		</form:form>	
		<p/>	
		<form action="/aluraspring">
			<button type="submit" class="btn btn-primary">Voltar</button>
		</form>
	</div>	
	
	
</body>
</html>