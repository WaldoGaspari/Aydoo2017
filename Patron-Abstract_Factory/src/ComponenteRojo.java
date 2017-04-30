
public class ComponenteRojo implements Componente {
	
	public Boton obtenerBoton() {
        return new BotonRojo();
    }
    
    public Lista obtenerLista() {
        return new ListaRoja();
    }
}
