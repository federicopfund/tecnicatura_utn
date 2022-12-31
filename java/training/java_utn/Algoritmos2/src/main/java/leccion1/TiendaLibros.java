package leccion1;

import java.util.Scanner;

public class TiendaLibros {
	
	private Scanner entrada;
	private static TiendaLibros libro;
	public static void main(String[] args) {
		setLibro(new TiendaLibros());
	}

	public TiendaLibros() {
		entrada = new Scanner(System.in);
        System.out.println("Digite en nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio del libro gratuito es: "+envioGratuito);
    
	}
	
	public static TiendaLibros getLibro() {
		return libro;
	}

	public static void setLibro(TiendaLibros libro) {
		TiendaLibros.libro = libro;
	}

}
