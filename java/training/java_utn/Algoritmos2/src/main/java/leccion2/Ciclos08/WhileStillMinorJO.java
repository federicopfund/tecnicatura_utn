package leccion2.Ciclos08;

import javax.swing.JOptionPane;

public class WhileStillMinorJO {

	public static WhileStillMinorJO numero;

	public WhileStillMinorJO() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int i = 1;
        while( i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
	}

	public static void main(String[] args) {
		numero = new WhileStillMinorJO();
	}

}
