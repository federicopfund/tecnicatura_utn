
package cicloswhile;

public class CiclosWhile {

    public static void main(String[] args) {
       var conteo= 0;
        while(conteo < 3){
            System.out.println("conteo : " + conteo);
            // Incrmentamos variable
            conteo ++;
        }
        var contador = 0;
        do{ // block do
            System.out.println("contador" + contador);
            contador++;
           }while(contador < 7);
    }
    
}

