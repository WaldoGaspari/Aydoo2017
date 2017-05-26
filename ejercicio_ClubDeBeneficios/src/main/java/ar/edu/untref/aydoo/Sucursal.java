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
	private String regalo;

	public Sucursal(String nombre, Establecimiento establecimiento){
		this.nombre = nombre;
		this.establecimiento = establecimiento;
		this.beneficios = new LinkedList<Beneficio>();
		this.productos = new LinkedList<Producto>();
		this.ventasConTarjeta = 0;
		this.ventasSinTarjeta = 0;
		this.regalo = "No tiene";
	}

	public List<Beneficio> obtenerBeneficios(){
		return this.beneficios;
	}

	public void agregarBeneficio(Beneficio beneficio){
		this.beneficios.add(beneficio);
	}

	public void agregarProducto(Producto producto){
		this.productos.add(producto);
	}

	public int obtenerVentasConTarjeta(){
		return this.ventasConTarjeta;
	}

	public int obtenerVentasSinTarjeta(){
		return this.ventasSinTarjeta;
	}

	public int obtenerVentasTotales(){
		return this.ventasConTarjeta + this.ventasSinTarjeta;
	}

	public void venderProductoConTarjeta(){
		this.ventasConTarjeta++;		
	}

	public void venderProductoSinTarjeta(){
		this.ventasSinTarjeta++;
	}

	public void recibirRegalo(String regalo){
		this.regalo = regalo;
	}

	public String obtenerRegalo(){
		return this.regalo;
	}

}
