

public class Taller2 {
	
	public static int gcd(int p, int q){
	int restos = p%q;
	p = q;
	q = restos;
	if(restos == 0) {
		System.out.println(q);
		return p;
	}
	else {
		System.out.println(q + "    " +p);
		return gcd(p,q);
	}
		
	}

	/**
	* @param nums entrada 2 arreglo de enteros positivos, sobre el cual vamos a interar 
	* @param target entrada 3 entero positivo, determina el valor de referencia 
	* El método SumaGrupo tiene como objetivo darnos a conocer si hay 
	* algun subconjunto el cual su suma = target.
	* 
	*
	* @return verdadero si hay un subconjunto el cual su suma = target
	*/
	//Codigo extraido de codingbat como guia para entender el problema
	//https://codingbat.com/prob/p145416
	public static boolean SumaGrupo(int start,int[]nums,int target){
		System.out.println("start" + start + " " + "target" +target );
		if(start >= nums.length) {
			return target == 0;
		}
		else {
			return SumaGrupo(start +1,nums,target - nums[start])|| SumaGrupo(start+1,nums,target);
		}
    }
    
	
	
	/**
	* @param start entrada 1 entero positivo, determina un índice dentro del proceso
	* @param nums entrada 2 arreglo de enteros positivos, sobre el cual vamos a interar 
	* @param target entrada 3 entero positivo, determina el valor de referencia 
	* El método SumaGrupo tiene como objetivo darnos a conocer si hay 
	* algun subconjunto el cual su suma = target.
	* 
	* Este método SumaGrupo es "private" de modo que solo se puede llamar desde el interior de la clase pues
	* el método que lo representa es el SumaGrupo público.
	* Para más detalles sobre modificadores de acceso:
	* @see <a href="http://ayudasprogramacionweb.blogspot.com/2013/02/modificadores-acceso-public-protected-private-java.html"> modificadores </a>
	*
	*
	* @return verdadero si hay un subconjunto el cual su suma = target
	*/
//	private static boolean SumaGrupo1(int start, int[] nums, int target) {
//		System.out.println("start" + start + " " + "target" +target );
//		if(start >= nums.length) {
//			return target == 0;
//		}
//		else {
//			return SumaGrupo1(start +1,nums,target - nums[start])|| SumaGrupo1(start+1,nums,target);
//		}
//    }
	
	
	/**
	* @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
	*
	* El método combinations se define para que solo se tenga que pasar el parametro s y no la cadena 
	* vacía necesaria para el metodo reursivo combinationsAux. Este metodo no se modifica.
	* 
	*/
	
		public void combinations(String prefix, String s) {
			
		}
	
	
	/**
	* @param prefix, se utiliza como una variable auxiliar para guardar datos sobre el proceso.
	* @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
	*
	*
	* El método combinationsAux se encarga de encontrar las posibles combinaciones en la cadena s
	* notese que el método es "private" de modo que solo se puede llamar desde el interior de la clase pues
	* el método que lo representa es combinations.
	* Para más detalles sobre modificadores de acceso:
	* @see <a href="http://ayudasprogramacionweb.blogspot.com/2013/02/modificadores-acceso-public-protected-private-java.html"> modificadores </a>
	*
	*/

	private static void combinationsAux(String prefix, String s) {  
		//...
	}

}