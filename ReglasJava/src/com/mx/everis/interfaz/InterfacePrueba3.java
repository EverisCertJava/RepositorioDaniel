package com.mx.everis.interfaz;

// Una Interfaz no puede implementar una clase
public interface InterfacePrueba3 /*implements PruebasPrincipales      <--------  Wrong X__X*/{
	
	
	//Una interfaz puede extender una o más interfaces
	
	String metodoPrueba3();
	// solo se pueden declarar constantes finales y estáticas
	public static final String variable="constante";
	// los métodos de la interfaz no deben ser estáticos
	
	//
//	String static metodoPrueba2();    <--- Mal

}
