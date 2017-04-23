package ar.edu.untref.aydoo;
import java.util.Scanner;

public class Programa {
	
	public static void main (String [ ] args){
		
		int numero = Integer.parseInt(args[0]);
		int[] resultado = NumerosPrimos.factor(numero);
		String formato = args[1];
		if(formato.equalsIgnoreCase("pretty")){
	    	System.out.printf("Factores primos %d: ", numero);
		    for(int i = 0; i < 10 && resultado[i] != 0; i++){
		    	System.out.printf("%d ",resultado[i]);
		    }
		    
	    } else if(formato.equalsIgnoreCase("--format=quiet")){
	    	resultado = ordenar(resultado);
	    	System.out.printf("Factores primos %d: \r\n", numero);
		    for(int i = 0; i < 10 && resultado[i] != 0; i++){
		    	System.out.printf("%d \r\n",resultado[i]);
		    }
		    
	    } else{
	    	System.out.printf("Formato no aceptado. Las opciones posibles son: pretty o quiet");
	    }
	}
	
	private static int[] ordenar(int[] numeros){
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
