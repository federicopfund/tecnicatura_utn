package leccion04.SobreEscritura.Tests;

import leccion04.SobreEscritura.domain.Gerente;

public class TestSobreEscritura {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Jose",5000,"Sistema");
		System.out.println("Gerente: "+ gerente.obtenerDetalles());
	}

}
