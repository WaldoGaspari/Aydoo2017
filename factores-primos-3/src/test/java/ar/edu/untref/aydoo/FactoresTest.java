package ar.edu.untref.aydoo;
import org.junit.Test;
import org.junit.Assert;

public class FactoresTest {

	@Test
	public void sacarFactoresDe55DeberiaDar5y11(){

		Assert.assertEquals(5, NumerosPrimos.factorizar(55)[0]);
		Assert.assertEquals(11, NumerosPrimos.factorizar(55)[1]);
	}

	@Test
	public void sacarFactoresDe30DeberiaDar235(){

		Assert.assertEquals(2, NumerosPrimos.factorizar(30)[0]);
		Assert.assertEquals(3, NumerosPrimos.factorizar(30)[1]);
		Assert.assertEquals(5, NumerosPrimos.factorizar(30)[2]);
	}

	@Test (expected = Error.class)
	public void sacarFactoresDe1DeberiaDarError(){

		NumerosPrimos.factorizar(1);
	}

	@Test
	public void sacarFactoresDe360DeberiaDar222335(){

		Assert.assertEquals(2, NumerosPrimos.factorizar(360)[0]);
		Assert.assertEquals(3, NumerosPrimos.factorizar(360)[3]);
		Assert.assertEquals(5, NumerosPrimos.factorizar(360)[5]);
	}

	@Test (expected = Error.class)
	public void sacarFactoresDe3NegativoDeberiaDarError(){

		NumerosPrimos.factorizar(-3);
	}

	@Test
	public void sacarFactoresDe1517DeberiaDar37y41(){

		Assert.assertEquals(37, NumerosPrimos.factorizar(1517)[0]);
		Assert.assertEquals(41, NumerosPrimos.factorizar(1517)[1]);
	}

	@Test
	public void sacarFactoresDe27DeberiaDar333(){

		Assert.assertEquals(3, NumerosPrimos.factorizar(27)[0]);
		Assert.assertEquals(3, NumerosPrimos.factorizar(27)[2]);
	}

	@Test
	public void escribirEnArchivoSalidaElNumero360FormatoPrettyYOrdenAsc(){

		String[] argumentos = {"360", "--format=pretty", "--sort=asc", "Salida.txt"};
		Programa.main(argumentos);
	}

	@Test
	public void escribirEnArchivoSalidaElNumero360FormatoQuietYOrdenAsc(){

		String[] argumentos = {"360", "--format=quiet", "--sort=asc", "Salida.txt"};
		Programa.main(argumentos);
	}

	@Test
	public void escribirEnArchivoSalidaElNumero360FormatoQuietYOrdenDesc(){

		String[] argumentos = {"360", "--format=quiet", "--sort=desc", "Salida.txt"};
		Programa.main(argumentos);
	}

	@Test
	public void escribirEnDireccionRelativaElNumero360FormatoPrettyYOrdenDesc(){

		String[] argumentos = {"360", "--format=pretty", "--sort=desc", "C:/Users/Equipo/Archivo.txt"};
		Programa.main(argumentos);
	}
}
