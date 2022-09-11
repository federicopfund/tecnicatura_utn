
package ejercicio6;

import java.util.Scanner;

/**
 * @author federico pfund
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dólares que tiene federico: ");
        Double dolares = Double.parseDouble(entrada.nextLine());
        var result = dolares * 2.25;
        System.out.println("El total de dolares que tienen los tres es: U$D " +result);
    }
    
}
