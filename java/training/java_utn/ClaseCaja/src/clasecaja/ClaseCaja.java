/*
    Proyecto caja:
      Ejercitacion 1: Crear un proyecto sugun las especificaciones 
                      mostradas a continuacion
                     
La formula es: 
             Volumen = ancho * alto * profundidad
 */
package clasecaja;

/**
 * @author federico pfund
 */
public class ClaseCaja {
    public static void main(String[] args) {
        // Variable locales 
        int medidaAncho = 3;
        // Valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProf = 6;
        
        // Instanciamos el objeto, contrucutor vacio.
        
        Caja nuevaCaja = new Caja();
        
        // le pasamos los valores al objeto.
        
        nuevaCaja.ancho = medidaAncho;
        nuevaCaja.alto = medidaAlto;
        nuevaCaja.profundo = medidaProf;
        
        // Llamamos al metodo.
        int resultado = nuevaCaja.calcularVolumen();
        // primer resultado.
        System.out.println("Resultado volumen de caja 1: " + resultado);
        // llamamos al contructor 2 con nuevos argumentos.
        Caja segundaCaja = new Caja(2,3,6);
        // llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("El volumen de la caja 2 es:" + segundaCaja.calcularVolumen());
    }

}
