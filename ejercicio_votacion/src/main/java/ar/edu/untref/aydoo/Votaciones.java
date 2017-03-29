package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Votaciones {
	
	private List<Voto> votos = new LinkedList<Voto>();
	private List<Candidato> candidatos = new LinkedList<Candidato>();
	private List<Partido> partidos = new LinkedList<Partido>();
	
	public void votar(Voto votoNuevo){
		
		this.votos.add(votoNuevo);
		int i = 0;
		Iterator<Candidato> iterador = this.candidatos.iterator();
		
		while(iterador.hasNext()){
			
			Candidato candidato = iterador.next();
			
			if(candidato.obtenerNombre() == votoNuevo.obtenerCandidato().obtenerNombre()){
				
				this.candidatos.get(i).sumarVoto();
				
			} else {
				i++;
			}
		}
	}
	
	public void agregarListaDeCandidatos(List<Candidato> candidatos){
		
		this.candidatos = candidatos;
	}
	
	public void agregarListaDePartidos(List<Partido> partidos){
		
		this.partidos = partidos;
	}
	
	public List<Voto> obtenerListaDeVotos(){
		
		return this.votos;
	}
	
	public int cantidadDeVotosDeUnPartido(Partido partido, Provincia provincia){
		
		int cantidadDeVotos = 0;
		Iterator<Voto> iterador = this.votos.iterator();
		
		while(iterador.hasNext()){
			
			Voto voto = iterador.next();
			
			if(voto.obtenerCandidato().obtenerPartido().obtenerNombreDelPartido() == partido.obtenerNombreDelPartido() && voto.obtenerProvincia() == provincia){
				
				cantidadDeVotos++;
			}
		}
		
		return cantidadDeVotos;
	}
	
	public Candidato candidatoConMasVotosAnivelNacional(){
		
		int votos = this.candidatos.get(0).obtenerVotos();
		Candidato candidatoGanador = this.candidatos.get(0);
		Iterator<Candidato> iterador = this.candidatos.iterator();
		
		while(iterador.hasNext()){
			
			Candidato candidato = iterador.next();
			
			if(candidato.obtenerVotos() > votos){
				
				candidatoGanador = candidato;
				votos = candidato.obtenerVotos();
			}
		}
		
		return candidatoGanador;
	}
	
	public String partidoConMasVotosPorProvincia(Provincia provincia){
		
		int [] votosDeCadaPartido = new int[this.partidos.size()];
		int i = 0;
		int cantidadMayorDeVotos;
		int indice = 0;
		
		Iterator<Partido> iterador = this.partidos.iterator();
		
		while(iterador.hasNext()){
			
			Partido partido = iterador.next();
			votosDeCadaPartido[i] = cantidadDeVotosDeUnPartido(partido, provincia);
			i++;
		}
		
		cantidadMayorDeVotos = votosDeCadaPartido[0];
		
		for(i = 1; i < votosDeCadaPartido.length; i++ ){
			
			if(votosDeCadaPartido[i] > cantidadMayorDeVotos ){
				cantidadMayorDeVotos = votosDeCadaPartido[i];
				indice = i;
			}
		}
		
		return this.partidos.get(indice).obtenerNombreDelPartido();
	}

}
