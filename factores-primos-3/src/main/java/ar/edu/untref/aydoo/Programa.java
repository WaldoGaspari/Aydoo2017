package ar.edu.untref.aydoo;

public class Programa {
	
	public static void main (String [ ] args){
	
		int numero = Integer.parseInt(args[0]);
		int[] resultado = NumerosPrimos.factorizar(numero);
		String formato = args[1];
		String orden = args[2];
		imprimirFactores(resultado, formato, orden);
	}
	
	private static void imprimirFactores(int[] factores, String formato, String orden){
		
		if(orden.equalsIgnoreCase("--sort=desc")){
			factores = ordenarEnFormaDescendente(factores);
		}
		
		if(formato.equalsIgnoreCase("--format=pretty")){
		    for(int i = 0; i < 10 && factores[i] != 0; i++){
		    	System.out.printf("%d ",factores[i]);
		    }
		    
	    } else if(formato.equalsIgnoreCase("--format=quiet")){
		    for(int i = 0; i < 10 && factores[i] != 0; i++){
		    	System.out.printf("%d \r\n",factores[i]);
		    }
		    
	    } else{
	    	System.out.printf("Formato no aceptado. Las opciones posibles son: pretty o quiet");
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
}
