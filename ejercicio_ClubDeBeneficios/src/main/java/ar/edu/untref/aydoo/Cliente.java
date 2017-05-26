package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nombre;
	private Tarjeta tarjeta;
	private List<Producto> productosComprados;
	private String[] reporte;

	public Cliente(String nombre, Tarjeta tarjeta){
		this.nombre = nombre;
		this.tarjeta = tarjeta;
		this.productosComprados = new LinkedList<Producto>();
		this.reporte = new String[30];
	}

	public Tarjeta obtenerTarjeta(){
		return this.tarjeta;
	}

	public void agregarProductoComprado(Producto producto){
		this.productosComprados.add(producto);
	}

	public String[] obtenerReporte(){
		return this.reporte;
	}

}
