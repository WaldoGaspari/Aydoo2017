package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nombre;
	private Tarjeta tarjeta;
	private List<Producto> productosComprados;
	private List<String> reporte;

	public Cliente(String nombre, Tarjeta tarjeta){
		this.nombre = nombre;
		this.tarjeta = tarjeta;
		this.productosComprados = new LinkedList<Producto>();
		this.reporte = new LinkedList<String>();
	}

	public Tarjeta obtenerTarjeta(){
		return this.tarjeta;
	}

	public void agregarProductoComprado(Producto producto){
		this.productosComprados.add(producto);
	}

	public List<String> obtenerReporte(){
		return this.reporte;
	}

	public List<Producto> obtenerProductosConDescuento(){
		List<Producto> productosConDescuento = new LinkedList<Producto>();
		Iterator<Producto> iterador = this.productosComprados.iterator();
		while(iterador.hasNext()){
			Producto producto = iterador.next();
			if(producto.saberSiHayDescuento()){
				productosConDescuento.add(producto);
			}
		}
		return productosConDescuento;
	}
}
