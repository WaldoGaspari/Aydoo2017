import java.util.ArrayList;

public abstract class Lista {
	
	private ArrayList<String> elementos = new ArrayList();
    
    public String obtenerElemento(int posicion) {
        return this.elementos.get(posicion);
    }
    
    public void insertarElemento(String texto) {
        this.elementos.add(texto);
    }
    
    public void dibujar(){
        System.out.println("Dibujando la lista...");
    }
    
    public abstract void configurar();
}
