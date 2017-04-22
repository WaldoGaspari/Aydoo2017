package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Establecimiento {
	
	private String nombre;
	private List<Sucursal> sucursales;
	private String mailDeFelicitaciones;
	
	public Establecimiento(String nombre){
		this.nombre = nombre;
		this.sucursales = new LinkedList<Sucursal>();
		this.mailDeFelicitaciones = "No tiene";
	}
	
	public void agregarSucursal(Sucursal sucursal){
		this.sucursales.add(sucursal);
	}
	
	public void agregarBeneficio(Beneficio beneficio){
		Iterator<Sucursal> iterador = this.sucursales.iterator();
		while(iterador.hasNext()){
			Sucursal sucursal = iterador.next();
			sucursal.obtenerBeneficios().add(beneficio);
		}
	}
	
	public int cantidadTotalDeVentasConTarjeta(){
		int resultado = 0;
		Iterator<Sucursal> iterador = this.sucursales.iterator();
		while(iterador.hasNext()){
			Sucursal sucursal = iterador.next();
			resultado = resultado + sucursal.obtenerVentasConTarjeta();
		}
		return resultado;
	}
	
	public void cambiarMailDeFelicitaciones(String mensaje){
		this.mailDeFelicitaciones = mensaje;
	}
	
	public String obtenerMailDeFelicitaciones(){
		return this.mailDeFelicitaciones;
	}

}
