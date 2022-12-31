
package leccion1;

import java.util.Scanner;

public class Calificaciones {
	/**
	 *        Variable Local
	 */
	private Scanner entrada;
	/**
	 *             Main
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 *        Calificaciones
	 */
	public Calificaciones() {
		   entrada = new Scanner(System.in);
	        float nota1,nota2,nota3,suma;
	        
	    //   Guardamos las tres notas.
	        
	        System.out.println("Digite las tres calificaciones: ");
	        nota1 = Float.parseFloat(entrada.nextLine());
	        nota2 = Float.parseFloat(entrada.nextLine());
	        nota3 = Float.parseFloat(entrada.nextLine());
	        
	        suma = nota1 + nota2 + nota3;
	        
	        System.out.println("\nLa suma es: "+suma);
	}
	
	/**
	 *           Metodos 
	 */
	public synchronized Scanner getEntrada() {
		return entrada;
	}
	
	public synchronized void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

}
