package ar.edu.untref.aydoo;

public class ArticuloDeLibreria extends Producto {
	
	private final double porcentajeIVA = 0.21;
	private double IVA;
	
	public ArticuloDeLibreria(String nombre, double precio){
		super(nombre, precio);
		this.IVA = obtenerPrecio()*this.porcentajeIVA;
		cambiarPrecio(this.obtenerPrecio() + this.IVA);
	}
	
	public double obtenerIVA(){
		return this.IVA;
	}
}
