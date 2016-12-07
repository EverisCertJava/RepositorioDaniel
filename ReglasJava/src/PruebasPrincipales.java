import  com.mx.everis.claseestatica.ClaseEstatica;

// Importa un solo objeto estático
import  static com.mx.everis.claseestatica.ClaseEstatica.nombre;



public class PruebasPrincipales {

	
	
// Probando variables var args, como parametros de  static main	
	public static void main(String... args) {
	
// 1) Las variables solo pueden definirse usando letras _ ó $ al principio o en cualquier parte dela variable
		int $variable; 
		int _variable;
		int variable10;
		int variable$$$$$$$$$;
		int variable__________1;
		
	//	int 3variable;   incorrecto
		
// 2) No s epueden usar palabras java como un identificador en el nombre de una variable
		
		
//		int case; <--- wrong
		
// reconoce las variables como diferentes		
		String foo;
		String FOO;
		
		
// 3) Solo se puede tener una clase publica por archivo
		
//

// 4  puedes hacer un import static pero no puedes hacer

		
//		metodos son un par entre verbo y sustantivo   getPersona();

		
// Evitar importar dos clases con elementos estaticos que tengan el mismo nombre	
// Usar import static, static import tendrá un error
		
// Al asignar un MAX_VALUE a variables import , ala hora de la importación, el compilador no sabŕa importar entre uno y otro	
// Puedes hacer un static import o las referencias de objetos estaticos
// de Forma estática solo s epueden importar métodos, variables y constantes
		
	ClaseEstatica objeto = new ClaseEstatica();	
	
	
	// uso de referencias a objetos estáticos
	objeto.metodo1();
	objeto.nombre = "nuevo nombre";
	
	
	/*===============================================================================================================*/
	// Todos los métodos de las interfaces son implicitamente publicos y abstractos
	// Los métodos de las interfaces no deben ser estáticos
	
	// Todas las variables  definidads en una interface deben ser publicas, estaticas y finales, las interfaces solo pueden declarar constantes
	//Las inter
	
	/*===============================================================================================================*/
		
	}

}
/*
Wrong


public class ClasePrueba(){
	
	
}*/