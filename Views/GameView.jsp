<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Tic-Tac-Toe</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>

<body class="bg-dark">

	<div class="container text-white">
		
		<h1 class="text-center">Tic-Tac-Toe</h1>
		
		<c:forEach begin="0" end="2" step="1"  varStatus="row">
			<div class="row">
      		<c:forEach begin="0" end="2" step="1"  varStatus="col">
      			<div class="col-lg-4 border border-white" style="width: 300px; height: 300px">
      				<a href="PlayController" class = "btn btn-dark btn-block btn-lg" style="height : 100%; line-height: 300px;"> 
      					${game.gameArray[row.index][col.index]}
     			 	</a>
    			</div>
      		</c:forEach>
      		</div>
		</c:forEach>

		<h3 class="text-center">Player ${game.turnInfo}'s turn</h3>
		
	</div>

</body>

</html>