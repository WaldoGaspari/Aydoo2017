package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;


public class ClubDeBeneficiosTest {
	
	@Test
	public void felicitarALaHeladeriaPorOtorgarMasBeneficios(){
		
		Establecimiento heladeria = new Establecimiento("Heladeria A");
		Establecimiento restaurante = new Establecimiento("Restaurante B");
		Sucursal s1 = new Sucursal("S1", heladeria);
		Sucursal s2 = new Sucursal("S2", heladeria);
		Sucursal s3 = new Sucursal("S3", restaurante);
		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();
		
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		heladeria.agregarSucursal(s1);
		heladeria.agregarSucursal(s2);
		restaurante.agregarSucursal(s3);
		clubDeAmigos.agregarEstablecimiento(heladeria);
		clubDeAmigos.agregarEstablecimiento(restaurante);
		clubDeAmigos.obtenerEstablecimientoConMasBeneficiosOtorgados();
		
		Assert.assertEquals("¡Felicitaciones!Es el establecimiento con mas beneficios otorgados.", clubDeAmigos.obtenerEstablecimiento(0).obtenerMailDeFelicitaciones());
	}
	
	@Test
	public void enviarRegaloALaSucursalS3PorHaberAtendidoAMasClientes(){
		
		Establecimiento heladeria = new Establecimiento("Heladeria A");
		Establecimiento restaurante = new Establecimiento("Restaurante B");
		Sucursal s1 = new Sucursal("S1", heladeria);
		Sucursal s2 = new Sucursal("S2", heladeria);
		Sucursal s3 = new Sucursal("S3", restaurante);
		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();
		
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s1.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		s3.venderProducto(true);
		heladeria.agregarSucursal(s1);
		heladeria.agregarSucursal(s2);
		restaurante.agregarSucursal(s3);
		clubDeAmigos.agregarEstablecimiento(heladeria);
		clubDeAmigos.agregarEstablecimiento(restaurante);
		clubDeAmigos.enviarRegaloALaSucursalQueMasAtendio();
		
		Assert.assertEquals("Felicitaciones al personal de la "
				+ "sucursal por ser los que mas clientes atendieron", clubDeAmigos.obtenerEstablecimiento(0).obtenerSucursal(0).obtenerRegalo());
	}

}
