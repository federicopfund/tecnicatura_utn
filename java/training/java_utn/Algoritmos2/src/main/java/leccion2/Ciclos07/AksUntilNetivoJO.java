package leccion2.Ciclos07;

import javax.swing.JOptionPane;

public class AksUntilNetivoJO {

	public static AksUntilNetivoJO numero;

	public AksUntilNetivoJO() {
		int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){ 
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if(conteo==0){
            JOptionPane.showMessageDialog(null, "Error, La división entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        }
	}

	public static void main(String[] args) {
		numero = new AksUntilNetivoJO();

	}

}
