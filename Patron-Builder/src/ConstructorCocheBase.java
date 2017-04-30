
public class ConstructorCocheBase extends ConstructorCoche {

	public void construirMotor() {
		this.coche.cambiarMotor("Motor de potencia mínima");
	}

	public void construirCarroceria() {
		this.coche.cambiarCarroceria("Carrocería de baja protección");
	}

	public void construirAireAcondicionado() {
		this.coche.cambiarAireAcondicionado(false);
	}

	public void construirLevantaVidrios() {
		this.coche.cambiarLevantaVidrios(false);
	}
	
}
