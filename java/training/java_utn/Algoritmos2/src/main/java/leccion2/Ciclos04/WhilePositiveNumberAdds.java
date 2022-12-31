package leccion2.Ciclos04;

import java.util.Scanner;

public class WhilePositiveNumberAdds {

	private Scanner entrada;

	public WhilePositiveNumberAdds() {
		entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El número "+numero+" es POSITIVO");
            conteo++;
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A Ingresado "+conteo+" números que no son negativos");
	}

	public static void main(String[] args) {
		setEntrada(new WhilePositiveNumberAdds());

	}

	public Scanner getEntrada() {
		return entrada;
	}

	public static WhilePositiveNumberAdds setEntrada(WhilePositiveNumberAdds entrada) {
		return entrada;
	}

}
