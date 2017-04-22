package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Sucursal {
	
	private String nombre;
	private Establecimiento establecimiento;
	private List<Beneficio> beneficios;
	private List<Producto> productos;
	private int ventasConTarjeta;
	private int ventasSinTarjeta;
	
	public Sucursal(String nombre, Establecimiento establecimiento){
		this.nombre = nombre;
		this.establecimiento = establecimiento;
		this.beneficios = new LinkedList<Beneficio>();
		this.productos = new LinkedList<Producto>();
		this.ventasConTarjeta = 0;
		this.ventasSinTarjeta = 0;
	}
	
	public List<Beneficio> obtenerBeneficios(){
		return this.beneficios;
	}
	
	public void agregarProductos(Producto producto){
		this.productos.add(producto);
	}
	
	public void venderSinTarjeta(){
		this.ventasSinTarjeta++;
	}
	
	public void venderConTarjeta(){
		this.ventasConTarjeta++;
	}
	
	public int obtenerVentasConTarjeta(){
		return this.ventasConTarjeta;
	}

}
