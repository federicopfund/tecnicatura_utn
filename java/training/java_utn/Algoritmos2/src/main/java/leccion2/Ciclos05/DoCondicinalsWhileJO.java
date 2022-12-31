package leccion2.Ciclos05;

import javax.swing.JOptionPane;
/*
		Ejercicio 5: Realizar un juego para adivinar un número,
		para ello generar un número aleatorio entre 0-100, y
		luego ir pidiendo números indicando "es mayor" o
		"es menor" según sea mayor o menor con respecto a N
		El proceso termina cuando el usuario acierta y mostramos
		el número de intentos hechos.
*/
public class DoCondicinalsWhileJO {
	public DoCondicinalsWhileJO() {
		 int numero, aleatorio, conteo = 0;
		   //Esto genera un número aleatorio
	        aleatorio = (int)(Math.random()*100);
	        do{ numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
	            if(numero < aleatorio){
	                JOptionPane.showMessageDialog(null, "Digite un número mayor");
	            }else if(numero > aleatorio){
	                JOptionPane.showMessageDialog(null, "Digite un número menor");
	            }else{JOptionPane.showMessageDialog(null, "¡¡¡FELICIDADES!!! Has adivinado el número");
	            }conteo++;
	        }while(numero != aleatorio);
	        JOptionPane.showMessageDialog(null, "Adivinaste el número en: "+conteo+" intentos");
	    }	

	public static DoCondicinalsWhileJO setEntrada(DoCondicinalsWhileJO entrada) {return entrada;
    }
	public static void main(String[] args) {setEntrada(new DoCondicinalsWhileJO());}

}
