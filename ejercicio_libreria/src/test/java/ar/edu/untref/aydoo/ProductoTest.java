package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {
	
	@Test
	public void crearUnProductoDeTipoLibro(){
		
		Libro libro1 = new Libro("El senior de los anillos", 120.50, "Planeta");
		
		Assert.assertEquals(120.50, libro1.obtenerPrecio(), 0.1);
	}
	
	@Test
	public void crearUnProductoDeTipoArticuloDeLibreria(){
		
		ArticuloDeLibreria articulo1 = new ArticuloDeLibreria("Cuaderno Rivadavia", 50);
		
		Assert.assertEquals(60.5, articulo1.obtenerPrecio(), 0.1);
	}
	
	@Test
	public void crearUnProductoDeTipoPublicacion(){
		
		Publicacion publicacion = new Publicacion("Popular", 17.50, "diaria");
		
		Assert.assertEquals(17.50, publicacion.obtenerPrecio(), 0.1);
	}
	
	@Test (expected = Error.class)
	public void crearUnProductoConPrecioCeroDeberiaDarError(){
		
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("Lapicera BIC azul", 0.0);
	}
}
