
package Operaciones;


public class PruevaAritmetica {
    public static void main(String[] args) {
        int resultado;
        // Nuevo Objeto llamando a un constructor
        Aritmetica aritmetica1 = new Aritmetica();
        // ingresamos valores al objeto a traves de invocar el 
        // obj por su correspondiente atributo
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // invocamos al metodo sumar numero:
        aritmetica1.sumarNumeros();
        // crear una variable, type:int 
        // invocar el metodo sumarConRetorno
        int resutado = aritmetica1.sumarConRetorno();
        System.out.println("resutado = " + resutado);
        
        
        resultado = aritmetica1.sumarConArgumentos(2, 3);
        System.out.println("resultado usando arg: " + resultado);
    }    
}