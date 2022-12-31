package leccion2.Ciclos10;

import javax.swing.JOptionPane;

public class PrintTheSumTotal {

	public static PrintTheSumTotal sum;

	public PrintTheSumTotal() {
		 int numero, suma = 0;
	        for(int i = 1; i <= 10; i++){
	            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
	            suma += numero;
	        }
	        JOptionPane.showMessageDialog(null, "La suma de todos los números es: "+suma);
	}

	public static void main(String[] args) {
		sum = new PrintTheSumTotal();
	}

}
