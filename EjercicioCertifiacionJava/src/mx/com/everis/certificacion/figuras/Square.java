package mx.com.everis.certificacion.figuras;

import mx.com.everis.certificacion.interfaces.Shape;

public class Square implements Shape{

	
	public Square(){
		
		System.out.println("Square");
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("Tengo 4 lados, todos del mismo tamaño");
		
	}
	

}
