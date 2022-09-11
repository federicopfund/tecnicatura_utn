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
public class MethodsChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //constructor - crea una nueva instancia de clase
        Methods2 e = new Methods2();
        e.loop(); 
        }
                
        void loop() {     
            System.out.println("Ejemplo 2 Las variables de instancia se repiten aquí, antes del ciclo");
            int x = 1;
            while (x < 4) {
                System.out.println("Ej 2 Ejecutar un bucle");
                System.out.println("Ej 2 Valor de x es " + x);
                x = x + 1;
            }
        System.out.println("Ej. 2 Aquí es donde se devuelven los valores, si los hay, después del ciclo");   
    }
}

    

