/*
 Ejercicio: Rectangulo
Se solicita calcular el área y el perimetro de un rectangulo, para eso debemos crear las variables :
	- Alto(int)
	- Ancho(int)
El usuario debe proporcionar los valores de alto y ancho y después de debe imprimr 
el resultado en el siguiente formato: (recuerden no usar acentos, respetar los espacios,
mayusculas, minusculas y saltos de líneas)
Le diremos al usuario:
Digite el alto del rectangulo
Digite el ancho del rectangulo
Variables:
Area 
Pereimetro
Formula:
Area = alto * ancho
Perimetro = (alto + ancho) * 2
¿Cuál es codigo del ejercicio planteado?
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author federico pfund
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el alto del rectangulo: ");
        var alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectangulo: ");
        var ancho = Integer.parseInt(entrada.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);
    }
    
}
