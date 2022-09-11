
/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y 
luego ir pidiendo números indicando 'es mayor' o
'es menor' segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos 
el número de intentos hechos.
 */
package ciclos4;
import javax.swing.JOptionPane;

public class Ciclos4 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Este es un juego de adivinanza,"
                + "\n tenes que adivinar un número del 0 al 100.\n Suerte!");
        int alea = (int) Math.floor(Math.random()*100 + 1); // Numero a adivinar
        int intentos = 0;
        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre el 0 al 100"));
            // Incrememntamos un contador
            intentos++;
            if (numero == alea) {
                JOptionPane.showMessageDialog(null,"Correcto la solucion es "+alea+
                        " lo lograste en "+intentos+" intentos.");
                break;
            } 
            else if (numero > alea) {
                JOptionPane.showMessageDialog(null,"Incorrecto, no es "+numero+
                        ".\n Te pasaste!.\n Llevas "+intentos+" intentos.\n Intentalo nuevamente, suerte! ");
            }
            else if (numero < alea) {
                JOptionPane.showMessageDialog(null,"Incorrecto, no es "+numero+
                        ".\n Te quedaste corto!.\n Llevas "+intentos+
                        " intentos.\n Intentalo nuevamente, suerte! ");
            }
        }
        
    }
    
}