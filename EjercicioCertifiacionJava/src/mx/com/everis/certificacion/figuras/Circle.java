package mx.com.everis.certificacion.figuras;

import mx.com.everis.certificacion.interfaces.Shape;

public class Circle implements Shape{

	public Circle(){
		
		System.out.println("Circle");
		
	}
	
	/*
	 * Circle(){
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	@Override
	public void draw() {
	
		System.out.println("No tengo lados");
		
	}

}
