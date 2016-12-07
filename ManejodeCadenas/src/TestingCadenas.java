
public class TestingCadenas {

	public static void main(String[] args){
		
		String valor1="Daniel";
		String valor2= new String("Daniel");
		
		// No comparará de forma correcta, por que el valor 2, al ser creado a partir de un new, 
		//cambiará la dirección de memoria y al momento de compararlos habrá un diferencia entre las direcciones dando como negativa la comparación
		if (valor1== valor2){
			
			System.out.println("Igual");
		} else {
			System.out.println("No es igual");
		}
		
		
	
	
	
	
	if (valor1.equals(valor2)){
		
		System.out.println("Igual");
	} else {
		
	}
	
	System.out.println("No es igual");
}

	
}
