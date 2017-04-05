package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {
	
	@Test
	public void crearUnProducto(){
		
		Producto producto1 = new Producto("Lapiz", 5.60);
		
		Assert.assertEquals(5.60, producto1.obtenerPrecio(), 0.1);
	}
	
	@Test
	public void crearUnProductoDeTipoLibro(){
		
		Libro libro1 = new Libro("El senior de los anillos", 120.50, "Planeta");
		
		Assert.assertEquals(120.50, libro1.obtenerPrecio(), 0.1);
	}
	
	@Test
	public void crearUnProductoDeTipoArticuloDeLibreria(){
		
		ArticuloDeLibreria articulo1 = new ArticuloDeLibreria("Cuaderno Rivadavia", 50);
		
		Assert.assertEquals(10.5, articulo1.obtenerIVA(), 0.1);
		Assert.assertEquals(60.5, articulo1.obtenerPrecio(), 0.1);
	}
	
	@Test
	public void crearUnProductoDeTipoRevistaPeriodico(){
		
		RevistaPeriodico periodico = new RevistaPeriodico("Popular", 17.50, "diaria");
		
		Assert.assertEquals(17.50, periodico.obtenerPrecio(), 0.1);
	}

}
