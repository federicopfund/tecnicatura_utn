package leccion02.ForEch.Test;

import leccion02.ForEch.Domain.Persona;

public class TestForEach {

	
	// Ciclo for mejorado.
	public static void main(String[] args) {
		int edades[] = {5,3,4,3}; 
		// Sintaxis del ForEach
		for (int edad: edades) {
			System.out.println("edad = " + edad);
		}
		
		Persona personas[] = {new Persona("Matias"),new Persona("Juan"),new Persona("fede"),new Persona("Carlos")};
		
		for(Persona persona:personas) {
			System.out.print("Pesonas = "+ persona);
		}
	}

}
