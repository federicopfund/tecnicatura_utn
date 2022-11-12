
package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Carlos,fede,juan,total;
        System.out.println("Digite la cantidad de dinero de Carlos: ");
        Carlos = Float.parseFloat(entrada.nextLine());
        
        fede = Carlos / 2;
        juan = (juan + Carlos)/ 2;
        total = juan + Carlos + fede;
        System.out.println("\nEl dinero de fede es: US$ "+ fede);
        System.out.println("El dinero de Juan es: US$ "+juan);
        System.out.println("El total de dinero entre los tres es: US$"+total);
    }
}
