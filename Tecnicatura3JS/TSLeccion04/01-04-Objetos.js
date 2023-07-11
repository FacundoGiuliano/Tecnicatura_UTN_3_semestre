let x = 10; // Variable tipo primitivo
console.log(x.lenght);
console.log('Tipos primitivos');

let persona = { // Crear Objeto (forma mas utilizada)
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase(); // COnvierte las minusculas en mayusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ // Metodo o funcion en js
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){
        return this.nombre+' edad: '+this.edad;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');
let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 12';
persona2.telefono = '2345654323456';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); // Accedemos como si fuera un array
console.log('Usamos el ciclo for in');

for(propiedad in persona){ // for in // Accedemos al objeto como si fuera un array
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log('Cambiamos y eliminamos un error')
persona.apellido = 'Betancud'; // Cambiar dinamicamente el valor de un objeto
persona.apellida = 'Betancud';
delete persona.apellida; // Eliminar 
console.log(persona);

// Distintas formas de imprimir un objeto
console.log(persona.nombre+', '+persona.apellido); // Concatenar

for(nombrePropiedad in persona){ // for in
    console.log(persona[nombrePropiedad]);
}

let personaArray = Object.values(persona); // funcion object.values (Array)
console.log(personaArray);

let personaString = JSON.stringify(persona); // JSON convierte el objeto en una cadena
console.log(personaString);

console.log('Metodo get')
console.log(persona.nombreEdad);

console.log('Get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre,apellido,email){ // Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@mail.com');
padre.nombre = 'Luis'; // Modificamos el nombre
padre.telefono = '243453334'; // Propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); // Utilizamos la funcion
let madre = new Persona3('Laura', 'Contreras', 'contrerasl@mail.com');
console.log(madre);

// Formas de crear objetos
let miObjeto = new Object(); // Opcion formal
let miObjeto2 = {}; // Opcion breve y recomendada
// String
let miCadena1 = new String('Hola'); // formal
let miCadena2 = 'Hola'; // simpleficada y recomendada
// Numeros
let miNumero = new Number(1);
let miNumero2 = 1; // recomendada
//Booleanos
let miBoolean = new Boolean(false);
let miBoolean2 = false; // recomendada
// Arreglos
let miArreglo1 = new Array();
let miArreglo2 = []; // recomendada
// Funciones
let miFuncion1 = new function(){}; // TODO DESPUES DE "new" ES CONSIDERADO OBJETO
let miFuncion2 = function(){}; // recomendada

// Uso de prototype
Persona3.prototype.telefono = '234565432';
console.log(padre);
console.log(madre);
madre.telefono = '123';
console.log(madre.telefono);

// Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}
let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'    
}
console.log(persona4.nombreCompleto2('Lic','23456523'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing', '23456'));

// Metodo Apply
let arreglo = ['Ing','2345677'];
console.log(persona4.nombreCompleto2.apply(persona5,arreglo))