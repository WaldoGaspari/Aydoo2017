
public class Main {
	
	public static void main(String[] args){
		
        CreadorAbstracto creador = new Creador();
        IArchivo audio = creador.crear(Creador.AUDIO);
        audio.reproducir();
        IArchivo video = creador.crear(Creador.VIDEO);
        video.reproducir();
    }
}
