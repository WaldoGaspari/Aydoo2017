package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class IntegracionTest {
	
	@Test
	public void votacion(){
		
		List<Candidato> politicos = new LinkedList<Candidato>();
		List<Provincia> provincias = new LinkedList<Provincia>();
		List<Elector> electores = new LinkedList<Elector>();
		List<Partido> partidos = new LinkedList<Partido>();
		
		partidos.add(new Partido("Partido Justicialista"));
		partidos.add(new Partido("Partido Sindicalista"));
		
		politicos.add(new Candidato("Juan Perez", partidos.get(0)));
		politicos.add(new Candidato("Jose Suarez", partidos.get(0)));
		politicos.add(new Candidato("Martin Lamas", partidos.get(1)));
		politicos.add(new Candidato("Mauro Gonzalez", partidos.get(1)));
		
		provincias.add(new Provincia("Buenos Aires"));
		provincias.add(new Provincia("Jujuy"));
		provincias.add(new Provincia("Salta"));
		
		electores.add(new Elector("Maria"));
		electores.add(new Elector("Pepe"));
		electores.add(new Elector("Lucia"));
		electores.add(new Elector("Mariano"));
		electores.add(new Elector("Juan"));
		electores.add(new Elector("Emilio"));
		electores.add(new Elector("Juana"));
		electores.add(new Elector("Nahuel"));
		
		Votaciones votacion = new Votaciones();
		votacion.agregarListaDeCandidatos(politicos);
		votacion.votar(electores.get(0).votar(politicos.get(0), provincias.get(0)));
		votacion.votar(electores.get(1).votar(politicos.get(0), provincias.get(0)));
		votacion.votar(electores.get(2).votar(politicos.get(0), provincias.get(0)));
		votacion.votar(electores.get(3).votar(politicos.get(2), provincias.get(1)));
		votacion.votar(electores.get(4).votar(politicos.get(2), provincias.get(1)));
		votacion.votar(electores.get(5).votar(politicos.get(0), provincias.get(1)));
		votacion.votar(electores.get(6).votar(politicos.get(0), provincias.get(2)));
		
		Assert.assertEquals(7, votacion.obtenerListaDeVotos().size());
	}
	
	@Test
	public void candidatoConMasVotos(){
		
		List<Candidato> politicos = new LinkedList<Candidato>();
		List<Provincia> provincias = new LinkedList<Provincia>();
		List<Elector> electores = new LinkedList<Elector>();
		List<Partido> partidos = new LinkedList<Partido>();
		
		partidos.add(new Partido("Partido Justicialista"));
		partidos.add(new Partido("Partido Sindicalista"));
		partidos.add(new Partido("Partido Obrero"));
		
		politicos.add(new Candidato("Juan Perez", partidos.get(0)));
		politicos.add(new Candidato("Jose Suarez", partidos.get(0)));
		politicos.add(new Candidato("Martin Lamas", partidos.get(1)));
		politicos.add(new Candidato("Mauro Gonzalez", partidos.get(1)));
		politicos.add(new Candidato("Pablo Heredia", partidos.get(2)));
		
		provincias.add(new Provincia("Buenos Aires"));
		provincias.add(new Provincia("Entre Rios"));
		provincias.add(new Provincia("Santa Fe"));
		provincias.add(new Provincia("La Pampa"));
		
		electores.add(new Elector("Maria"));
		electores.add(new Elector("Pepe"));
		electores.add(new Elector("Lucia"));
		electores.add(new Elector("Mariano"));
		electores.add(new Elector("Juan"));
		electores.add(new Elector("Emilio"));
		electores.add(new Elector("Juana"));
		electores.add(new Elector("Nahuel"));
		electores.add(new Elector("Mabel"));
		
		Votaciones votacion = new Votaciones();
		votacion.agregarListaDeCandidatos(politicos);
		votacion.votar(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		votacion.votar(electores.get(1).votar(politicos.get(2), provincias.get(0)));
		votacion.votar(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		votacion.votar(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		votacion.votar(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		votacion.votar(electores.get(5).votar(politicos.get(3), provincias.get(1)));
		votacion.votar(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		votacion.votar(electores.get(7).votar(politicos.get(3), provincias.get(0)));
		votacion.votar(electores.get(8).votar(politicos.get(2), provincias.get(2)));
		
		Assert.assertEquals(9, votacion.obtenerListaDeVotos().size());
		Assert.assertEquals(4, votacion.candidatoConMasVotosAnivelNacional().obtenerVotos());
	}
	
	@Test
	public void partidoConMasVotosEnBuenosAires(){
		
		List<Candidato> politicos = new LinkedList<Candidato>();
		List<Provincia> provincias = new LinkedList<Provincia>();
		List<Elector> electores = new LinkedList<Elector>();
		List<Partido> partidos = new LinkedList<Partido>();
		
		partidos.add(new Partido("Partido Justicialista"));
		partidos.add(new Partido("Partido Sindicalista"));
		partidos.add(new Partido("Partido Obrero"));
		partidos.add(new Partido("Partido Union Civica Radical"));
		
		politicos.add(new Candidato("Juan Perez", partidos.get(0)));
		politicos.add(new Candidato("Jose Suarez", partidos.get(0)));
		politicos.add(new Candidato("Martin Lamas", partidos.get(1)));
		politicos.add(new Candidato("Mauro Gonzalez", partidos.get(1)));
		politicos.add(new Candidato("Pablo Heredia", partidos.get(2)));
		politicos.add(new Candidato("Gaston Aguirre", partidos.get(3)));
		
		provincias.add(new Provincia("Buenos Aires"));
		provincias.add(new Provincia("Entre Rios"));
		provincias.add(new Provincia("Santa Fe"));
		provincias.add(new Provincia("La Pampa"));
		
		electores.add(new Elector("Maria"));
		electores.add(new Elector("Pepe"));
		electores.add(new Elector("Lucia"));
		electores.add(new Elector("Mariano"));
		electores.add(new Elector("Juan"));
		electores.add(new Elector("Emilio"));
		electores.add(new Elector("Juana"));
		electores.add(new Elector("Nahuel"));
		electores.add(new Elector("Mabel"));
		electores.add(new Elector("Silvia"));
		electores.add(new Elector("Pedro"));
		electores.add(new Elector("Julio"));
		
		
		Votaciones votacion = new Votaciones();
		votacion.agregarListaDeCandidatos(politicos);
		votacion.agregarListaDePartidos(partidos);
		votacion.votar(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		votacion.votar(electores.get(1).votar(politicos.get(1), provincias.get(0)));
		votacion.votar(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		votacion.votar(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		votacion.votar(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		votacion.votar(electores.get(5).votar(politicos.get(5), provincias.get(0)));
		votacion.votar(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		votacion.votar(electores.get(7).votar(politicos.get(5), provincias.get(0)));
		votacion.votar(electores.get(8).votar(politicos.get(4), provincias.get(0)));
		votacion.votar(electores.get(9).votar(politicos.get(5), provincias.get(0)));
		votacion.votar(electores.get(10).votar(politicos.get(2), provincias.get(0)));
		votacion.votar(electores.get(11).votar(politicos.get(2), provincias.get(3)));
		
		Assert.assertEquals(12, votacion.obtenerListaDeVotos().size());
		Assert.assertEquals(3, votacion.cantidadDeVotosDeUnPartido(partidos.get(3), provincias.get(0)));
		Assert.assertEquals(1, votacion.cantidadDeVotosDeUnPartido(partidos.get(2), provincias.get(0)));
		Assert.assertEquals("Partido Union Civica Radical", votacion.partidoConMasVotosPorProvincia(provincias.get(0)));
	}
	
	@Test
	public void partidoConMasVotosEnSantaFe(){
		
		List<Candidato> politicos = new LinkedList<Candidato>();
		List<Provincia> provincias = new LinkedList<Provincia>();
		List<Elector> electores = new LinkedList<Elector>();
		List<Partido> partidos = new LinkedList<Partido>();
		
		partidos.add(new Partido("Partido Justicialista"));
		partidos.add(new Partido("Partido Sindicalista"));
		partidos.add(new Partido("Partido Obrero"));
		partidos.add(new Partido("Partido Union Civica Radical"));
		
		politicos.add(new Candidato("Juan Perez", partidos.get(0)));
		politicos.add(new Candidato("Jose Suarez", partidos.get(0)));
		politicos.add(new Candidato("Martin Lamas", partidos.get(1)));
		politicos.add(new Candidato("Mauro Gonzalez", partidos.get(1)));
		politicos.add(new Candidato("Pablo Heredia", partidos.get(2)));
		politicos.add(new Candidato("Gaston Aguirre", partidos.get(3)));
		
		provincias.add(new Provincia("Buenos Aires"));
		provincias.add(new Provincia("Entre Rios"));
		provincias.add(new Provincia("Santa Fe"));
		provincias.add(new Provincia("La Pampa"));
		
		electores.add(new Elector("Maria"));
		electores.add(new Elector("Pepe"));
		electores.add(new Elector("Lucia"));
		electores.add(new Elector("Mariano"));
		electores.add(new Elector("Juan"));
		electores.add(new Elector("Emilio"));
		electores.add(new Elector("Juana"));
		electores.add(new Elector("Nahuel"));
		electores.add(new Elector("Mabel"));
		electores.add(new Elector("Silvia"));
		electores.add(new Elector("Pedro"));
		electores.add(new Elector("Julio"));
		
		
		Votaciones votacion = new Votaciones();
		votacion.agregarListaDeCandidatos(politicos);
		votacion.agregarListaDePartidos(partidos);
		votacion.votar(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		votacion.votar(electores.get(1).votar(politicos.get(1), provincias.get(0)));
		votacion.votar(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		votacion.votar(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		votacion.votar(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		votacion.votar(electores.get(5).votar(politicos.get(5), provincias.get(0)));
		votacion.votar(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		votacion.votar(electores.get(7).votar(politicos.get(5), provincias.get(0)));
		votacion.votar(electores.get(8).votar(politicos.get(4), provincias.get(0)));
		votacion.votar(electores.get(9).votar(politicos.get(5), provincias.get(2)));
		votacion.votar(electores.get(10).votar(politicos.get(2), provincias.get(0)));
		votacion.votar(electores.get(11).votar(politicos.get(0), provincias.get(2)));
		
		Assert.assertEquals(2, votacion.cantidadDeVotosDeUnPartido(partidos.get(0), provincias.get(2)));
		Assert.assertEquals("Partido Justicialista", votacion.partidoConMasVotosPorProvincia(provincias.get(2)));
	}

}
