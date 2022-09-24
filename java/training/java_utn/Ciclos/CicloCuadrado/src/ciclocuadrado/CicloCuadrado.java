
package ciclocuadrado;

import java.util.Scanner;

/*Ejercio 1:
            Leer un numero y mostrar su cuadrado, repetir 
            el proceso hasta que se introdusca un numero negativo
*/
public class CicloCuadrado {

    public static void main(String[] args) {
         // Invocamos la clase  Scanner
        Scanner entrada = new Scanner(System.in);
        // Inicializamos variables
        int numero, cuadrado;
        System.out.println("Digite un Numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        // Ciclo Mientra el numero >=0
        while(numero>=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El Numero" + numero + "elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro Numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        
        System.out.println("El programa a finalizado por numeros Negrativo");
    }
    
}
