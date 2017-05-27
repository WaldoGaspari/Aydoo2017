package ar.edu.untref.aydoo;

public class Producto {

	private String descripcion;
	private double precio;
	private boolean conDescuento;

	public Producto(String descripcion, double precio){
		this.descripcion = descripcion;
		this.precio = precio;
		this.conDescuento = false;
	}

	public double obtenerPrecio(){
		return this.precio;
	}

	public String obtenerDescripcion(){
		return this.descripcion;
	}

	public boolean saberSiHayDescuento(){
		return this.conDescuento;
	}

	public void aplicarDescuento(){
		this.conDescuento = true;
	}
}
