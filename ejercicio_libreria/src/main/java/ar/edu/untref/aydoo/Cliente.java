package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private HashMap<String, List<Producto>> productosPorMes; 
	
	public Cliente(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.productosPorMes = new HashMap<String, List<Producto>>();
	}
	
	public void agregarProductosAlMes(String mes, List<Producto> productos){
		this.productosPorMes.put(mes, productos);
	}
	
	public List<Producto> obtenerListaDeProductos(String mes){
		return this.productosPorMes.get(mes);
	}
}
