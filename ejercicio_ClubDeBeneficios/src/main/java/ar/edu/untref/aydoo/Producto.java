package ar.edu.untref.aydoo;

public class Producto {

	private String descripcion;
	private double precio;

	public Producto(String descripcion, double precio){
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public double obtenerPrecio(){
		return this.precio;
	}

	public String obtenerDescripcion(){
		return this.descripcion;
	}

}
