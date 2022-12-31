package leccion1.Condicionales;

import java.util.Scanner;

public class Estacion {

	private Scanner scanner;
	
	public static void main(String[] args) {
		setScanner(new Estacion());
		
	}

	public Estacion() {
        System.out.println("Digite un mes del año: ");
        scanner = new Scanner(System.in);
		var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estación desconocida";
        if(mes == 1 || mes == 2 || mes == 3){
            estacion = "Verano";
        }
        else if(mes == 4 || mes == 5 || mes == 6){
            estacion = "Otonio";
        }
        else if(mes == 7 || mes == 8 || mes == 9){
            estacion = "Invierno";
        }
        else if(mes == 10 || mes == 11 || mes == 12){
            estacion = "Primavera";
        }
        
        System.out.println("estacion = " + estacion);
    }
	

	public synchronized Scanner getScanner() {
		return scanner;
	}


	public synchronized static Estacion setScanner(Estacion estacion) {
		return estacion;
	}

}
