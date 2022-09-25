package ciclos2;

import javax.swing.JOptionPane;

/*Ejercicio 7:
            Pedir numeros hasta que se introdusca uno negativo 
            y calcular la media*/

public class CiclosMedia {
    public static void main(String[] args) {
        int numero, conteo = 0, suma=0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero>=0){
            suma +=numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));  
            
        }
        if(conteo == 0){
            System.out.println("\n Error, la division eentre cero no existe");        
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("\n El promedio es "  + promedio);
        }   JOptionPane.showMessageDialog(null,"El promedio es: "+ promedio);
    }
}
