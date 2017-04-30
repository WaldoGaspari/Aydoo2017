
public class Main {
	
	public static void main(String[] args){
		
        Semaforo semaforo = new Semaforo();
        semaforo.mostrar();
        semaforo.setEstado(new EstadoAmarillo());
        semaforo.mostrar();
        semaforo.setEstado(new EstadoRojo());
        semaforo.mostrar();
    }
}
