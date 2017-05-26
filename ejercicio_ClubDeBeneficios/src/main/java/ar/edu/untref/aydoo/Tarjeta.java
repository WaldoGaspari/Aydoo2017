package ar.edu.untref.aydoo;

public class Tarjeta {

	private String tipo;

	public Tarjeta(String tipo){
		if(tipo.equals("Classic") || tipo.equals("Premium")){
			this.tipo = tipo;

		} else {
			throw new Error("Tipo de tarjeta incorrecta");
		}
	}

	public String obtenerTipo(){
		return this.tipo;
	}	

}
