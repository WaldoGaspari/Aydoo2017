
public class Creador extends CreadorAbstracto {

	public IArchivo crear(int tipo) {
		
		IArchivo objeto;
        switch(tipo){
        
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
	}
}
