package leccion6.Herencia.Test;

import leccion6.Herencia.Dominio.Cliente;
import leccion6.Herencia.Dominio.Empleado;
import leccion6.Herencia.Dominio.Persona;

import java.util.Date;

public class TestHerencia {
    public static Persona persona1;

	public static void main(String[] args) {
        Empleado empleado1 = new Empleado("FEDE", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413");
        System.out.println("cliente1 = " + cliente1);
        
        persona1 = new Persona();
    }
}
