
public class ConstructorCocheMedio extends ConstructorCoche {

	public void construirMotor() {
		 this.coche.cambiarMotor("Motor de potencia media");
	}

	public void construirCarroceria() {
		this.coche.cambiarCarroceria("Carrocería de protección media");
	}

	public void construirAireAcondicionado() {
		this.coche.cambiarAireAcondicionado(false);
	}

	public void construirLevantaVidrios() {
		 this.coche.cambiarLevantaVidrios(true);
	}

}
