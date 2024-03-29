package leccion5.ContextoEstatico.test;


import leccion5.ContextoEstatico.domain.Persona;

public class TestPersona {
private int contador;
    
    public static void main(String[] args) {
        // creo el primer objeto 
        Persona persona1 = new Persona("Conrado Martin");
        System.out.println("persona1 = " + persona1);
        // Creo el segundo objeto
        Persona persona2 = new Persona("Bruce lee");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);

        //this.contador = 10; //No se puede referenciar desde un contexto estático
        TestPersona personaPrueba1 = new TestPersona();
        System.out.println(personaPrueba1.getContador());
    }
    // Metodo que recibe un objeto persona como  parametro.
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Maria"));
        return this.contador;
    }
}
