
public class Cliente {
	
	public Cliente(Componente estilo){
		
        Boton boton = estilo.obtenerBoton();
        boton.dibujar();
        Lista lista = estilo.obtenerLista();
        lista.dibujar();
    }
}
