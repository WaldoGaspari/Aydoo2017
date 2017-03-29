package ar.edu.untref.aydoo;

public class Elector {
	
	private String nombre;
	private Voto voto;
	
	public Elector(String nombre){
		
		this.nombre = nombre;
	}
	
	public Voto votar(Candidato candidato, Provincia provincia){
		
		this.voto = new Voto(candidato, provincia);
		return this.voto;
	}

}
