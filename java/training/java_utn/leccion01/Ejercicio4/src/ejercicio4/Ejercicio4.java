
package ejercicio4;

import java.util.Scanner;

/**
 * @author federico pfund
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int num1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite otro numero");
        int num2 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("El numero mayor es: ");
        System.out.println(num1 > num2 ? num1 : num2);
        
        
    }
    
}
