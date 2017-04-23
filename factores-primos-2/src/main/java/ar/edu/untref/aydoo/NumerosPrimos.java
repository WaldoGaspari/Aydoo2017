package ar.edu.untref.aydoo;

public class NumerosPrimos {
	
	private static int[] factores;
	
	public static int[] factor(int numero){
		
		factores = new int[20];
		if(numero < 2){
			throw new Error("El numero no puede ser menor a 2.");
		}
		int j = 0;
	    int factor = 2;
	    while(numero!=1){  
	         if(numero%factor==0){
	              factores[j] = factor;
	              j++;
	              numero /= factor;
	              
	         }else{
	        	 factor++;
	         }
	    }
	    return factores;
	}
}

