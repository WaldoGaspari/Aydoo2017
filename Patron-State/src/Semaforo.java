
public class Semaforo {
	
	private EstadoSemaforo estadoDelSemaforo;
    
    public Semaforo() {
         this.estadoDelSemaforo = new EstadoVerde();
    }
    
     public void setEstado( EstadoSemaforo estadoDelSemaforo ) {
         this.estadoDelSemaforo = estadoDelSemaforo;
    }
    
     public void mostrar() {
        this.estadoDelSemaforo.mostrar();
    }
}
