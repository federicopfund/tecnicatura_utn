
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author federico pfund
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        String estacion;
        if (mes == 1 || mes == 2 || mes ==3) {
            estacion = "Verano";
        }
        else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "Otoño";
        }
        else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";
        }
        else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";
        }
        else {
            estacion = "Número de mes no valido";
        }
        System.out.println("estacion = " + estacion);
        
    
    }
    
}
