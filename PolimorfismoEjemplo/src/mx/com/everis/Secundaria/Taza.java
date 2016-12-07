package mx.com.everis.Secundaria;

import mx.com.everis.Principal.Cafe;
import mx.com.everis.Principal.Leche;
import mx.com.everis.Principal.Liquido;

public class Taza {

	public void agregarLiquido(Liquido liquido){
		
		if (liquido instanceof Cafe){
			System.out.println(" es coffee");
			
		} else if (liquido instanceof Leche){
			
			System.out.println(" es leche");
		} else if (liquido instanceof Liquido){
			
			System.out.println(" es liquido");
		}
		
	}
	
	
}
