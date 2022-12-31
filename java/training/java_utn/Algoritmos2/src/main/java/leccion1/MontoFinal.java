package leccion1;

import java.util.Scanner;

public class MontoFinal {

	private Scanner entrada;

	public MontoFinal() {
		entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porcVenta, totalPrecio;

        System.out.print("Digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el precio de un carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porcVenta = totalPrecio * 0.05f;
        salarioMensual = salario + comision + porcVenta;

        System.out.println("\nEl salario mensual es: " + salarioMensual);
	}

	protected synchronized Scanner getEntrada() {
		return entrada;
	}

	public synchronized static MontoFinal setEntrada(MontoFinal entrada) {
		return entrada;
	}

	public static void main(String[] args) {
		setEntrada(new MontoFinal());
	}

}
