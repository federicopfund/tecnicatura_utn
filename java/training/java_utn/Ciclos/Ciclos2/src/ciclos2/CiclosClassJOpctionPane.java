/*Ejercicio 2:
            Leer un numero e indica si es positivo o negativo.
            El proceso se repitira hasta que se introduca un 0.*/

package ciclos2;

import javax.swing.JOptionPane;

public class CiclosClassJOpctionPane {
    public static void main(String[] args) {
        
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Un Numero: "));
        
        
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero " + numero+ " es POSITIVO");
            }
            else{
                System.out.println("El numero " + numero+ " es NEGATIVO");
            }
            System.out.println("Digite otro numro: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro Numero: "));
        }
        System.out.println("EL NUMERO "+numero+" FINALIA EL PROGRAMA");
    }
}
