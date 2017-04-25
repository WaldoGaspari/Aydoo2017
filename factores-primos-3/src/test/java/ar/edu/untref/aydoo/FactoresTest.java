package ar.edu.untref.aydoo;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;


public class FactoresTest {
	
	@Test
    public void sacarFactoresDe55DeberiaDar5y11(){
		
        Assert.assertEquals(5, NumerosPrimos.factor(55)[0]);
        Assert.assertEquals(11, NumerosPrimos.factor(55)[1]);
    }
	
	@Test
    public void sacarFactoresDe30DeberiaDar235(){
		
        Assert.assertEquals(2, NumerosPrimos.factor(30)[0]);
        Assert.assertEquals(3, NumerosPrimos.factor(30)[1]);
        Assert.assertEquals(5, NumerosPrimos.factor(30)[2]);
    }
	
	@Test (expected = Error.class)
    public void sacarFactoresDe1DeberiaDarError(){
		
        NumerosPrimos.factor(1);
    }
	
	@Test
	public void sacarFactoresDe360DeberiaDar222335(){
		
		Assert.assertEquals(2, NumerosPrimos.factor(360)[0]);
		Assert.assertEquals(3, NumerosPrimos.factor(360)[3]);
		Assert.assertEquals(5, NumerosPrimos.factor(360)[5]);
	}
	
	@Test (expected = Error.class)
    public void sacarFactoresDe3NegativoDeberiaDarError(){
		
        NumerosPrimos.factor(-3);
    }
	
	@Test
	public void sacarFactoresDe1517DeberiaDar37y41(){
		
		Assert.assertEquals(37, NumerosPrimos.factor(1517)[0]);
		Assert.assertEquals(41, NumerosPrimos.factor(1517)[1]);
	}
	
	@Test
	public void sacarFactoresDe27DeberiaDar333(){
		
		Assert.assertEquals(3, NumerosPrimos.factor(27)[0]);
		Assert.assertEquals(3, NumerosPrimos.factor(27)[2]);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero27FormatoPretty(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 27: 3 3 3 ";
	    String[] argumentos = {"27", "--format=pretty", "--sort= "};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero360FormatoQuiet(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 360: \r\n2 \r\n2 \r\n2 \r\n3 \r\n3 \r\n5 \r\n";
	    String[] argumentos = {"360", "--format=quiet", "--sort= "};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero27FormatoVertical(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Formato no aceptado. Las opciones posibles son: pretty o quiet";
	    String[] argumentos = {"27", "--format=vertical", "--sort= "};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero360FormatoQuietYOrdenAsc(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 360: \r\n2 \r\n2 \r\n2 \r\n3 \r\n3 \r\n5 \r\n";
	    String[] argumentos = {"360", "--format=quiet", "--sort=asc"};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero360FormatoPrettyYOrdenAsc(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 360: 2 2 2 3 3 5 ";
	    String[] argumentos = {"360", "--format=pretty", "--sort=asc"};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero360FormatoPrettyYOrdenDesc(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 360: 5 3 3 2 2 2 ";
	    String[] argumentos = {"360", "--format=pretty", "--sort=desc"};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
	@Test
	public void probarSalidaDelMainConElNumero360FormatoQuietYOrdenDesc(){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    String esperado = "Factores primos 360: \r\n5 \r\n3 \r\n3 \r\n2 \r\n2 \r\n2 \r\n";
	    String[] argumentos = {"360", "--format=quiet", "--sort=desc"};

	    Programa.main(argumentos);
	    String salida = new String(baos.toByteArray());

	    Assert.assertEquals(esperado, salida);
	}
	
}
