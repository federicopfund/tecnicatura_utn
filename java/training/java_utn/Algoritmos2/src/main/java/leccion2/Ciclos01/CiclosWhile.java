package leccion2.Ciclos01;

import javax.swing.JOptionPane;

public class CiclosWhile {

	public CiclosWhile() {
    int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){ // Mientras el número sea igual a cero o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa a finalizado por numero negativo");
    }
	

	public static void main(String[] args) {
		CiclosWhile ciclos = new CiclosWhile();
	}

}
