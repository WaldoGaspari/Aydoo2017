package ar.edu.untref.aydoo;

/**
 * El Libro es un objeto de valor ya que solo tiene identidad cuando le asignamos valor.
 */
public class Libro extends Producto {

	private String editorial;
	
	public Libro(String nombre, double precio,  String editorial){
		
		super(nombre, precio);
		this.editorial = editorial; 
	}
}
