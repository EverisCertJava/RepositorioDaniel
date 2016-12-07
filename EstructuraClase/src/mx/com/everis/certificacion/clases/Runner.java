package mx.com.everis.certificacion.clases;

import mx.com.everis.certificacion.interfaces.Athlete;
import mx.com.everis.certificacion.interfaces.AthleteDos;
import mx.com.everis.certificacion.padre.Person;

public class Runner extends Person implements Athlete,AthleteDos{
	
	A a=new A();

	
	
	public Runner(){
		
		super("Dan");
		
		
		System.out.println("Person class"+nombre);
	}
	
	
	Runner(String nombre){
		
		System.out.println("Constructor runner class"+ nombre);
	}
	
	//varargs
	// Es como si fuera un arreglo para aorrar la escritura de corchetes
	public Runner (String... name){
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
	}
	
	
	
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
class A {
	
	public void metodoPrueba(){
		
		
		System.out.println("Soy un método de prueba");
	}
	
}