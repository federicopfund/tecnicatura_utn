package leccion3.Clases;

public class Caja {
    
    // Atributos. 
    int ancho;
    int alto;
    int profundo;

	// Metodo y Contructores.
    public  Caja(int ancho, int alto, int profundo){
            this.ancho = ancho;
            this.alto = alto;
            this.profundo = profundo;
    }
  
    // Metodod para Calcular.
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
}


