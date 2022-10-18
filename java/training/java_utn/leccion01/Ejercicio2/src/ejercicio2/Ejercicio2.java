/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
// ejercicio que calcula el salario de un operador
/**
 * @author federico pfund
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero de horas semanales: ");
        int horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el valor de la hora: ");
        double valorHoras = Double.parseDouble(entrada.nextLine());
        double salarioSemanal = horasSemanales * valorHoras;
        System.out.println("\nEl salario semanal del tabajador sera:  $ "+ salarioSemanal);
    }
    
}
