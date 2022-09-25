
package clasesoperaciones;

public class ClasesOperaciones {

    public static void main(String[] args) {
        Aritmetica suma= new Aritmetica();
        suma.a=3;
        suma.b=3;
        
        //Invocamos el metodo
        
        System.out.println("la suma es igual " +suma.sumarNumeros());
        
    }
}