# Conceptos de lógica condicional

La lógica condicional ayuda a controlar el flujo de un código en Java. Consta de los siguientes componentes:

* Test expression(s)
* Body/code block to be executed

## Operadores

### Operadores logicos

* && AND Operadores
* ! NOT Operadores
* || OR Operadores
*Orden de evaluación - Parántesis NOT, AND, OR

Ejemplos:

```java
boolean x = true || false;
boolean y = false && true;

System.out.println(!x);
>> true
```

### Operadores condicionales

* \> mas grande que
* \>= Mayor qué o igual a
* < menos que
* <= Menos que o igual a
* == igual a
* != no igual a

## si declaración

* Evalúa la expresión de prueba dada entre paréntesis
* Si la expresión de prueba se evalúa como  `true`, entonces se ejecutan las declaraciones en el bloque de código
* Si la expresión de prueba se evalúa como `false`, entonces se ejecutan las declaraciones bajo el bloque `else`.

Sintaxis::

```code
if(condition) {
  statements..
}
```

Ejemplo:

```java
// Imprimir si el número es par o impar
if(number % 2 == 0) {
  System.out.println("number is even");
}
```

## sentencia if-else

* Evalúa la expresión de prueba dada entre paréntesis
* Si la expresión de prueba se evalúa como
 `true`, luego se ejecutan las declaraciones en el bloque de código
* Si la expresión de prueba se evalúa como `false`, entonces las declaraciones bajo el `else` se ejecutan los bloques

Sintaxis:

```code
if(condition) {
  statements..
}
else {
  statements..
}
```

Example:

```java
// Imprimir si el número es par o impar
if(number % 2 == 0) {
  System.out.println("el numero es par");
}
else {
  System.out.println("el numero es impar");
}
```

## Manejo de múltiples condiciones

* El encadenamiento y el anidamiento pueden dificultar la lectura del código.

### if... else if... else

Sintaxis:

```code
if(condition1) {
  statements..
}
else if(condition2){
  statements..
}
else {
  statements..
}
```

Ejemplo:

```java
// Imprimir si el número es par o impar
if(number == 0) {
  System.out.println("number is 0");
}
else if(number % 2 == 0) {
  System.out.println("number is even");
}
else {
  System.out.println("number is odd");
}
```

### cambiar (Java 7+)

* Múltiples rutas de ejecución posibles
*Elige una posibilidad entre múltiples opciones
* `break` La declaración se utiliza para terminar el flujo de la declaración.
* `default` la declaración es opcional

Sintaxis:

```code
switch(expression) {
  case value1 :
    statements..
    break;

  case value2 :
    statements..

  default :
    statements..
}
```

Ejemplo:

```java
String dayOfTheWeek = getDayOfTheWeek();
boolean weekend;
switch (dayOfTheWeek) {
  case "lunes":
  case "martes":
  case "miercoles":
  case "jueves":
  case "viernes":
    weekend = false;
    break;
  case "sabado":
  case "domingo":
    weekend = true;
    break;
  default:
    System.out.println("Día de la semana desconocido!");
}
```

### switch (Java 14+)

```code
switch(expression) {
  case value1 -> boolean;
  case value2 -> boolean;
  case value3 -> boolean;
  default :-> {
    statements..
  }
}
```

Example:

```java
String dayOfTheWeek = getDayOfTheWeek();
boolean weekend = switch (dayOfTheWeek) {
  case "lunes" -> false;
  case "martes" -> false;
  case "miercoles"-> false;
  case "jueves" -> false;
  case "viernes" -> false;
  case "sabado" -> true;
  case "domingo" -> true;
  default -> {
    System.out.println("Día de la semana desconocido!");
  }
}
```
