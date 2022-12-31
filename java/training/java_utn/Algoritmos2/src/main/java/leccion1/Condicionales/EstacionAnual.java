package leccion1.Condicionales;

import java.util.Scanner;

public class EstacionAnual {

	private Scanner entrada;
    
	public static void main(String[] args) {
		setEntrada(new EstacionAnual());
		}
	
	public EstacionAnual() {
        entrada = new Scanner(System.in);
        System.out.println("Digite un número de mes: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";
        switch(mes){
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otonio";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
          
        }
        System.out.println("estacion = " + estacion);
	}

	public synchronized Scanner getEntrada() {
		return entrada;
	}

	public synchronized static EstacionAnual setEntrada(EstacionAnual entrada) {
		return entrada;
	}
}
