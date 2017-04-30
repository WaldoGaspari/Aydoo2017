
public abstract class Boton {
	
	private String texto;
    
    public String obtenerTexto() {
        return this.texto;
    }
   
    public void cambiarTexto(String texto) {
        this.texto = texto;
    }
    
    public void dibujar(){
        System.out.println("Dibujando el bot�n...");
    }
    
    public abstract void configurar();

}
