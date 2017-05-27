package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Establecimiento {

	private String nombre;
	private List<Sucursal> sucursales;
	private List<Cliente> clientes;
	private String mailDeFelicitaciones;

	public Establecimiento(String nombre){
		this.nombre = nombre;
		this.sucursales = new LinkedList<Sucursal>();
		this.clientes = new LinkedList<Cliente>();
		this.mailDeFelicitaciones = "No tiene";
	}

	public void agregarSucursal(Sucursal sucursal){
		this.sucursales.add(sucursal);
	}

	public void agregarCliente(Cliente cliente){
		this.clientes.add(cliente);
	}

	public List<Cliente> obtenerClientes(){
		return this.clientes;
	}

	public String obtenerNombre(){
		return this.nombre;
	}

	public void agregarBeneficioALasSucursales(Beneficio beneficio){
		Iterator<Sucursal> iterador = this.sucursales.iterator();
		while(iterador.hasNext()){
			Sucursal sucursal = iterador.next();
			sucursal.agregarBeneficio(beneficio);
		}
	}

	public void agregarProductoALasSucursales(Producto producto){
		Iterator<Sucursal> iterador = this.sucursales.iterator();
		while(iterador.hasNext()){
			Sucursal sucursal = iterador.next();
			sucursal.agregarProducto(producto);;
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

	public void recibirMailDeFelicitaciones(String mensaje){
		this.mailDeFelicitaciones = mensaje;
	}

	public String obtenerMailDeFelicitaciones(){
		return this.mailDeFelicitaciones;
	}

	public Sucursal obtenerSucursalQueAtendioAMasClientes(){
		Sucursal sucursalGanadora = this.sucursales.get(0);
		for(int i = 0; i <this.sucursales.size(); i++){
			if(this.sucursales.get(i).obtenerVentasTotales() > sucursalGanadora.obtenerVentasTotales()){
				sucursalGanadora = this.sucursales.get(i);
			}
		}
		return sucursalGanadora;
	}

	public Sucursal obtenerSucursal(int posicion){
		return this.sucursales.get(posicion);
	}

	public boolean saberSiUnProductoPerteneceAlEstablecimiento(Producto producto){
		Iterator<Sucursal> iterador = this.sucursales.iterator();
		while(iterador.hasNext()){
			Sucursal sucursal = iterador.next();
			Iterator<Producto> iteradorProducto = sucursal.obtenerProductos().iterator();
			while(iteradorProducto.hasNext()){
				Producto productoS = iteradorProducto.next();
				if(productoS.equals(producto)){
					return true;
				}
			}
		}
		return false;
	}
}
