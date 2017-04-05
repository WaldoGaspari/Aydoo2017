package ar.edu.untref.aydoo;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double obtenerPrecio(){
		return this.precio;
	}
	
	public void cambiarPrecio(double nuevoPrecio){
		this.precio = nuevoPrecio;
	}

}
