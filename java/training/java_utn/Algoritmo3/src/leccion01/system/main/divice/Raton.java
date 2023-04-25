package leccion01.system.main.divice;

public class Raton extends DispositivoEntrada {
	private final int idRaton;
	private static int contadorRatones;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRatones;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + "]";
	}
	
	
	
}
