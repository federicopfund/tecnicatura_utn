
package leccion1;

import java.util.Scanner;

public class Rectangulo {

	private Scanner entrada;
	
	/**
	 *         Define main.
	 */
	public static void main(String[] args) {
		setEntrada(new Rectangulo());

	}

	/**
	 *        Define Rectangulo.
	 */
	public Rectangulo() {
		 entrada = new Scanner(System.in);
	        System.out.println("Digite el alto del rectangulo: ");
	        int alto = Integer.parseInt(entrada.nextLine());
	        System.out.println("Digite el ancho del rectangulo: ");
	        int ancho = Integer.parseInt(entrada.nextLine());
	        int area = alto * ancho;
	        int perimetro = (alto + ancho) * 2;
	        System.out.println("Área: "+ area);
	        System.out.println("Perímetro: "+ perimetro);
	}

	/**
	 * Metodos setter and getter sincronicos.
	 */
	public synchronized Scanner getEntrada() {
		return entrada;
	}


	public synchronized static Rectangulo setEntrada(Rectangulo entrada) {
		return entrada;
	}


	

}
