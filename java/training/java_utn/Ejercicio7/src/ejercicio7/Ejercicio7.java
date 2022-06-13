
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author federico pfund
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        final int salarioBase;
        salarioBase = 1000;
        double salarioComision = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de autos que vendio el empleado: ");
        int nAutos = Integer.parseInt(entrada.nextLine());
        for (int i = 1; i < nAutos+1; i++) {
            System.out.println("Introduzca el monto de venta del auto "+i);
            double montoVenta = Double.parseDouble(entrada.nextLine());
            salarioComision = salarioComision +  150 + (montoVenta * 0.05);
        }
        double salarioTotal = salarioBase + salarioComision;
        System.out.println("El salario total del empleado es: $"+salarioTotal);
    }
    
}
