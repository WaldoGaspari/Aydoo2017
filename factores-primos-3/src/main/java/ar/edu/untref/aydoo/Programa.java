package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Programa {

	public static void main (String [ ] args){

		int numero = Integer.parseInt(args[0]);
		int[] resultado = NumerosPrimos.factorizar(numero);
		String formato = args[1];
		String orden = args[2];
		String salida = args[3];
		File archivo;
		BufferedWriter escritura;

		if(orden.equalsIgnoreCase("--sort=desc")){
			resultado = ordenarEnFormaDescendente(resultado);
		}

		try{
			archivo = new File(salida);
			escritura = new BufferedWriter(new FileWriter(archivo));
			if(formato.equalsIgnoreCase("--format=pretty")){
				for(int i = 0; i < 10 && resultado[i] != 0; i++){
					String valor = String.valueOf(resultado[i]);
					escritura.write(valor + " ");
				}

			} else if(formato.equalsIgnoreCase("--format=quiet")){
				for(int i = 0; i < 10 && resultado[i] != 0; i++){
					String valor = String.valueOf(resultado[i]);
					escritura.write(valor);
					escritura.newLine();
				}

			} else{
				System.out.printf("Formato no aceptado. Las opciones posibles son: pretty o quiet");
			}
			escritura.close();

		}catch(Exception e){
			System.out.printf("No se puede escribir en el archivo");
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
