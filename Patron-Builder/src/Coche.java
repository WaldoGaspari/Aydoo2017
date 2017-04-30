
public class Coche {
	
	private String motor = " ";
    private String carroceria = " ";
    private Boolean levantaVidrios = false;
    private Boolean aireAcondicionado = false;
    
    public Coche() {
    	
    }
    
    public String obtenerMotor() {
        return this.motor;
    }
    
    public void cambiarMotor(String motor) {
        this.motor = motor;
    }
    
    public String obtenerCarroceria() {
        return this.carroceria;
    }
    
    public void cambiarCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    
    public Boolean obtenerLevantaVidrios() {
        return levantaVidrios;
    }
    
    public void cambiarLevantaVidrios(Boolean levantaVidrios) {
        this.levantaVidrios = levantaVidrios;
    }
   
    public Boolean obtenerAireAcondicionado() {
        return aireAcondicionado;
    }
    
    public void cambiarAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
