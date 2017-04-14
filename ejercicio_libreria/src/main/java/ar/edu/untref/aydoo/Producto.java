package ar.edu.untref.aydoo;

public abstract class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio){
		this.nombre = nombre;
		if(precio <= 0){
			throw new Error("El precio no puede ser cero o un numero negativo");
			
		} else {
			this.precio = precio;
		}
	}
	
	public double obtenerPrecio(){
		return this.precio;
	}
	
	public void cambiarPrecio(double nuevoPrecio){
		this.precio = nuevoPrecio;
	}

}
