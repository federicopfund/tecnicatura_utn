package leccion2.Ciclos07;

import java.util.Scanner;

public class AskUntilNegative {

	private Scanner entrada;

	public AskUntilNegative() {
		entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
      //Mientras el numero no sea negativo
        while(numero >= 0){ 
            suma += numero;
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo==0){
            System.out.println("\nError, La división entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: "+promedio);
        }
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public static AskUntilNegative setEntrada(AskUntilNegative entrada) {
		return entrada;
	}

	public static void main(String[] args) {
		setEntrada(new AskUntilNegative());

	}

}
