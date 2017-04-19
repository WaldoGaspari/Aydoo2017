package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class ClubDeBeneficios {

	private List<Cliente> clientes;
	private List<Establecimiento> establecimientos;
	
	public ClubDeBeneficios(){
		this.clientes = new LinkedList<Cliente>();
		this.establecimientos = new LinkedList<Establecimiento>();
	}
	
	public void suscribirCliente(String nombre, Tarjeta tarjeta){
		
		this.clientes.add(new Cliente(nombre, tarjeta));
	}
	
	public void agregarEstablecimiento(Establecimiento establecimiento){
		this.establecimientos.add(establecimiento);
	}

}
