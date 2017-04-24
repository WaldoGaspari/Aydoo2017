package ar.edu.untref.aydoo;

import java.util.Iterator;
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
	
	public void obtenerEstablecimientoConMasBeneficiosOtorgados(){
		int cantidadMayorDeBeneficios = 0;
		Establecimiento establecimientoGanador = this.establecimientos.get(0);
		
		for(int i = 0; i < this.establecimientos.size(); i++){
			if(this.establecimientos.get(i).cantidadTotalDeVentasConTarjeta() > cantidadMayorDeBeneficios){
				cantidadMayorDeBeneficios = this.establecimientos.get(i).cantidadTotalDeVentasConTarjeta();
				establecimientoGanador = this.establecimientos.get(i);
			}
		}
		mandarMailDeFelicitaciones(establecimientoGanador);
	}
	
	private void mandarMailDeFelicitaciones(Establecimiento establecimiento){
		Iterator<Establecimiento> iterador = this.establecimientos.iterator();
		while(iterador.hasNext()){
			Establecimiento establecimiento1 = iterador.next();
			if(establecimiento1.cantidadTotalDeVentasConTarjeta() == establecimiento.cantidadTotalDeVentasConTarjeta()){
				establecimiento1.cambiarMailDeFelicitaciones("¡Felicitaciones!Es el establecimiento con mas beneficios otorgados.");
			}
		}
	}
	
	public void enviarRegaloALaSucursalQueMasAtendio(){
		int mayorCantidadDeVentas = this.establecimientos.get(0).obtenerSucursal(0).obtenerVentasTotales();
		int posicion = 0;
		for(int i = 0; i < this.establecimientos.size(); i++){
			if(this.establecimientos.get(i).obtenerSucursalQueAtendioAMasClientes().obtenerVentasTotales() > mayorCantidadDeVentas){
				mayorCantidadDeVentas = this.establecimientos.get(i).obtenerSucursalQueAtendioAMasClientes().obtenerVentasTotales();
				posicion = i;
			}
		}
		this.establecimientos.get(posicion).obtenerSucursalQueAtendioAMasClientes().recibirRegalo("Felicitaciones al personal de la "
				+ "sucursal por ser los que mas clientes atendieron");
	}
	
	public Establecimiento obtenerEstablecimiento(int posicion){
		return this.establecimientos.get(posicion);
	}

}
