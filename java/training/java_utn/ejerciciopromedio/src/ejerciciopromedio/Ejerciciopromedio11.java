
package ejerciciopromedio;
/**
 * @author federico pfund
 */
import java.util.Scanner;

public class Ejerciciopromedio11 {

    public static void main(String[] args) {
        // lo primero que vamos hacer es crear una scaner variable para envasar las varibles utilizadas.
        Scanner variable = new Scanner(System.in);
        // cramos las variables tipo double
        float nota1,nota2,nota3,promedio;
        // damos un pequeño aviso al usuario para saber que esta pasando
        System.out.println("Definir las 3 calificaciones: ");
        System.out.println("Calificacion nota n°1: ");
        // asignamos una nueva variable y por por metodo le decimos como queremos q lo guarde
        nota1 = variable.nextFloat();
        System.out.println("Calificacion nota n°2: ");
        nota2 = variable.nextFloat();
        System.out.println("Calificacion nota n°3: ");
        nota3 = variable.nextFloat();
        // calculamos el promedio
        promedio = ((nota1 + nota2 + nota3)/3)*10;
        // condicional
        if (promedio>=70){
             System.out.println("El Alumno esta aprobado: " + promedio);
        }else{
            System.out.println("El Alumno esta desaprobado: " + promedio);
        }
        
    }
    
}
