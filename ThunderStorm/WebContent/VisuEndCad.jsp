<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Visualizar Endereços</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
        <!-- Barra superior com os menus de navegação -->
		<c:import url="Menu.jsp"/>
        <!-- Container Principal -->
        <div id="main" class="container">
            <h3 class="page-header">Visualizar Endereço ${endereco.id}</h3>
            <div class="row">
                <div class="col-md-12">
                    <p><strong>Tipo de Endereço:</strong>
                    </p>
                    <p>
                        ${endereco.tipodeendereco}
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Cep:</strong>
                    </p>
                    <p>
                        ${endereco.cep}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Endereço:</strong>
                    </p>
                    <p>
                        ${endereco.endereco}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Estado:</strong>
                    </p>
                    <p>
                        ${endereco.estado}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Cidade:</strong>
                    </p>
                    <p>
                        ${endereco.cidade}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Número:</strong>
                    </p>
                    <p>
                        ${endereco.numero}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Complemento:</strong>
                    </p>
                    <p>
                        ${endereco.complemento}
                    </p>
                </div>
            </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="telainicial.jsp" class="btn btn-default">Voltar</a>
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>

</html>