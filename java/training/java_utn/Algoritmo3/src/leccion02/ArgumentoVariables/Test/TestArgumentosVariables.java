package leccion02.ArgumentoVariables.Test;

public class TestArgumentosVariables {

	public static void main(String[] args) {
		imprimirNumeros(3,3,1,4,2);
		imprimirNumeros(3,3,2);
		variosParametros("fede","pfund",3,6,4);
	}
	


	private static void imprimirNumeros(final int ...numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elementos: "+numeros[i]);
		}
	}
	
	private static void variosParametros(final String nombre,String apellido, int ...numeros) {
		System.out.print("Nombre: "+nombre);
		System.out.print("Apellido: "+apellido);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elementos: "+numeros[i]);
		}
	}
}
