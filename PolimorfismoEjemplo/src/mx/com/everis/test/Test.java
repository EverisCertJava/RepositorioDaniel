package mx.com.everis.test;

import mx.com.everis.Principal.Cafe;
import mx.com.everis.Principal.Leche;
import mx.com.everis.Principal.Liquido;
import mx.com.everis.Secundaria.Taza;

public class Test {
	
	public static void main(String[] args){
		
		
		// polimorfismo.. se pone en la forma de abajo por que está heredando de la clase padre
		Liquido liquido = new Liquido();
		Liquido cafe = new Cafe();
		Liquido leche= new Leche ();
		
		Taza mitaza = new Taza();
		mitaza.agregarLiquido(liquido);
		mitaza.agregarLiquido(cafe);
		mitaza.agregarLiquido(leche);
		
		
		
	}

}
