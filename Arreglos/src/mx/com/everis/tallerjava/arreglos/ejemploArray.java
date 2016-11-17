package mx.com.everis.tallerjava.arreglos;

import java.util.Scanner;

public class ejemploArray {

	public static void main(String[] args) {
		
		
		
		int extension;
		int suma=0;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Teclea la longitud del arreglo  :");
		extension = entrada.nextInt();
		System.out.println("\n");
		System.out.println("arreglo de tamaño : "+extension);
		System.out.println("Se hará el llenado del arreglo ....");
		int[] array = new int[extension];
		
		for (int i =0;i<array.length;i++){
			System.out.println("==========================================================================");
			System.out.println("Ingresa el número "+(i+1));
			array[i]=entrada.nextInt();	
			suma=suma+array[i];
			System.out.println("El valor  "+array[i]+"   ha sido asignado correctamente a la posición  "+i);
			System.out.println("La sumatoria ascendente de los valores dentro del arreglo es "+suma);
			System.out.println("==========================================================================");		
		}
		suma=0;
		for (int i=array.length-1;i>=0;i--){
				
			System.out.println("==========================================================================");
			suma=suma+array[i];
			System.out.println("La posición actual es "+(array.length-1)+ "  el valor es : "+ array[i]);
			System.out.println("La sumatoria descendente de los valores dentro del arreglo es "+suma);
			System.out.println("==========================================================================");
	}
	}
}
