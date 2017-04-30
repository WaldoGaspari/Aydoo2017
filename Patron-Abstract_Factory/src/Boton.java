
public abstract class Boton {
	
	private String texto;
    
    public String obtenerTexto() {
        return this.texto;
    }
   
    public void cambiarTexto(String texto) {
        this.texto = texto;
    }
    
    public void dibujar(){
        System.out.println("Dibujando el botón...");
    }
    
    public abstract void configurar();

}
