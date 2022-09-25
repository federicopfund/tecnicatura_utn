/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesoperaciones;

/**
 *
 * @author feder
 */
public class Aritmetica {
    // Atributos
    int a;
    int b;
    
    // Metodos
    public int sumarNumeros(){
        int resultado = a + b;
        System.out.println("El resutado es: " + resultado);
        return resultado;
        }
    public int sumarNumeroConRetorno(){
        return a + b;
    }
    
    // Retorna con Argumentos
    public int sumarConArgumentos(int a,int b){
        // Apunta al espacio  de memoria donde esta guardado dicho atributo
        
        this.a = a;
        this.b = b;
        return sumarNumeroConRetorno();
    }
}
