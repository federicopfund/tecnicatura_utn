/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccloswhilefor;

/**
 *
 * @author feder
 */
public class CclosWhileFor {

  
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
        // declarar var/condicion a cumplir/ incrememto o decremento del operador
        for(var contando = 0; contando < 7 ; contando++){
            System.out.println("contando = " + contando);
        }
    }
    
}

