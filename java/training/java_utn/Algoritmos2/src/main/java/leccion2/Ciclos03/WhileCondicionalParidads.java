package leccion2.Ciclos03;



import javax.swing.JOptionPane;

public class WhileCondicionalParidads {


	public WhileCondicionalParidads() {
		 int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero+" es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es "+numero+" finaliza el programa");
	}


	public static WhileCondicionalParidads setEntrada(WhileCondicionalParidads entrada) {
		return entrada;
	}

	public static void main(String[] args) {
		setEntrada(new WhileCondicionalParidads());
	}

}