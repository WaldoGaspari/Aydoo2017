package ar.edu.untref.aydoo;

public class Candidato {
	
	private String nombre;
	private Partido partido;
	private int votos;
	
	public Candidato(String nombre, Partido partido){
		
		this.nombre = nombre;
		this.partido = partido;
		this.votos = 0;
	}
	
	public int obtenerVotos(){
		
		return this.votos;
	}
	
	public Partido obtenerPartido(){
		
		return this.partido;
	}
	
	public void sumarVoto(){
		
		this.votos++;
	}
	
	public String obtenerNombre(){
		
		return this.nombre;
	}

}
