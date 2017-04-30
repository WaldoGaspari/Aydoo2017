
public class Main {
	
	public static void main(String[] args){
		 
		Fabrica fabrica = new Fabrica();   
	    ConstructorCoche base  = new ConstructorCocheBase();
	    ConstructorCoche medio = new ConstructorCocheMedio();
	    ConstructorCoche full  = new ConstructorCocheFull();
	        
	    fabrica.construir(base);
	    Coche cocheBase = base.obtenerCoche();
	        
	    fabrica.construir(medio);
	    Coche cocheMedio = medio.obtenerCoche();
	        
	    fabrica.construir(full);
	    Coche cocheFull = full.obtenerCoche();
	       
	    mostrarCaracteristicas(cocheBase);
	    mostrarCaracteristicas(cocheMedio);
	    mostrarCaracteristicas(cocheFull);
	}
	    
	public static void mostrarCaracteristicas(Coche coche){
		
	    System.out.println( "Motor: " + coche.obtenerMotor() );
	    System.out.println( "Carrocería: " + coche.obtenerCarroceria() );
	    System.out.println( "Levanta vidrios: " + coche.obtenerLevantaVidrios() );
	    System.out.println( "Aire acondicionado: " + coche.obtenerAireAcondicionado() );
	    System.out.println("===================================");
	}
}
