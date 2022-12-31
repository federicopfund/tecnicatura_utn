/**
 * 
 */
package leccion1;

import java.util.Scanner;

public class Numeros {

	private Scanner entrada;
	/**
	 *        main
	 */
	public static void main(String[] args) {
		setEntrada(new Numeros());

	}
	/**
	 *     Define Numeros
	 */
	public Numeros() {
	      entrada = new Scanner(System.in);
	        System.out.print("Digite un número: ");
	        int num1 = Integer.parseInt(entrada.nextLine());
	        System.out.print("Digite otro número: ");
	        int num2 = Integer.parseInt(entrada.nextLine());
	        System.out.print("El número mayor es: ");
	        System.out.print(num1 > num2 ? num1 : num2);
	        System.out.println("");
	}
	
	/**
	 *     Define getter y setter
	 */
	public synchronized Scanner getEntrada() {
		return entrada;
	}
	
	public synchronized static Numeros setEntrada(Numeros entrada) {
		return entrada;
	}

}
