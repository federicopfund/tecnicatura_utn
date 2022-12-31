package leccion2.Ciclos08;

import java.util.Scanner;
/*
	Ejercicio 8: Pedir un número N, y mostrar todos los números
	del 1 al N.
*/

public class WhileStillMinor {

	private static Scanner entrada;
	public static WhileStillMinor ingresa;

	public WhileStillMinor() {
		  entrada = new Scanner(System.in);
	        System.out.println("Digite un número: ");
	        int numero = Integer.parseInt(entrada.nextLine());
	        int i = 1;
	        while( i <= numero){
	            System.out.println(i);
	            i++;
	           }
	        }

	public static void setNumero(WhileStillMinor ingresa) {
		WhileStillMinor.ingresa = ingresa;
	}

	public static void main(String[] args) {
		setNumero(new WhileStillMinor());
     }
}
