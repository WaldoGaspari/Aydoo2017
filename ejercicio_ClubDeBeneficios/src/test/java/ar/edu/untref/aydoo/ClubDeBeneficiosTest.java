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

	@Test
	public void comprobarQueUnClienteTenga2ProductosConDescuento(){

		Producto monitor = new Producto("Monitor Samsung", 5200);
		monitor.aplicarDescuento();
		Producto lampara = new Producto("Lampara de techo", 500);
		Producto sillon = new Producto("Sillon de cuero", 9800);
		sillon.aplicarDescuento();
		Cliente nuevoCliente = new Cliente("Juan", new Tarjeta("Classic"));
		nuevoCliente.agregarProductoComprado(monitor);
		nuevoCliente.agregarProductoComprado(lampara);
		nuevoCliente.agregarProductoComprado(sillon);

		Assert.assertEquals(2, nuevoCliente.obtenerProductosConDescuento().size());
	}

	@Test
	public void enviarReporteAlClienteJuanConProductoYSuPrecio(){

		Producto monitor = new Producto("Monitor Samsung", 5200);
		monitor.aplicarDescuento();
		Producto lampara = new Producto("Lampara de techo", 500);
		Producto sillon = new Producto("Sillon de cuero", 9800);
		sillon.aplicarDescuento();
		Cliente nuevoCliente = new Cliente("Juan", new Tarjeta("Classic"));
		nuevoCliente.agregarProductoComprado(monitor);
		nuevoCliente.agregarProductoComprado(lampara);
		nuevoCliente.agregarProductoComprado(sillon);
		Establecimiento fravega = new Establecimiento("Fravega");
		Establecimiento easy = new Establecimiento("Easy");
		Sucursal s1 = new Sucursal("Sucursal Palermo", fravega);
		Sucursal s2 = new Sucursal("Sucursal San Martin", easy);
		s1.agregarProducto(monitor);
		s2.agregarProducto(lampara);
		s2.agregarProducto(sillon);
		fravega.agregarSucursal(s1);
		easy.agregarSucursal(s2);
		ClubDeBeneficios club = new ClubDeBeneficios();
		club.agregarEstablecimiento(fravega);
		club.agregarEstablecimiento(easy);
		club.suscribirCliente(nuevoCliente);
		club.enviarReporteALosClientes();

		Assert.assertEquals("Monitor Samsung", nuevoCliente.obtenerReporte().get(1));
		Assert.assertEquals(6, nuevoCliente.obtenerReporte().size());
	}

	@Test
	public void enviarReporteALosClientes(){

		Producto heladoXKilo = new Producto("Helado por 1 kilo", 120);
		Producto heladoXDosKilos = new Producto("Helado por 2 kilos", 240);
		heladoXDosKilos.aplicarDescuento();
		Producto cena = new Producto("Cena para 2 personas", 450);
		cena.aplicarDescuento();
		Producto cenaFamiliar = new Producto("Cena para 4 personas", 700);
		Cliente clienteJuan = new Cliente("Juan", new Tarjeta("Premium"));
		clienteJuan.agregarProductoComprado(heladoXDosKilos);
		Cliente clienteCarlos = new Cliente("Carlos", new Tarjeta("Classic"));
		clienteCarlos.agregarProductoComprado(heladoXDosKilos);
		clienteCarlos.agregarProductoComprado(cena);
		Establecimiento heladeria = new Establecimiento("Heladeria A");
		Establecimiento restaurante = new Establecimiento("Restaurante B");
		heladeria.agregarCliente(clienteCarlos);
		heladeria.agregarCliente(clienteJuan);
		restaurante.agregarCliente(clienteCarlos);
		restaurante.agregarCliente(clienteJuan);
		Sucursal s1 = new Sucursal("S1", heladeria);
		Sucursal s2 = new Sucursal("S2", heladeria);
		Sucursal s3 = new Sucursal("S3", restaurante);
		ClubDeBeneficios clubDeAmigos = new ClubDeBeneficios();
		heladeria.agregarSucursal(s1);
		heladeria.agregarSucursal(s2);
		heladeria.agregarProductoALasSucursales(heladoXKilo);
		heladeria.agregarProductoALasSucursales(heladoXDosKilos);
		restaurante.agregarSucursal(s3);
		restaurante.agregarProductoALasSucursales(cena);
		restaurante.agregarProductoALasSucursales(cenaFamiliar);
		clubDeAmigos.agregarEstablecimiento(heladeria);
		clubDeAmigos.agregarEstablecimiento(restaurante);
		clubDeAmigos.enviarReporteALosClientes();

		Assert.assertEquals(6, clienteCarlos.obtenerReporte().size());
		Assert.assertEquals(3, clienteJuan.obtenerReporte().size());
	}	
}
