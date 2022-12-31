package leccion2.Ciclos13;

import javax.swing.JOptionPane;

public class Factorial {
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		checkNumero(numero);
		int factorial =  Factorial(numero);
		JOptionPane.showMessageDialog(null,"El factorial del número ingresado es: "+ factorial);
	}
	
	public static int Factorial(int numero) {
		if (numero==1) {
		      return 1;
		    }
		    return numero*Factorial(numero-1);
	  }
	
	static void checkNumero(int numero) {
	    if (numero < 0) {
	      throw new ArithmeticException("Numero Invalido");
	    }
	    else {
	      System.out.println("Programa en ejecucion!");
	    }
	  }
}

