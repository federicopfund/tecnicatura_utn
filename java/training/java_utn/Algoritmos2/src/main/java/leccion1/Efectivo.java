/**
 * 
 */
package leccion1;

import java.util.Scanner;

public class Efectivo {

	private Scanner entrada;
	/**
	 *       @param Main
	 */
	public static void main(String[] args) {
		setEntrada(new Efectivo());

	}
	/**
	 *      Difine Efectivo
	 */
	public Efectivo() {
		entrada = new Scanner(System.in);
        float Carlos,fede,juan = 0,total;
        System.out.println("Digite la cantidad de dinero de Carlos: ");
        Carlos = Float.parseFloat(entrada.nextLine());
        
        fede = Carlos / 2;
        juan = (juan + Carlos)/ 2;
        total = juan + Carlos + fede;
        System.out.println("\nEl dinero de fede es: US$ "+ fede);
        System.out.println("El dinero de Juan es: US$ "+juan);
        System.out.println("El total de dinero entre los tres es: US$"+total);
	}
	
	/**
	 *      Metodos setter y getter
	 */
	
	public synchronized Scanner getEntrada() {
		return entrada;
	}
	
	public synchronized static Efectivo setEntrada(Efectivo entrada) {
		return entrada;
	}


}
