## Resumen

* Las matrices son objetos en Java. Las variables almacenan referencias en lugar del objeto. Cuando pasamos una referencia de objeto a un método estamos cambiando el objeto que está en el montón de la memoria.

## Array
Hay un concepto muy importante aquí, con respecto a las referencias a objetos. Después de ejecutar este código
```java
int[] anyArray = new int[5];  //Estamos instanciando un objeto Array aquí.

int[] otherArray = anyArray; // Estamos asignando la referencia al mismo objeto Array.
```
tenemos 2 variables apuntando al mismo objeto.
Las matrices en Java son objetos, por lo que cuando pasamos una matriz a un método, estamos accediendo al objeto.
Cualquier cambio realizado dentro del método doSum reflejará el objeto Array.
    * Mire el video de explicación COMPLETO sobre varios cuestionarios de Java en el canal de Java Challengers:
        + [Java Challengers](https://www.youtube.com/playlist?list=PL3py5YSIGvPMgKXOVqnYn9nBoT_zvsvsi)