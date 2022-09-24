

package Operaciones;


public class Aritmetica {
    
    // Atributos de la clase
    int a;
    int b;
    
    // metodo
   public void sumarNumeros(){
        int resultado = a + b ;
         System.out.println("resultado = " + resultado);
    } 

      // tipo de retorno type: entero
      public int sumarConRetorno(){
        // retornara una exprecion
        return a + b;
    }
    // tipo de retorno type: entero
     public int sumarConArgumentos(int arg1,int arg2){
         a = arg1;
         b = arg2;
         // operador this una ves que sale de la clase se destruye la variable.
         // 
         //this.a=arg1;
         //this.b=arg2;
         //return this.sumarConArgumentos(3,4);
         return a + b;    
     }
 
}
