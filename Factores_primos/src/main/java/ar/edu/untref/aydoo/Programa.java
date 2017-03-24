package ar.edu.untref.aydoo;
import java.util.Scanner;

public class Programa {
	
	public static void main (String [ ] args){
		
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Escribe un numero para sacar sus factores primos");
	    int numero = entrada.nextInt();
	    int[] resultado = NumerosPrimos.factor(numero);
	    
	    System.out.printf("Factores primos %d: ", numero);
	    for(int i = 0; i < 10 && resultado[i] != 0; i++){
	    	
	    	System.out.printf("%d ",resultado[i]);
	    }
	}
}
