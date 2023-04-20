package ar.com.system.mundopc;

public class Teclado extends DispositivoEntrada{
			private final int idTeclado;
			private static int contadorTeclados;
			
			public Teclado(String tipoEntrada, String marca) {
				super(tipoEntrada, marca);
				this.idTeclado = ++Teclado.contadorTeclados;
			}
			
			public int getIdTeclado() {
				return idTeclado;
			}

			@Override
			public String toString() {
				return "Teclado [idTeclado=" + idTeclado + ", getIdTeclado()=" + getIdTeclado() + "]";
			}
		
			
}
