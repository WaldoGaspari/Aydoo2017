package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Provincia {
	
	private String nombre;
	private List<Candidato> candidatos;
	
	public Provincia(String nombre){
		
		this.nombre = nombre;
		this.candidatos = new LinkedList<Candidato>();
	}
	
	public void agregarCandidato(Candidato candidato){
		
		this.candidatos.add(candidato);
	}

}
