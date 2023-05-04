package leccion04.SobreEscritura.Tests;

import leccion04.SobreEscritura.domain.Empleado;
import leccion04.SobreEscritura.domain.Gerente;

public class TestSobreEscritura {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 1000);
		Gerente gerente = new Gerente("Jose", 5000, "Sistema");
		imprimir(gerente);
		System.out.println("Gerente: "+ gerente.obtenerDetalles());
	}
	
	public static void imprimir(Empleado empleado) {
		String detalle = empleado.obtenerDetalles();
		System.out.println("detalles = " + detalle);
		System.out.println("empleado = "+ empleado.obtenerDetalles());
	}
}
