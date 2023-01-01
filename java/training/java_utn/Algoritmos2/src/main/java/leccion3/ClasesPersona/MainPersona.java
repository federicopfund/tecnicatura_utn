package leccion3.ClasesPersona;

public class MainPersona {

	public static void main(String[] args) {
		 Persona persona1 = new Persona(); //Llamamos al constructor
	        persona1.nombre = "Ariel"; //El valor hexadecimal normalmente comienza con 0x
	        persona1.apellido = "Betancud";
	        persona1.obtenerInformacion();
	        
	        Persona persona2 = new Persona();
	        System.out.println("Se mostrara el codigo de memoria");
	        System.out.println("persona2 = " + persona2);
	        System.out.println("persona1 = " + persona1);
	        System.out.println("persona2 como vera no tienen un nombre asignado, respuesra null");
	        persona2.obtenerInformacion();
	        System.out.println("Ahora si vera la asignacion de sus atributos en el OBJETO 2");
	        persona2.nombre = "Osvaldo";
	        persona2.apellido = "Giordanini";
	        persona2.obtenerInformacion();
	    }

	}


