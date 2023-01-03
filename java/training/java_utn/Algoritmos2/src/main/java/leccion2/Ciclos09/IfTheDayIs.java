package leccion2.Ciclos09;

import java.util.Scanner;
/*
	Ejercicio 9: Pedir el día, mes y año de una fecha e
	indicar si la fecha es correcta. Suponiendo que 
	todos los meses son de 30 días.
*/


public class IfTheDayIs {

	private Scanner entrada;
	public static IfTheDayIs fecha;

	public IfTheDayIs() {
		 entrada = new Scanner(System.in);
	        System.out.println("Digite el día: ");
	        int dia = Integer.parseInt(entrada.nextLine());
	        System.out.println("Digite el mes: ");
	        int mes = Integer.parseInt(entrada.nextLine());
	        System.out.println("Digite el año: ");
	        int anio = Integer.parseInt(entrada.nextLine());
	        if((dia != 0)&&(dia <= 30)){
	            if((mes != 0)&&(mes <= 12)){
	                if((anio != 0)&&(anio <= 2022)){
	                    System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
	                }
	                else{
	                    System.out.println("Fecha incorrecta, año incorrecto");
	                }
	            }
	            else{
	                System.out.println("Fecha incorrecta, mes incorrecto");
	            }
	        }
	        else{
	            System.out.println("Fecha incorrecta, día incorrecto");
	        }
	}

	public static void main(String[] args) {
		fecha = new IfTheDayIs();
	}

}