package condicionales8;

/**
 *
 * @author federico pfund
 */

import java.util.Scanner;

public class Condicionales8 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite un número entre 0 y 10: ");
            var calificacion = Integer.parseInt(entrada.nextLine());
            if (calificacion >= 9 && calificacion <= 10) {
                System.out.println("A");            
            }
            else if (calificacion >= 8 && calificacion < 9){
                System.out.println("B");
            }
            else if (calificacion >= 7 && calificacion < 8) {
                System.out.println("C");
            }
            else if (calificacion >= 6 && calificacion < 7) {
                System.out.println("D");
            }
            else if (calificacion >= 0 && calificacion < 6) {
                System.out.println("F");
            }
            else{
                System.out.println("Fuera de rango");
            }
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }
    }
    
}
