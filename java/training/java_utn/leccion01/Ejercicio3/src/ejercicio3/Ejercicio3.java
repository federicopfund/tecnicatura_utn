
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
