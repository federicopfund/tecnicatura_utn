
package ciclocuadrado;

import javax.swing.JOptionPane;


public class CicloJOptionPane {
    public static void main(String[] args) {
        int numero,cuadrado;
        // La clase JOpcionPane trabaja con type :String
        // Necesitamos hacer una convercion
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero>=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El Numero "+ numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa a finaliado por numeros negativos.");
        
    }
}
