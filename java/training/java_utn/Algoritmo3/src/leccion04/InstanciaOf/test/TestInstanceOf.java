package leccion04.InstanciaOf.test;

import leccion04.InstanciaOf.domain.Empleado;
import leccion04.InstanciaOf.domain.Gerente;

public class TestInstanceOf {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 1000);
		Gerente gerente = new Gerente("Jose", 500, "Sistema");
		determinarTipo(gerente);
		System.out.println("Gerente: "+ gerente.obtenerDetalles());
	}
	
	public static void determinarTipo(Empleado empleado) {
		if(empleado instanceof Gerente) {
			System.out.println("Es de tipo Gerente");
			((Gerente) empleado).getDepartamento();
		}
		else if(empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");			
		}
		else if(empleado instanceof Object) {
			System.out.println("Es de tipo Object");			
		}
	}
}
