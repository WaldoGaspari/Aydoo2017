package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {
	
	@Test
	public void calcularGastoDeJuanEnElMesDeAgosto(){
		
		Publicacion revistaBarcelona = new Publicacion("Barcelona", 20, "quincenal");
		Publicacion revistaElGrafico = new Publicacion("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("Lapicera", 5);
		Publicacion diarioPagina12 = new Publicacion("Pagina 12", 12, "diaria");
		Publicacion diarioClarin = new Publicacion("Clarin", 13, "diaria");
		
		List<Producto> productos = new LinkedList<Producto>();
		productos.add(libro);
		productos.add(articulo);
		productos.add(articulo);
		productos.add(revistaElGrafico);
		
		Cliente cliente = new Cliente("Juan", "Santos Vega 1234");
		cliente.agregarProductosAlMes("agosto", productos);
		
		Assert.assertEquals(92.10, Libreria.calcularMontoACobrar("agosto", cliente), 0.1);
	}
	
	@Test
	public void calcularGastoDeMariaEnElMesDeEnero(){
		
		Publicacion revistaBarcelona = new Publicacion("Barcelona", 20, "quincenal");
		revistaBarcelona.calcularSuscripcion();
		Publicacion revistaElGrafico = new Publicacion("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("Lapicera", 5);
		Publicacion diarioPagina12 = new Publicacion("Pagina 12", 12, "diaria");
		Publicacion diarioClarin = new Publicacion("Clarin", 13, "diaria");
		
		List<Producto> productos = new LinkedList<Producto>();
		productos.add(revistaBarcelona);
		productos.add(diarioPagina12);
		
		Cliente cliente = new Cliente("Maria", "Pte.Peron 3587");
		cliente.agregarProductosAlMes("enero", productos);
		
		Assert.assertEquals(44.0, Libreria.calcularMontoACobrar("enero", cliente), 0.1);
	}
	
	@Test
	public void calcularGastoDePabloEnElMesDeJunio(){
		
		Publicacion revistaBarcelona = new Publicacion("Barcelona", 20, "quincenal");
		Publicacion revistaElGrafico = new Publicacion("El Grafico", 30, "mensual");
		Libro libro = new Libro("El Hobbit", 50, "Planeta");
		Libro libro1 = new Libro("La tregua", 100, "Sudamericana");
		ArticuloDeLibreria articulo1 = new ArticuloDeLibreria("Lapicera", 5);
		ArticuloDeLibreria articulo2 = new ArticuloDeLibreria("Cuaderno Rivadavia", 40);
		Publicacion diarioClarin = new Publicacion("Clarin", 13, "diaria");
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
		cliente.agregarProductosAlMes("marzo", productosDeMarzo);
		cliente.agregarProductosAlMes("abril", productosDeAbril);
		cliente.agregarProductosAlMes("mayo", productosDeMayo);
		cliente.agregarProductosAlMes("junio", productosDeJunio);
		
		Assert.assertEquals(382.0, Libreria.calcularMontoACobrar("junio", cliente), 0.1);
		Assert.assertEquals(30.0, Libreria.calcularMontoACobrar("mayo", cliente), 0.1);
	}
	
	@Test
	public void calcularGastoDeMartinEnElMesDeSeptiembreDeberiaDarCero(){
		
		Cliente cliente = new Cliente("Martin", "Espora 9987");
		cliente.agregarProductosAlMes("septiembre", new LinkedList<Producto>());
		
		Assert.assertEquals(0, Libreria.calcularMontoACobrar("septiembre", cliente), 0.1);
	}
	
	
}
