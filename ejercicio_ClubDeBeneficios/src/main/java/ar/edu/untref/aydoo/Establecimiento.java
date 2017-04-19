package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Establecimiento {
	
	private String nombre;
	private List<Sucursal> sucursales;
	
	public Establecimiento(String nombre){
		this.nombre = nombre;
		this.sucursales = new LinkedList<Sucursal>();
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

}
