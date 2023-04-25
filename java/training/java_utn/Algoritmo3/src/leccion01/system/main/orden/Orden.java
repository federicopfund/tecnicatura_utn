package leccion01.system.main.orden;

import leccion01.system.main.divice.Computadora;


public class Orden {

	private final int idOrden;
	// Arreglo de objetos
	private Computadora computadora[];
	private static int contadorOrdenes;
	private static final int MAX_COMPUTADORAS = 10;
	private int contadorComputadora;
	
	
	// Constructor vacio.
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
	}

	
	// Metodo para agregar una nuea computadora al arreglo.
	
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadora < Orden.MAX_COMPUTADORAS) {
			this.computadora[this.contadorComputadora++] = computadora;
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: "+this.idOrden);
		System.out.println("Computadora de la Orden #: "+this.idOrden);
		for(int i = 0; i < this.contadorComputadora; i++) {
			System.out.println(this.computadora[i]);
		}
	}
}
