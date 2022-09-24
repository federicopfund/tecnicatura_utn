
package Operaciones;


public class PruevaAritmetica {
    public static void main(String[] args) {
        
        // Definicion de resultado de forma global
        int resultado;
        // Nuevo Objeto llamando a un constructor
        Aritmetica aritmetica1 = new Aritmetica();
        // Ingresamos valores al objeto a traves de invocar el 
        // Obj por su correspondiente atributo
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // Invocamos al metodo sumar numero:
        aritmetica1.sumarNumeros();
        // Crear una variable, type:int 
        // Invocar el metodo sumarConRetorno
        int resutado = aritmetica1.sumarConRetorno();
        System.out.println("resutado = " + resutado);
        
        
        resultado = aritmetica1.sumarConArgumentos(2, 3);
        System.out.println("resultado usando arg: " + resultado);
    }    
}