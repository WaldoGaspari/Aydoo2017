package ar.edu.untref.aydoo;

public class Beneficio {
	
	private double porcentaje;
	
	public Beneficio(double porcentaje){
		
		if(porcentaje < 5){
			throw new Error("El porcentaje no puede ser menor a 5%");
			
		} else {
			this.porcentaje = porcentaje;
		}
	}
	
	public double sacarPrecioConDescuento(double precio){
		
		double descuento = (precio*this.porcentaje) / 100;
		double resultado = precio - descuento;
		return resultado;
	}
	
}
