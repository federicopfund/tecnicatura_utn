package leccion2.Ciclos09;

import javax.swing.JOptionPane;
/*
	Ejercicio 9: Pedir el día, mes y año de una fecha e
	indicar si la fecha es correcta. Suponiendo que 
	todos los meses son de 30 días.
*/
public class IfTheDayIsJO {

	public static IfTheDayIsJO fecha;

	public IfTheDayIsJO() {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if((dia != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                if((anio != 0)&&(anio <= 2022)){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
        }	}

	public static void main(String[] args) {
		fecha = new IfTheDayIsJO();

	}

}