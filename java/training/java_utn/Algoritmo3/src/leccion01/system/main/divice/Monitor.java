package leccion01.system.main.divice;

public class Monitor {

	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tamanio) {
		this(); // llamado al constructor vacio
		this.marca = marca;
		this.tamanio = tamanio;
		
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getTamanio() {
		return this.tamanio;
	}
	// Ingresemos manualmente el getIdMonitor
	public int getIdMonitor() {
		return this.idMonitor;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", getTamanio()="
				+ getTamanio() + ", getIdMonitor()=" + getIdMonitor() + "]";
	}
	
	

}
