package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClubDeBeneficiosTest {

	@Test
	public void verificarQueElClienteTengaUnaTarjeta(){

		Tarjeta tarjetaDeJuan = new Tarjeta("Classic");
		Cliente nuevoCliente = new Cliente("Juan", tarjetaDeJuan );

		Assert.assertEquals("Classic", nuevoCliente.obtenerTarjeta().obtenerTipo());
	}

	@Test (expected = Error.class)
	public void verificarQueElClienteTengaUnaTarjetaCorrecta(){

		Tarjeta tarjetaDePedro = new Tarjeta("Platinum");
		Cliente nuevoCliente = new Cliente("Pedro", tarjetaDePedro );

		Assert.assertEquals("Platinum", nuevoCliente.obtenerTarjeta().obtenerTipo());
	}

	@Test
	public void aplicarUnBeneficioDeDescuentoDel20AUnProducto(){

		Beneficio descuento =new Beneficio(20);
		Producto heladera = new Producto("Heladera", 9000);

		Assert.assertEquals(7200, descuento.sacarPrecioConDescuento(heladera.obtenerPrecio()), 0.0);
	}

	@Test (expected = Error.class)
	public void aplicarUnBeneficioDeDescuentoDel3AUnProducto(){

		Beneficio descuento =new Beneficio(3);
		Producto mochila = new Producto("Mochila", 9000);

		Assert.assertEquals(7200, descuento.sacarPrecioConDescuento(mochila.obtenerPrecio()), 0.0);
	}

	@Test
	public void felicitarALaHeladeriaPorOtorgarMasBeneficios(){

		Establecimiento heladeria = new Establecimiento("Heladeria A");
		Establecimiento restaurante = new Establecimiento("Restaurante B");
		Sucursal s1 = new Sucursal("S1", heladeria);
		Sucursal s2 = new Sucursal("S2", heladeria);
		Sucursal s3 = new Sucursal("S3", restaurante);
		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();

		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		heladeria.agregarSucursal(s1);
		heladeria.agregarSucursal(s2);
		restaurante.agregarSucursal(s3);
		clubDeAmigos.agregarEstablecimiento(heladeria);
		clubDeAmigos.agregarEstablecimiento(restaurante);
		clubDeAmigos.obtenerEstablecimientoConMasBeneficiosOtorgados();

		Assert.assertEquals("¡Felicitaciones! Eres el establecimiento con mas beneficios otorgados.", clubDeAmigos.obtenerEstablecimiento(0).obtenerMailDeFelicitaciones());
	}

	@Test
	public void enviarRegaloALaSucursalS3PorHaberAtendidoAMasClientes(){

		Establecimiento heladeria = new Establecimiento("Heladeria A");
		Establecimiento restaurante = new Establecimiento("Restaurante B");
		Sucursal s1 = new Sucursal("S1", heladeria);
		Sucursal s2 = new Sucursal("S2", heladeria);
		Sucursal s3 = new Sucursal("S3", restaurante);
		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();

		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s1.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		s3.venderProductoConTarjeta();
		heladeria.agregarSucursal(s1);
		heladeria.agregarSucursal(s2);
		restaurante.agregarSucursal(s3);
		clubDeAmigos.agregarEstablecimiento(heladeria);
		clubDeAmigos.agregarEstablecimiento(restaurante);
		clubDeAmigos.enviarRegaloALaSucursalQueMasAtendio();

		Assert.assertEquals("Felicitaciones al personal de la "
				+ "sucursal por ser los que mas clientes atendieron", clubDeAmigos.obtenerEstablecimiento(0).obtenerSucursal(0).obtenerRegalo());
	}

	/**
	@Test
	public void enviarReporteDeAhorrosALosClientesEnElMesDeEnero(){

		Cliente clienteCarlos = new Cliente("Carlos", new Tarjeta("Classic"));
		Cliente clienteJuan = new Cliente("Juan", new Tarjeta("Premium"));
		Cliente clienteMaria = new Cliente("Maria", new Tarjeta("Classic"));

		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();
		clubDeAmigos.suscribirCliente(clienteCarlos);
		clubDeAmigos.suscribirCliente(clienteJuan);
		clubDeAmigos.suscribirCliente(clienteMaria);
	}
	 **/

}
