
 
package clasesobjetos;

public class Persona {
    //Atributod de la clase
    public String nombre;
    public String apellido;
    String estudios;
    // Metodos de la clase
    public void obtenerInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Estudios: "+ estudios);
    }
}
