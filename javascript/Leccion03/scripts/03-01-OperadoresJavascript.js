/*Ejercicio para encontrar numeros pares 

*/
let parInpar = 10;
if(parInpar % 2 == 0){
    console.log("Es un número Par");
}
else{
    console.log("Es un número Impar");
}

//Ejercicio Mayor de edad

let edad = 20, adulto = 18;
if(edad >= adulto){
    console.log("Es una persona Adulta")
}
else{
    console.log("Es una persona menor de edad")
}
//Ejercicio: dentro de un rango

let dentroRango = 5; //Aqui vamos ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log('Esta dentro del rango establecido')
}
else{
    console.log('Esta fuera del rango')
}