package leccion2.Ciclos04;


import javax.swing.JOptionPane;

public class WhilePositiveNumberAddsJO {

	public WhilePositiveNumberAddsJO() {
		int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "A Ingresado "+conteo+" números que no son negativos");
	}

	public static void main(String[] args) {
		setEntrada(new WhilePositiveNumberAddsJO());

	}

	public static WhilePositiveNumberAddsJO setEntrada(WhilePositiveNumberAddsJO entrada) {
		return entrada;
	}

}
