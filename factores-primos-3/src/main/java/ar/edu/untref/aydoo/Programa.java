package ar.edu.untref.aydoo;

public class Programa {
	
	public static void main (String [ ] args){
		
		int numero = Integer.parseInt(args[0]);
		int[] resultado = NumerosPrimos.factor(numero);
		String orden = args[2];
		String formato = args[1];
		
		if(orden.equalsIgnoreCase("--sort=desc")){
			resultado = ordenarEnFormaDescendente(resultado);
			impresionDeLosFactores(numero, resultado, formato);
			
		} else if(orden.equalsIgnoreCase("--sort=asc") || orden.equalsIgnoreCase("--sort= ")){
			impresionDeLosFactores(numero, resultado, formato);
		}
		
	}
	
	private static int[] ordenarEnFormaDescendente(int[] numeros){
		int[] numerosOrdenados = numeros;
		for(int i=0; i<numerosOrdenados.length-1;i++){
			for(int j=i+1; j<numerosOrdenados.length;j++){
				if(numerosOrdenados[i] < numerosOrdenados[j]){
					int auxiliar = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[j];
					numerosOrdenados[j] = auxiliar;	
				}
			}
		}
		return numerosOrdenados;
	}
	
	/**
	private static int[] ordenarEnFormaAscendente(int[] numeros){
		int[] numerosOrdenados = numeros;
		for(int i=0; i<numerosOrdenados.length-1 && numerosOrdenados[i] != 0;i++){
			for(int j=i+1; j<numerosOrdenados.length && numerosOrdenados[i] != 0;j++){
				if(numerosOrdenados[i] > numerosOrdenados[j]){
					int auxiliar = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[j];
					numerosOrdenados[j] = auxiliar;	
				}
			}
		}
		return numerosOrdenados;
	}
	**/
	
	public static void impresionDeLosFactores(int numero, int[] factores, String formato){
		
		if(formato.equalsIgnoreCase("--format=pretty")){
	    	System.out.printf("Factores primos %d: ", numero);
		    for(int i = 0; i < 10 && factores[i] != 0; i++){
		    	System.out.printf("%d ",factores[i]);
		    }
		    
	    } else if(formato.equalsIgnoreCase("--format=quiet")){
	    	System.out.printf("Factores primos %d: \r\n", numero);
		    for(int i = 0; i < 10 && factores[i] != 0; i++){
		    	System.out.printf("%d \r\n",factores[i]);
		    }
		    
	    } else{
	    	System.out.printf("Formato no aceptado. Las opciones posibles son: pretty o quiet");
	    }
	}
}
