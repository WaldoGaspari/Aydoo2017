
public abstract class ConstructorCoche {
	
	protected Coche coche;
    
    public Coche obtenerCoche() {
        return this.coche;
    }
    
     public void crearNuevoCoche() {
        this.coche = new Coche();
    }
    
     public abstract void construirMotor();
     public abstract void construirCarroceria();
     public abstract void construirAireAcondicionado();
     public abstract void construirLevantaVidrios();
}
