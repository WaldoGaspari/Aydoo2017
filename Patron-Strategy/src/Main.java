
public class Main {
	

   public static void main(String[] args){
	   
      OperacionAritmetica contexto;
	  contexto = new OperacionAritmetica( new Sumar() );
	  int suma = contexto.procesar(3,4);
	  contexto = new OperacionAritmetica( new Restar() );
	  int resta = contexto.procesar(3,4);
	  contexto = new OperacionAritmetica( new Multiplicar() );
	  int multiplicacion = contexto.procesar(3,4);
	  System.out.println("Suma: " + suma );
	  System.out.println("Resta: " + resta );
	  System.out.println("Multiplicación: " + multiplicacion );
   }
	
}
