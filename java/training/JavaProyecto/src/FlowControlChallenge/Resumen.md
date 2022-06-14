## Control de flujo.
    * Aprenderá a manipular el control de flujo y tendrá control total sobre lo que sucede dentro de su código.
* La segunda condicion no se ejecuta, porque no es necesario, una vez que estemos usando "&&", ambas condiciones deben ser "
Verdaras". cuando una de ellas de falsa ,JVM Simplemente ignora el resto.  
```java
if (false && true) {}  

```
    * La segunda condición se verificará, incluso si la primera condición es falsa, esto puede ser útil cuando desea ejecutar un comando en cada situación en sus condiciones.
```java
if (false & true) {} 

```
 * La segunda condición no se ejecutará porque una vez que estemos usando "||", si una de las condiciones es "verdadera", toda la condición será verdadera, por lo que JVM no verificará la siguiente condición.
```java
if (true || false) {}

```
 * Al usar el operador bit a bit, se verificarán ambas condiciones, incluso si la primera condición es "verdadera".
```java
if (true | false) {}

```