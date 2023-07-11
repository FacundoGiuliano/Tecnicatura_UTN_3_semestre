// let autos = new Array("Ferrari", "BMW", "Renault"); sintaxis en desuso
const autos = ["Ferrari", "BMW", "Renault"];
console.log(autos);

// Recorrer los elementos
console.log(autos[0]);

for(let i = 0; i < autos.length; i++){
    console.log(i+" : "+autos[i]);
}

// Modificar los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

// Agregar nuevos valores
autos.push("Audi"); // Agregamos el elemento al final
console.log(autos);

// Otras formas de agregar elementos al arreglo
autos[autos.length] = "Porche";
console.log(autos);

// Otra forma de agregar elementos (indice)
autos[6] = "Renault";
console.log(autos);

// Preguntar si es un array
console.log(Array.isArray(autos)); // Devuelve un bool

console.log(autos instanceof Array); // Devuelve un bool

