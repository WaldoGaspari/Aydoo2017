package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.List;


public class Libreria {

	public static double calcularMontoACobrar(String mes, Cliente cliente){
		
		double resultado = 0;
		List<Producto> productos = cliente.obtenerListaDeProductos(mes);
		
		Iterator<Producto> iterador = productos.iterator();
		while(iterador.hasNext()){
			Producto producto = iterador.next();
			resultado = resultado + producto.obtenerPrecio();
		}
		return resultado;
	}
}
