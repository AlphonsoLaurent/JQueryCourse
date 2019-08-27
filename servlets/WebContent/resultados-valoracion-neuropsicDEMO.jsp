<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultados de valoracion neuropsicologica</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
    ResultValNeuro.fnConsultaResulAereoMari();
    ResultValNeuro.fnConsultaResulAutoFerro();
  });
    var ResultValNeuro = {
      idAereoMari:"resultAereoMari",
      idAutoFerro:"resultAutoFerro",
      lstResultado:["Cuestionario","Figura","Reloj","Laminas"],

      fnConsultaResulAereoMari:function(){
    	  $.ajax({
  			type : "POST",
  			contentType : "application/json",
  			url : "http://localhost:8080/servlets/ConsultaResultados",
//   			data : JSON.stringify(data),
  			dataType : 'json',
  			timeout : 100000,
  			success : function(data) {
  		         $("#"+ResultValNeuro.idAereoMari).html("");
  		        $.each(data,function(idx,element){
  		          $("#"+ResultValNeuro.idAereoMari).append("<tr><td>"+element.items+"</td><td>"+element.puntuacion+"</td><td>"+element.interpretacion+"</td></tr>")
  		        });
   				console.log("SUCCESS: ", data);
//   				display(data);
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
      fnConsultaResulAutoFerro:function(){
    	  $.ajax({
    			type : "POST",
    			contentType : "application/json",
    			url : "http://localhost:8080/servlets/ConsultaResultados",
//     			data : JSON.stringify(data),
    			dataType : 'json',
    			timeout : 100000,
    			success : function(data) {
    				debugger;
    		         $("#"+ResultValNeuro.idAutoFerro).html("");
    		        $.each(data,function(idx,element){
    		          $("#"+ResultValNeuro.idAutoFerro).append("<tr><td>"+element.items+"</td><td>"+element.puntuacion+"</td><td>"+element.interpretacion+"</td></tr>")
    		        });
     				console.log("SUCCESS: ", data);
//     				display(data);
    			},
    			error : function(e) {
    				console.log("ERROR: ", e);
    				display(e);
    			},
    			done : function(e) {
    				console.log("DONE");
    			}
    		});
      }
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
    <th colspan="3"><h1 align="center">Valoracion Neuropsicologica</h1></th>
  </tr>
  <tr>
    <th colspan="3"><h2 align="center">AEREO - MARITIMO</h2></th>
  </tr>
  <tr>
    <th>Items</th>
    <th>Puntuacion</th> 
    <th>Interpretacion</th>
  </tr>
 </thead>
 <tbody id="resultAereoMari"> 
 </tbody>
</table>
<br><br>
<table>
	<thead>
		<tr>
			<th>DICTAMEN</th>
		</tr>
	</thead>
</table>
<br><br><br>
<table style="width:100%">
<thead>
  <tr>
    <th colspan="3"><h2 align="center">AUTOTRANSPORTE-FERROVIARIO</h2></th>
  </tr>
  <tr>
    <th>Items</th>
    <th>Puntuacion</th> 
    <th>Interpretacion</th>
  </tr>
 </thead>
 <tbody id="resultAutoFerro"> 
 </tbody>
</table>
<br><br>
<table>
	<thead>
		<tr>
			<th>DICTAMEN</th>
		</tr>
	</thead>
</table>
</body>
</html>