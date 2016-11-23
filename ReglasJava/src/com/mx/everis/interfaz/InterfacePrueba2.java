package com.mx.everis.interfaz;

// Aqui se está heredando de otras interfaces, y no extiende de otras clases
public interface InterfacePrueba2 extends InterfacePrueba, InterfacePrueba3/*, clasePrueba*/ {
	
	
	
	
	//Una interfaz puede extender una o más interfaces
	
	String metodoPrueba2();
	// solo se pueden declarar constantes finales y estáticas
	public static final String variable="constante";
	// los métodos de la interfaz no deben ser estáticos
	
	//
//	String static metodoPrueba2();    <--- Mal

}
