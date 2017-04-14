package ar.edu.untref.aydoo;

public class Publicacion extends Producto {
	
	private String periodicidad;
	private static final double descuento = 0.2; 
	
	public Publicacion(String nombre, double precio, String periodicidad){
		super(nombre, precio);
		this.periodicidad = periodicidad;
	}
	
	public String obtenerPeriodicidad(){
		return this.periodicidad;
	}
	
	public void calcularSuscripcion(){
		double auxiliar = 0;
		if(this.periodicidad.equals("diaria")){
			auxiliar = this.obtenerPrecio()*30;
			this.cambiarPrecio(auxiliar);
			auxiliar = auxiliar*Publicacion.descuento;
			this.cambiarPrecio(this.obtenerPrecio()-auxiliar);
			
		} else if(this.periodicidad.equals("quincenal")){
			auxiliar = this.obtenerPrecio()*2;
			this.cambiarPrecio(auxiliar);
			auxiliar = auxiliar*Publicacion.descuento;
			this.cambiarPrecio(this.obtenerPrecio()-auxiliar);
			
		} else{
			auxiliar = this.obtenerPrecio()*Publicacion.descuento;
			this.cambiarPrecio(this.obtenerPrecio()-auxiliar);
		}
	}
}
