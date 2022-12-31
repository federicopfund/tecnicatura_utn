package leccion2.Ciclos10;

import java.util.Scanner;

public class PrintTheTotalSum {

	private Scanner entrada;
	public static PrintTheTotalSum sum;

	public PrintTheTotalSum() {
		entrada = new Scanner(System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de todos los números es: "+suma);
	}

	public static void main(String[] args) {
		sum = new PrintTheTotalSum();

	}

}
