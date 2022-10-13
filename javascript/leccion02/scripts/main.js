// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/

var nombre = 'Feder'; //Tipo Str
console.log(nombre);

var numero = 3000; // Tipo Numérico
console.log(numero);

var objeto = {
    nombre : "Feder",
    apellido : "Pfund",
    telefono : "2996853852"
}

console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);

//Tipo de dato funcion
function miFuncionMultiway(){}
console.log(typeof miFuncionMultiway);

//Tipo de dato symbol
var simbolo = Symbol("Mi Simbolo");
console.log(typeof simbolo);

//Tipo de dato clase

class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipos de datos array y empty String

var autos = ['Citroen','Audi','BMW','Ford'];
console.log(autos);
// que tipo de autos es
console.log(typeof autos);

var z = " ";
// cadena vacia
console.log(z);
console.log(typeof z);





