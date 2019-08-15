//Tarea 1

/*Array mezclado*/
myArray = [1,1.5,true,false,'hola mundo','juan',5431];

/*recorriendo el arreglo e imprimiendo los resultados*/
for (var j = 0; j < myArray.length; j++) {
	console.log(myArray[j]);
	/*Cambiar el valor del arreglo en tiempo de ejecucion.*/
	myArray[5] = 'pedro';
}


var casa={
	numVentanas:5,
	numPuertas:2,
	numCuartos:8,
	banios:{
		conRegadera:2,
		sinRegadera:3,
	}

	/* Error al descomentar esta linea*/
	/*tinacos:{
		grande:'100 litros',
		mediano:'50 litros',
		chico:'20 litros'
	}*/
};

console.log(casa);

var auto={
	numLlantas:4,
	numPuertas:2,
	numAcientos:4,
	numEspejos:2,
	numPlacas:'4jfyz',
	color:'red',
	modelo:'mini',
	litrosGas:18.7,

	parabrisas:{
		ancho:12,
		alto:1.5,
		material:'vidrio'
	}
};
console.log(auto);