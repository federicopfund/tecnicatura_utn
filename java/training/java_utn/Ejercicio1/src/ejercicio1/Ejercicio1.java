/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
// importamos librerias
import java.util.Scanner;
/**
 * @author federico pfund
 */
public class Ejercicio1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        //Devuelve verdadero si y solo si la propiedad del sistema nombrada por el argumento existe y es igual a la cadena "verdadero"
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        // Mostramos por pantalla los resultados
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("El precio es: $"+precioLibro);
        System.out.println("El envio es gratuito?: "+envioGratuito);
    }
    
}

    
