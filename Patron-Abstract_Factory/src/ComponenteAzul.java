
public class ComponenteAzul implements Componente {
	
	public Boton obtenerBoton() {
        return new BotonAzul();
    }
   
    public Lista obtenerLista() {
        return new ListaAzul();
    }
}
