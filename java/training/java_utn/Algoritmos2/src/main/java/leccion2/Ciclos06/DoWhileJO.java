package leccion2.Ciclos06;
/*
	Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
	la suma de todos los números introducidos.
*/

import javax.swing.JOptionPane;

public class DoWhileJO {

	public DoWhileJO() {
		 int numero,suma = 0;
	        do{
	            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	            suma+= numero;
	        }while(numero != 0);
	        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: "+suma);
	}

	public static DoWhile setEntrada(DoWhile entrada) {
		return entrada;
	}

	public static void main(String[] args) {
		setEntrada(new DoWhile());

	}
}
