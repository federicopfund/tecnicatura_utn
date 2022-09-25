/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos2;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class CiclosSuma {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero, suma = 0;
       do{
       System.out.print("Digite un numero: ");
       numero = Integer.parseInt(entrada.nextLine());
       suma +=numero;
       }while(numero !=0);
        System.out.println("\nLa suma de todos los numeros ingresados es: "+suma);
        }
    }

