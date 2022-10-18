
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author federico pfund
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la primera calificación: ");
        double n1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduzca la segunda calificación: ");
        double n2 = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduzca la tercera calificación: ");
        double n3 = Double.parseDouble(entrada.nextLine());
        var resultado = n1 + n2 + n3;
        var promedio = resultado/3;
        System.out.println("El resultado de la suma de las tres calificaciones es: " + resultado);
        System.out.println("El Promedio de las tres calificaciones es: " + promedio);
    }
    
}
