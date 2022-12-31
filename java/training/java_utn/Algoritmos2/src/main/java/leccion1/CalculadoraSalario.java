
package leccion1;

import java.util.Scanner;

public class CalculadoraSalario {
	
	/**
	 *      Define Variable local
	 */
	private Scanner entrada;
	private static CalculadoraSalario salario;
 
	/** 
	 *              main
	 */
	public static void main(String[] args) {
		setSalario(new CalculadoraSalario());
	}
	
	/**
	 *        Calculadora de salario
	 */
	public CalculadoraSalario() {
		  entrada = new Scanner(System.in);
	        int horasSemanales;
	        float salarioHora, salarioTotal;
	        
	        System.out.println("Digite las horas semanales  trabajadas: ");
	        horasSemanales = Integer.parseInt(entrada.nextLine());
	        System.out.println("Digite el salario que cobra por hora: ");
	        salarioHora = Float.parseFloat(entrada.nextLine());
	        
	        salarioTotal = horasSemanales * salarioHora;
	        System.out.println("\nEl salario semanal es: US$"+salarioTotal);
	}

	/**
	 *        getter and setter
	 */
	public static CalculadoraSalario getLibro() {
		return salario;
	}

	public static void setSalario(CalculadoraSalario salario) {
		CalculadoraSalario.salario = salario;
	}
}
