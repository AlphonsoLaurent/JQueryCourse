<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultados generales</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
	  ResultGrales85.fnConsultaResulGrales85();
// 	  ResultGrales85.fnConsultaDictamen85();
  });
  var ResultGrales85 = {
	      idResultados85:"resultGrales85",
	      idDictamen85:"dictamen85",
	      fnConsultaResulGrales85:function(){
	    	  $.ajax({
	  			type : "POST",
	  			contentType : "application/json",
	  			url : "http://localhost:8080/servlets/ConsultaResult85preg",
//	   			data : JSON.stringify(data),
	  			dataType : 'json',
	  			timeout : 100000,
	  			success : function(data1) {
	  				debugger;
	  		         $("#"+ResultGrales85.idResultados85).html("");
	  		        $.each(data1,function(idx,element){
	  		          $("#"+ResultGrales85.idResultados85).append("<tr><td>"+element.items+"</td><td>"+element.puntuacion+"</td><td>"+element.nivel+"</td><td>"+element.interpretacion+"</td></tr>")
	  		        });
	   				console.log("SUCCESS: ", data1);
//	   				display(data);
	  			},
	  			error : function(e) {
	  				console.log("ERROR: ", e);
	  				display(e);
	  			},
	  			done : function(e) {
	  				console.log("DONE");
	  			}
	  		});

	      },
// 	      fnConsultaDictamen85:function(){
// 	    	  $.ajax({
// 	  			type : "POST",
// 	  			contentType : "application/json",
// 	  			url : "http://localhost:8080/servlets/ConsultaResult85preg",
// //	   			data : JSON.stringify(data),
// 	  			dataType : 'json',
// 	  			timeout : 100000,
// 	  			success : function(data1) {
// 	  				debugger;
// 	  		         $("#"+ResultGrales85.idDictamen85).html("");
// 	  		        $.each(data1,function(idx,element){
// 	  		          $("#"+ResultGrales85.idDictamen85).append("<tr><td>"+element.nivel+"</td></tr>")
// 	  		        });
// 	   				console.log("SUCCESS: ", data1);
// //	   				display(data);
// 	  			},
// 	  			error : function(e) {
// 	  				console.log("ERROR: ", e);
// 	  				display(e);
// 	  			},
// 	  			done : function(e) {
// 	  				console.log("DONE");
// 	  			}
// 	  		});

// 	      },
	    };
</script>
<style>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
  }

  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }

  tr:nth-child(even) {
    background-color: #dddddd;
  }
</style>
</head>
<body>
<table style="width:100%">
<thead>
	<tr>
		<th colspan="4"><h1 align="center">Valoracion psicologica</h1></th>
	</tr>
	<tr>
		<th>ITEM</th>
		<th>PUNTUACION NATURAL</th>
		<th>NIVEL</th>
		<th>INTERPRETACION</th>
	</tr>
</thead>
<tbody id="resultGrales85"> 
</tbody>
</table>
<br><br>
<table>
<thead>
	<tr>
		<th>DICTAMEN</th>
	</tr>
</thead>
<tbody id=dictamen85>
</tbody>
</table>
</body>
</html>