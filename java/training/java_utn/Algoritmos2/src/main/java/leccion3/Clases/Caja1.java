package leccion3.Clases;



/**
 * @author federico pfund
 */
class Caja1 {
    
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