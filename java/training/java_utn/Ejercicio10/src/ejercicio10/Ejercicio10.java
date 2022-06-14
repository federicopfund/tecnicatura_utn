/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        String estacion;
        if (mes == 1 || mes == 2 || mes ==3) {
            estacion = "Verano";
        }
        else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "Otoño";
        }
        else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";
        }
        else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";
        }
        else {
            estacion = "Número de mes no valido";
        }
        System.out.println("estacion = " + estacion);
        
    
    }
    
}
