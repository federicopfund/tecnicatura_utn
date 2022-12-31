package leccion1.Condicionales;

import java.util.Scanner;

public class Calificacion {

	private Scanner scanner;
	
	public static void main(String[] args) {
		setEstacion(new Calificacion());

	}
	
	public Calificacion() {
	    System.out.println("Digite un número entre 0 y 10: ");
        scanner = new Scanner(System.in);
		var calificacion = Integer.parseInt(scanner.nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }
        else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }
        else if(calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }
        else{
            System.out.println("Fuera de rango");
        }
	}

	
	public synchronized final Calificacion setScanner(Calificacion scanner) {
		return scanner;
	}

	private static Calificacion setEstacion(Calificacion calificacion) {
		return calificacion;
		
	}

}
