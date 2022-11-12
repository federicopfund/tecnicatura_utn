


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feder
 */
class SerHumano {
    //private String capacidades;
    private String sexos;
    private int altura;
    private int peso;
   
    
    
     // metodo set


    public void setSexo(String sexos){
        this.sexos = sexos;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    // metodo get
    public int getPeso() {
        return this.peso;
    }
    public int getAltura() {
        return this.altura;
    }
    public String getSexo() {
        return this.sexos;
    }

   
  
    
}
