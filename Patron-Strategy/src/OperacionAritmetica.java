
public class OperacionAritmetica {

	private IAritmetica estrategia;
   
    public OperacionAritmetica(IAritmetica estrategia) {
        this.estrategia = estrategia;
    }
    
     public int procesar(int a, int b) {
         return estrategia.realizarOperacion(a, b);
    }
}
