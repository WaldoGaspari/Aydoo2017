package ar.edu.untref.aydoo;

public class Cliente {
	
	private String nombre;
	private Tarjeta tarjeta;
	
	public Cliente(String nombre, Tarjeta tarjeta){
		this.nombre = nombre;
		this.tarjeta = tarjeta;
	}
	
	public Tarjeta obtenerTarjeta(){
		return this.tarjeta;
	}

}
