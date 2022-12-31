package leccion2.Ciclos03;

import java.util.Scanner;

public class WhileCondicionalParidads {

	private Scanner entrada;

	public WhileCondicionalParidads() {
		 entrada = new Scanner(System.in);
	        int numero;
	        System.out.println("Digite un número: ");
	        numero = Integer.parseInt(entrada.nextLine());
	        while(numero != 0){
	            if(numero % 2 == 0){
	                System.out.println("El número ingresado "+numero+" es PAR");
	            }
	            else{
	                System.out.println("El número ingresado "+numero+" es IMPAR");
	            }
	            System.out.println("Digite otro número: ");
	            numero = Integer.parseInt(entrada.nextLine());
	        }
	        System.out.println("El número ingresado es "+numero+" finaliza el programa");
	}

	public synchronized Scanner getEntrada() {
		return entrada;
	}

	public static WhileCondicionalParidads setEntrada(WhileCondicionalParidads entrada) {
		return entrada;
	}

	public static void main(String[] args) {
		setEntrada(new WhileCondicionalParidads());
	}

}