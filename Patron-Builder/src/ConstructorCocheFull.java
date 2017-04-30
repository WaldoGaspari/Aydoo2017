
public class ConstructorCocheFull extends ConstructorCoche {

	public void construirMotor() {
		this.coche.cambiarMotor("Motor de potencia alta");
	}

	public void construirCarroceria() {
		this.coche.cambiarCarroceria("Carrocería de alta protección");
	}

	public void construirAireAcondicionado() {
		this.coche.cambiarAireAcondicionado(true);
	}

	public void construirLevantaVidrios() {
		this.coche.cambiarLevantaVidrios(true);
	}

}
