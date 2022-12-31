package leccion2.Ciclos11;

import javax.swing.JOptionPane;

/*
	Ejercicio 11: Diseñar un programa que muestre el producto
	de los 10 primeros números impares
	Hacerlo con JOptionPane.
*/


public class CalculateProduct {

	public static CalculateProduct sum;

	public CalculateProduct() {
		  long producto = 1;
	        for(int i = 1; i<=20;i+=2){ //El aumento apunta a solo ir por los impares
	            producto *= i;
	        }
	        JOptionPane.showMessageDialog(null, "El producto de los números impares es: "+producto);
	    }	

	public static void main(String[] args) {
		sum = new CalculateProduct();
	}

}
