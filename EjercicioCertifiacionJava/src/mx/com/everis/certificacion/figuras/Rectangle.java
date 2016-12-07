package mx.com.everis.certificacion.figuras;

import mx.com.everis.certificacion.interfaces.Shape;

public class Rectangle implements Shape{

	public Rectangle(){
		
		System.out.println("Rectangle");
		//draw() <-- si se manda llamar el constructor
	}
	
	@Override
	public void draw() {
		
		System.out.println("Tengo 4 lados, dos mas grandes que los otros dos");
	}

}
