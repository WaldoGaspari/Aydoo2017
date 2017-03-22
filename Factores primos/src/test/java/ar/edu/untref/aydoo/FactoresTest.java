package ar.edu.untref.aydoo;
import org.junit.Test;
import org.junit.Assert;


public class FactoresTest {
	
	@Test
    public void primeraPrueba(){
		
        int[] factores = {5,11};
        Assert.assertEquals(factores[0], NumerosPrimos.factor(55)[0]);
        Assert.assertEquals(factores[1], NumerosPrimos.factor(55)[1]);
    }
	
	@Test
    public void segundaPrueba(){
		
        int[] factores = {2,3,5};
        Assert.assertEquals(factores[0], NumerosPrimos.factor(30)[0]);
        Assert.assertEquals(factores[1], NumerosPrimos.factor(30)[1]);
        Assert.assertEquals(factores[2], NumerosPrimos.factor(30)[2]);
    }
	
	@Test (expected = Error.class)
    public void pruebaConError(){
		
        NumerosPrimos.factor(1);
    }

}
