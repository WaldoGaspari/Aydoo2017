package ar.edu.untref.aydoo;

public class Partido {
	
	private String nombre;
	
	public Partido(String nombre){
		
		this.nombre = nombre;
	}
	
	public String obtenerNombreDelPartido(){
		
		return this.nombre;
	}

}
