package ar.edu.untref.aydoo;

public class Libro extends Producto {

	private String editorial;
	
	public Libro(String nombre, double precio,  String editorial){
		
		super(nombre, precio);
		this.editorial = editorial; 
	}
}
