
package ccloswhilefor;

public class CclosWhileFor {
    public static void main(String[] args) {
        // Definicion de variables
        var conteo= 0;
        var contador = 0;
        // Mientras conteo < 3 ejecuta el block
        while(conteo < 3){
            System.out.println("conteo : " + conteo);
            // Incrmentamos variable
            conteo ++;
        }
        // Luego de ejecutar el block While entra en el block do
        do{ System.out.println("contador" + contador);
            contador++;
        }while(contador < 7);
        // Break = "ROMPE UNA ESTRUCTURA CONDICIONAL"
        // declarar var/condicion a cumplir/ incrememto o decremento del operador
        for(var contando = 0; contando < 7 ; contando++){
            // Mostrara Numeros pares por una estructura condicional
            if(contador % 2 == 0){
                System.out.println("contando = " + contando);
                break;
            }
        }
        // Continue = "CONTINUE CON EL FLUJO DE EJECUCION". 
        for(var contando = 0; contando < 7 ; contando++){
            // Mostrara Numeros pares por una estructura condicional
            if(contador % 2 == 0){
                // Vamos a la Siguiente Iteracion.
                continue;
            }
            System.out.println("contando = " + contando);
        }
    }
    
}

