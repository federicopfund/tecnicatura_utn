package leccion2.Ciclos06;

import java.util.Scanner;
/*
	Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
	la suma de todos los números introducidos.
*/
public class DoWhile {

	private Scanner entrada;

	public DoWhile() {
		entrada = new Scanner(System.in);
        int numero,suma = 0;
        do{ System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        }while(numero != 0);
        System.out.println("\nLa suma de todos los numeros ingresados es: "+suma);
	}

	public static void main(String[] args) {
		setEntrada(new DoWhile());

	}

	public Scanner getEntrada() {
		return entrada;
	}

	public static DoWhile setEntrada(DoWhile entrada) {
		return entrada;
	}

}
