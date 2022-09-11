/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feder
 */
public class MethodsChallenger {

    
    public static void main(String args[]) {
        System.out.println("Datos  de la Persona");
        Persona persona = new Persona();
        persona.setAltura(182);
        persona.setSexo("Hombre");
        persona.setPeso(76);
        
        System.out.println("Altura: " +  persona.getAltura()+ " cm");
        System.out.println("Sexo: " +  persona.getSexo());
        System.out.println("Peso: " + persona.getPeso() + " Kg");
        
        
        System.out.println("Datos del Cliente");
        Cliente cliente = new Cliente();
        
        cliente.setEdad(25);
        cliente.setNombre("Fede");
        cliente.setTelefono("29968653852");
        cliente.setCredito(10000);
        
        System.out.println("edad: " + cliente.getEdad());
        System.out.println("nombre: " + cliente.getNombre());
        System.out.println("telefono: " + cliente.getTelefono());
        System.out.println("credito: " + cliente.getCredito() + " $");
        
        System.out.println("");
        System.out.println("Datos del tabajador");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(24);
        trabajador.setNombre("fede");
        trabajador.setTelefono("3921221");
        trabajador.setSalario(8000);
        
        System.out.println("edad: " + trabajador.getEdad());
        System.out.println("nombre: " + trabajador.getNombre());
        System.out.println("telefono: " + trabajador.getTelefono());
        System.out.println("salario: " + trabajador.getSalario());
                
    }
    
}
