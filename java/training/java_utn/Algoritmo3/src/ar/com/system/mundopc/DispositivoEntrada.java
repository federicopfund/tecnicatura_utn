package ar.com.system.mundopc;

public class DispositivoEntrada {
	
	// Creamos atributos de la clase
	
	private String tipoEntrada;
	private String marca;
	
	public DispositivoEntrada(String tipoEntrada,String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}
	
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + ", getTipoEntrada()="
				+ getTipoEntrada() + ", getMarca()=" + getMarca() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
