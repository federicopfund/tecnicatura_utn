package leccion2.Ciclos02;

import java.util.Scanner;

public class WhileConditionalScanner {

	private Scanner entrada;

	public WhileConditionalScanner() {
		entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero > 0){
                System.out.println("El número "+numero+" es POSITIVO");
            }
            else{
                System.out.println("El número "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número "+numero+" finaliza el programa");
	}

	protected synchronized static WhileConditionalScanner setEntrada(WhileConditionalScanner Entrada) {
		return Entrada;
	}
	
	
	public static void main(String[] args) {
		setEntrada(new WhileConditionalScanner());

	}
}
