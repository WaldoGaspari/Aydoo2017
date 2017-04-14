package ar.edu.untref.aydoo;
import org.junit.Test;
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
}
