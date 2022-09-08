/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodschallenge;

/**
 *
 * @author feder
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Ex 1 Instance variables go here, Before the Loop");
        int x = 1;

        while (x < 4) {
            System.out.println("Ej 1 Ejecutar un bucle");
            System.out.println("Ej 1 Valor de x es " + x);
            x = x + 1;
        }
    System.out.println("Ejem. 1 Aquí es donde se devuelven los valores, si los hay, después del ciclo");
   }
}
