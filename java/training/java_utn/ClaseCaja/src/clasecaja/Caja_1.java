/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecaja;

/**
 *
 * @author feder
 */
class Caja {
        
    // Atributos. 
    int ancho;
    int alto;
    int profundo;

    // Metodo y Contructores.
    public void Caja(int ancho, int alto, int profundo){
            this.ancho = ancho;
            this.alto = alto;
            this.profundo = profundo;
    }
  
    // Metodod para Calcular.
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
}
