package ar.edu.untref.aydoo;

public class NumerosPrimos {
	
	private static int[] numerosPrimos = {2,3,5,7,11,13,17,19,23,29,31,37};
	private static int[] factores = new int[20];
	
	static int[] factor(int numero){
		
		if(numero < 2){
			throw new Error("El numero no puede ser menor a 2.");
		}
		
		int i = 0;
		int j = 0;
	    int factor = numerosPrimos[i];

	    while(numero!=1){
	        	  
	         if(numero%factor==0){
	            	   
	              factores[j] = factor;
	              j++;
	              numero /= factor;
	              
	         }else{
	        	 i++;
	        	 factor = numerosPrimos[i];
	         }
	    }
	    return factores;
	}
}

