var nombre = 'fede ';
var apellido = 'pfund';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'fede'+' '+'pfund';
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como String
console.log(juntos);
juntos = nombre + (78 + 17); //Los numeros dentro del parenteis suman
console.log(juntos)
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Es una manera mas de concatenar usando el operador simplificado 
console.log(nombre)

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "pedro";
console.log(nombre2);

const apellido2 = "Lepes"; //una constante no puede ser modificada
console.log(apellido2);

let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se pueden asignar varias variables dentro de la misma linea
let z = x + y; //se asigna el valor de la operacion
console.log(z);