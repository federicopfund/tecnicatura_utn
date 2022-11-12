
package clasesobjetos;


public class ClasesObjetos {
    public static void main(String[] args) {
        Persona personaA ;
        // llamamos al constructor de la clase persona.
        personaA = new Persona();
       //Asinamos Valores al objeto de tipo persona creado 
       personaA.apellido = "Sztajnszrajber";
       personaA.nombre = "Dario";
       personaA.estudios = "Filosofía ";
       personaA.obtenerInformacion();
       Persona personaB =  new Persona();
       personaB.apellido = "Wolfram";
       personaB.nombre = "Stephen";
       personaB.estudios = " Ciencias de la computación, matemáticas y en física teórica";

       
    }   
}
