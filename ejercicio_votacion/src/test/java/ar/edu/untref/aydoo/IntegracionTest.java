package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class IntegracionTest {
	
	@Test
	public void obtenerListaDeVotos(){
		
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
		
		JuntaElectoral junta = new JuntaElectoral();
		junta.agregarListaDeCandidatos(politicos);
		junta.ingresarVoto(electores.get(0).votar(politicos.get(0), provincias.get(0)));
		junta.ingresarVoto(electores.get(1).votar(politicos.get(0), provincias.get(0)));
		junta.ingresarVoto(electores.get(2).votar(politicos.get(0), provincias.get(0)));
		junta.ingresarVoto(electores.get(3).votar(politicos.get(2), provincias.get(1)));
		junta.ingresarVoto(electores.get(4).votar(politicos.get(2), provincias.get(1)));
		junta.ingresarVoto(electores.get(5).votar(politicos.get(0), provincias.get(1)));
		junta.ingresarVoto(electores.get(6).votar(politicos.get(0), provincias.get(2)));
		
		Assert.assertEquals(7, junta.obtenerListaDeVotos().size());
	}
	
	@Test
	public void obtenerCandidatoConMasVotosANivelNacionalDeberiaDarMauroGonzalez(){
		
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
		
		JuntaElectoral junta = new JuntaElectoral();
		junta.agregarListaDeCandidatos(politicos);
		junta.ingresarVoto(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		junta.ingresarVoto(electores.get(1).votar(politicos.get(2), provincias.get(0)));
		junta.ingresarVoto(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		junta.ingresarVoto(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		junta.ingresarVoto(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		junta.ingresarVoto(electores.get(5).votar(politicos.get(3), provincias.get(1)));
		junta.ingresarVoto(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		junta.ingresarVoto(electores.get(7).votar(politicos.get(3), provincias.get(0)));
		junta.ingresarVoto(electores.get(8).votar(politicos.get(2), provincias.get(2)));
		
		Assert.assertEquals(4, junta.obtenerCandidatoConMasVotosANivelNacional().obtenerVotos());
		Assert.assertTrue(junta.obtenerCandidatoConMasVotosANivelNacional().obtenerNombre().equals("Mauro Gonzalez"));
	}
	
	@Test
	public void obtenerPartidoConMasVotosEnBuenosAiresDeberiaDarPartidoUnionCivicaRadical(){
		
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
		
		
		JuntaElectoral junta = new JuntaElectoral();
		junta.agregarListaDeCandidatos(politicos);
		junta.agregarListaDePartidos(partidos);
		junta.ingresarVoto(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		junta.ingresarVoto(electores.get(1).votar(politicos.get(1), provincias.get(0)));
		junta.ingresarVoto(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		junta.ingresarVoto(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		junta.ingresarVoto(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		junta.ingresarVoto(electores.get(5).votar(politicos.get(5), provincias.get(0)));
		junta.ingresarVoto(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		junta.ingresarVoto(electores.get(7).votar(politicos.get(5), provincias.get(0)));
		junta.ingresarVoto(electores.get(8).votar(politicos.get(4), provincias.get(0)));
		junta.ingresarVoto(electores.get(9).votar(politicos.get(5), provincias.get(0)));
		junta.ingresarVoto(electores.get(10).votar(politicos.get(2), provincias.get(0)));
		junta.ingresarVoto(electores.get(11).votar(politicos.get(2), provincias.get(3)));
		
		Assert.assertEquals(3, junta.obtenerCantidadDeVotosDeUnPartido(partidos.get(3), provincias.get(0)));
		Assert.assertEquals(1, junta.obtenerCantidadDeVotosDeUnPartido(partidos.get(2), provincias.get(0)));
		Assert.assertEquals("Partido Union Civica Radical", junta.obtenerPartidoConMasVotosPorProvincia(provincias.get(0)));
	}
	
	@Test
	public void obtenerPartidoConMasVotosEnSantaFeDeberiaDarPartidoJusticialista(){
		
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
		
		
		JuntaElectoral junta = new JuntaElectoral();
		junta.agregarListaDeCandidatos(politicos);
		junta.agregarListaDePartidos(partidos);
		junta.ingresarVoto(electores.get(0).votar(politicos.get(1), provincias.get(0)));
		junta.ingresarVoto(electores.get(1).votar(politicos.get(1), provincias.get(0)));
		junta.ingresarVoto(electores.get(2).votar(politicos.get(1), provincias.get(3)));
		junta.ingresarVoto(electores.get(3).votar(politicos.get(0), provincias.get(2)));
		junta.ingresarVoto(electores.get(4).votar(politicos.get(3), provincias.get(1)));
		junta.ingresarVoto(electores.get(5).votar(politicos.get(5), provincias.get(0)));
		junta.ingresarVoto(electores.get(6).votar(politicos.get(3), provincias.get(2)));
		junta.ingresarVoto(electores.get(7).votar(politicos.get(5), provincias.get(0)));
		junta.ingresarVoto(electores.get(8).votar(politicos.get(4), provincias.get(0)));
		junta.ingresarVoto(electores.get(9).votar(politicos.get(5), provincias.get(2)));
		junta.ingresarVoto(electores.get(10).votar(politicos.get(2), provincias.get(0)));
		junta.ingresarVoto(electores.get(11).votar(politicos.get(0), provincias.get(2)));
		
		Assert.assertEquals(2, junta.obtenerCantidadDeVotosDeUnPartido(partidos.get(0), provincias.get(2)));
		Assert.assertEquals("Partido Justicialista", junta.obtenerPartidoConMasVotosPorProvincia(provincias.get(2)));
	}

}
