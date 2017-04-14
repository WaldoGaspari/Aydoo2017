package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.List;

/**
 * La Libreria es un servicio ya que no presenta entidades ni objetos de valor. Solo se encarga de la logica de cierta funcionalidad
 * del dominio.
 */
public class Libreria {

	public static double calcularMontoACobrar(String mes, Cliente cliente){
		
		double resultado = 0;
		if(cliente.obtenerListaDeProductos(mes).isEmpty()){
			return resultado;
			
		} else{
			List<Producto> productos = cliente.obtenerListaDeProductos(mes);
			Iterator<Producto> iterador = productos.iterator();
			while(iterador.hasNext()){
				Producto producto = iterador.next();
				resultado = resultado + producto.obtenerPrecio();
			}
			return resultado;
		}
	}
}
