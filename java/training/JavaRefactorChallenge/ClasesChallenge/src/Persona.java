
public class Persona extends SerHumano {
    // Definicion de atributos
    private int edad;
    private String nombre;
    private String telefono;
    
    //*/ Nuevos metodos para Setting variable*/
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Nuevos metodos para Gettering Variables
    public int getEdad() {
        return edad;
    }
    
   
    public String getNombre() {
        return nombre;
    }
        
    public String getTelefono() {
        return telefono;
    }
    
}

