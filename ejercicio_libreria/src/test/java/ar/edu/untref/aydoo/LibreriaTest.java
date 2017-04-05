package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {
	
	@Test
	public void calcularGastoDeJuanEnElMesDeAgosto(){
		
		RevistaPeriodico revista = new RevistaPeriodico("Barcelona", 20, "quincenal");
		RevistaPeriodico otraRevista = new RevistaPeriodico("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("Lapicera", 5);
		RevistaPeriodico diario = new RevistaPeriodico("Pagina 12", 12, "diaria");
		RevistaPeriodico otroDiario = new RevistaPeriodico("Clarin", 13, "diaria");
		
		List<Producto> productos = new LinkedList<Producto>();
		productos.add(libro);
		productos.add(articulo);
		productos.add(articulo);
		productos.add(otraRevista);
		
		Cliente cliente = new Cliente("Juan", "Santos Vega 1234");
		cliente.agregarProductosAlMes("agosto", productos);
		
		Assert.assertEquals(92.10, Libreria.calcularMontoACobrar("agosto", cliente), 0.1);
	}
	
	@Test
	public void calcularGastoDeMariaEnElMesDeEnero(){
		
		RevistaPeriodico revista = new RevistaPeriodico("Barcelona", 20, "quincenal");
		revista.calcularSuscripcion();
		RevistaPeriodico otraRevista = new RevistaPeriodico("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("Lapicera", 5);
		RevistaPeriodico diario = new RevistaPeriodico("Pagina 12", 12, "diaria");
		RevistaPeriodico otroDiario = new RevistaPeriodico("Clarin", 13, "diaria");
		
		List<Producto> productos = new LinkedList<Producto>();
		productos.add(revista);
		productos.add(diario);
		
		Cliente cliente = new Cliente("Maria", "Pte.Peron 3587");
		cliente.agregarProductosAlMes("enero", productos);
		
		Assert.assertEquals(44.0, Libreria.calcularMontoACobrar("enero", cliente), 0.1);
	}
	
	@Test
	public void calcularGastoDePabloEnElMesDeJunio(){
		
		RevistaPeriodico revistaBarcelona = new RevistaPeriodico("Barcelona", 20, "quincenal");
		RevistaPeriodico revistaElGrafico = new RevistaPeriodico("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		Libro libro1 = new Libro("La tregua", 100, "Sudamericana");
		ArticuloDeLibreria articulo1 = new ArticuloDeLibreria("Lapicera", 5);
		ArticuloDeLibreria articulo2 = new ArticuloDeLibreria("Cuaderno Rivadavia", 40);
		RevistaPeriodico diarioPagina12 = new RevistaPeriodico("Pagina 12", 12, "diaria");
		RevistaPeriodico diarioClarin = new RevistaPeriodico("Clarin", 13, "diaria");
		diarioClarin.calcularSuscripcion();
		
		List<Producto> productosDeMarzo = new LinkedList<Producto>();
		productosDeMarzo.add(libro1);
		productosDeMarzo.add(articulo1);
		List<Producto> productosDeAbril = new LinkedList<Producto>();
		productosDeAbril.add(articulo1);
		productosDeAbril.add(articulo1);
		productosDeAbril.add(articulo2);
		List<Producto> productosDeMayo = new LinkedList<Producto>();
		productosDeMayo.add(revistaElGrafico);
		List<Producto> productosDeJunio = new LinkedList<Producto>();
		productosDeJunio.add(diarioClarin);
		productosDeJunio.add(libro);
		productosDeJunio.add(revistaBarcelona);
		
		Cliente cliente = new Cliente("Pablo", "Juan M. Rosas 8490");
		cliente.agregarProductosAlMes("enero", productosDeMarzo);
		cliente.agregarProductosAlMes("abril", productosDeAbril);
		cliente.agregarProductosAlMes("mayo", productosDeMayo);
		cliente.agregarProductosAlMes("junio", productosDeJunio);
		
		Assert.assertEquals(382.0, Libreria.calcularMontoACobrar("junio", cliente), 0.1);
		Assert.assertEquals(30.0, Libreria.calcularMontoACobrar("mayo", cliente), 0.1);
	}

}
