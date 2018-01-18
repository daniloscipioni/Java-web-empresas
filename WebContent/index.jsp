<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<body>
Bem vindo ao nosso gerenciador de empresas!<br/> 
<c:if test="${not empty usuarioLogado}"><!-- Se a variável usuarioLogado não estiver vazia-->
Você está logado como : ${usuarioLogado.email}</br>
</c:if>
<form action="executa?tarefa=NovaEmpresa" method="POST">
	Nome:<input type="text" name="nome"  />
	<input type="submit" value="Vai filho"/>
</form>

<form action="login" method="POST">
	Usuário: <input type="text" name="email" />
	Senha: <input type="text" name="senha" />
	<input type="submit" value="Login" />
</form>

<form action="executa" method="post">
<input type="hidden" name="tarefa"  value="Logout">
    <input type="submit" value="Logout" />
</form>

</body>
</html>
