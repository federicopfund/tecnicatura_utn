

package Operaciones;


public class Aritmetica {
    
    // Atributos de la clase
    int a;
    int b;
    
    // Metodo Void
    // type de retorno: vacio "void"
    public void sumarNumeros(){
        int resultado = a +b ;
         System.out.println("resultado = " + resultado);
    }
   
    // tipo de retorno type: entero
    public int sumarConRetorno(){
       // retornara una exprecion
       return a + b;
   }
   // tipo de retorno type: entero
    public int sumarConArgumentos(int arg1,int arg2){
        // El argumento a se asigna al atributo this.a 
        // Una vez que se sale de la clase el operado se elimina
        // Es opcional se hace referencia a un atributo y no a una variable local.
        // Es como el self en python pero mas flexible
        //this.a = arg1;
        //this.b = arg2;
        
        a = arg1;
        b = arg2;
         return a + b; 
        
        // Operados This apunta al espacio de memoria
        //return this.sumarConArgumentos(3,2);
    }
}
