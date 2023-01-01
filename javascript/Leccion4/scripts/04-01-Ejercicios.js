//Ejercicio: Si el padre puede asistir al juego de su hijo

let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego")
}
else{
    console.log("El padre no puede asistir al juego")
}

//Operador ternario
//Ejercicio: número par e impar
let resultado2 = 3 > 2 ?"Verdadero" : "Falso";
console.log(resultado2)
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un número par" : "Es un numero impar";
console.log(resultado2)
//Convertir String a number
let miNumero = "18"; //Esto es una cadena
console.log(typeof miNumero);
let edad = Number(miNumero); //Esto es una funcion
console.log(typeof edad);

//Funcion isNaN
if(isNaN(edad)){ //No es un numero = is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
    if( edad >= 18){
        console.log("Puede votar");
    }
else{
        console.log("No puede votar");
    }
}


let resultado3 = edad >= 18 ? "Puede votar" : "No puedo votar";
console.log(resultado3);

//Evitar repetir tu codigo
//dry don't repeat yourself
//
let days = 3
switch (days) {
    case 1:
        console.log('today is Monday');
         break;
    case 2:
        console.log('Today is Tuesday');
        break;
    case 3:
        console.log('Today is Wednesday');
        break;
    case 4:
        console.log('Today is Thursday');
        break;
    case 5:
        console.log('Today is Friday');
        break;
    case 6:
        console.log('Today is Saturday');
        break;
    case 7:
        console.log('Today is Sunday')
        break;
    default:
        console.log("Error en el ingreso del día de la semana.");
        break;
}

//Esta es una versión mejorada
//Creada con arrays o arreglos
let days2 = ['Monday', 'Tuesday', 'Wednesday','Thursday', 'Friday','Saturday','Sunday'];
//Creamos una función getDay con un parametro de tipo entero.  con una estructura if
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n+1];
}
console.log(getDay(5));

let month = 2
switch (month) {
    case 1:
        console.log('January');
        break;
    case 2:
        console.log('February');
        break;
    case 3:
         console.log('March');
        break;
    case 4:
        console.log('April');
        break;
    case 5:
        console.log('May');
        break;
    case 6:
        console.log('June');
        break;
    case 7:
        console.log('is July');
        break;
    case 8:
        console.log('is August');
        break;
    case 9:
        console.log('is September');
        break;
    case 10:
        console.log('is October');
        break;
    case 11:
        console.log('is November');
        break;
    case 12:
        console.log('is December');
        break;
    default:
        console.log('Erro en el ingreso del mes del año');
        break;
}
//Operacion mejorada
let month2 = ['The month is January', 'The month is February', 'March','April','May','June','July','August','September','October','November','December'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return month2[n-1];
}
console.log(getMonth(2));