package leccion2.Ciclos02;

import javax.swing.JOptionPane;

public class WhileConditionals {
    private static WhileConditionals nuevo;
    
    public WhileConditionals() {
		var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
	
	
	public static WhileConditionals getNuevo() {
		return nuevo;
	}


	public static void setNuevo(WhileConditionals nuevo) {
		WhileConditionals.nuevo = nuevo;
	}

	public static void main(String[] args) {
			setNuevo(new WhileConditionals());
			
	}
}
