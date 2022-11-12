/*
 *Paso por referencia
 */
package claseporreferencia;
// Importamos el pakage y llamamos la clase Persona 
import clasesobjetos.Persona;

/**
 
 * @author Federico pfund
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        // Todas la clases heredan de la clase Object
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1" + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+ persona1);
        Persona persona2 = new Persona();
        Persona persona = cambiarElValor(persona2);
        System.out.println("El valor de la persona es: "+ persona.nombre);
    }

    public static void cambiarValor(Persona persona){
        // parametro por referencia
        persona.nombre = "Maria";
    }
    
    public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.println("Valor de persona es invalido : Null");
            return null;
        }
        else{
            persona.nombre = "Monica";
            return persona;
        }
     
    } 
}
