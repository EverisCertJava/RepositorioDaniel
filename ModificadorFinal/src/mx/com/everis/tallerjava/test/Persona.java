package mx.com.everis.tallerjava.test;

public class Persona {

	final String nombre;
	Persona(){
		
		nombre="chidoman";
		
		
	}
	
	final void getNombre(String nombre){
		
	nombre=nombre;
		// this hace referencia al momento de la instancia
		System.out.println("nombre : "+ nombre);
	}
	
	
	
	
}

