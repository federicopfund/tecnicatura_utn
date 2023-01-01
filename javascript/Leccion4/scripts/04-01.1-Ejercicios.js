//Estaciones del año
let mes = 4;
let estacion;//Undefined
if (mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor Incorrecto";
}
console.log("EL valor corresponde a la estacion de: "+estacion);

//Ejercicio 2 : Hora del dia
/*
de 6 a 11 saluda: good morning
de 12 a 16 saluda: good afternoon
de 17 a 19 saluda: good evening
de 20  a 23 saluda: goof night
se trabaja con 24 hs
*/

let horaDia = 6;
let mensje;
if(horaDia >= 6 && horaDia <= 11){
    mensje = "Good Morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensje = "Good Afternoon";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensje = "Good Evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensje = "Good Night";
}
else{
    mensje = "Valor incorrecto";
}
console.log(mensje);

//Estructura Switch(La sintaxis es igual en JAVA)
switch(mes){//Ademas de numero, también se pueden utilizar cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "otono";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";

}
console.log("Bienvenido a la estacion de: "+estacion);

