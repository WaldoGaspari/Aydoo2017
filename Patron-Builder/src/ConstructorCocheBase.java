
public class ConstructorCocheBase extends ConstructorCoche {

	public void construirMotor() {
		this.coche.cambiarMotor("Motor de potencia m�nima");
	}

	public void construirCarroceria() {
		this.coche.cambiarCarroceria("Carrocer�a de baja protecci�n");
	}

	public void construirAireAcondicionado() {
		this.coche.cambiarAireAcondicionado(false);
	}

	public void construirLevantaVidrios() {
		this.coche.cambiarLevantaVidrios(false);
	}
	
}
