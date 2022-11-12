
package domain;

public class Persona {
    
    //Cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    // Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo 
        Persona.contadorPersona++; // No utilizar el operador this
        // Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }
    // Metodos que retornan un tipo de dato: entero
    public static int getContadorPersona() {
        return contadorPersona;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }
    
    
    // metodos setteer para cambiar el valor de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
  
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


    // Metodos que devuelven un String
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
