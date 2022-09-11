/*
 * Ejercicio 3: Leer números hasta que se introduzca un cero
    Para cada uno indicar si es par o impar.
        -- Primero lo haremos con la clase Scanner
        -- Luego con la clase JOptionPane
 */
package ciclos1;

import java.util.Scanner;

import javax.swing.JOptionPane;


        
public class Ciclos1 {

    public static void main(String[] args) {
        
        // Ejercicio con scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esta es la ejecucion con la clase Scanner");
        while (true) {
            System.out.println("Introduzca un Numero: ");
            int numero = Integer.parseInt(entrada.nextLine());
            if (numero == 0) {
                System.out.println("El ciclo termino por ingrsar un 0.");
                break;
            }
 	// Este condicionar verificara que no es par .
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        }
        
        JOptionPane.showMessageDialog(null,
        
            "Esta es la ejecucion con la clase JOptionPane");

        while (true) {
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog(        
                         "Ingrese un número: "));
            
            if (numero == 0) {
                JOptionPane.showMessageDialog(null,
                "El ciclo termino por ingresar un 0");
                break;
            }
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null,"Es par");
            } else {
                JOptionPane.showMessageDialog(null,"Es impar");
                        
            }
        }
        
        
        
    }
    
}





