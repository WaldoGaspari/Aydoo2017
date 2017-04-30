
public class Fabrica {
	
	public void construir(ConstructorCoche builder){
		
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirLevantaVidrios();
        builder.construirAireAcondicionado();
    }
}
