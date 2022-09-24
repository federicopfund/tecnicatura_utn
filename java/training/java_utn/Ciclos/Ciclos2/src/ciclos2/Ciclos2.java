/*Ejercicio 2:
            Leer un numero e indica si es positivo o negativo.
            El proceso se repitira hasta que se introduca un 0.*/

package ciclos2;

import java.util.Scanner;


public class Ciclos2 {

    public static void main(String[] args) {
        // Ejercicio con scanner
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un Numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero" + numero+ "es POSITIVO");
            }
            else{
                System.out.println("El numero" + numero+ "es NEGATIVO");
            }
            System.out.println("Digite otro numro: ");
            numero = Integer.parseInt(entrada.nextLine());  
        }
        System.out.println("EL NUMERO "+numero+" FINALIA EL PROGRAMA");
    }
    
}


  