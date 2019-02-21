<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>

	<form action="/aluraspring/produtos" method="post">
		<div>
			<div><label>Título</label></div>
			<input type="text" name="titulo"/>
		</div>
		<div>
			<div><label>Descrição</label></div>
			<textarea rows="10" cols="20" name="descricao"></textarea>
		</div>
		<div>
			<div><label>Páginas</label></div>
			<input type="text" name="paginas"/>
		</div>
		<button type="submit">Cadastrar</button>
	
	</form>

</body>
</html>