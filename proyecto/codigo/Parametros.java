package intento;
public class Parametros {
int cont;
int derecha;
int izquierda;
double derechaexitoSI, derechaexitoNO;
double izquierdaexitoSI, izquierdaexitoNO;
double IGizq;
double IGder;
String atributo;
String exi;
char exito;



public static void main(String[] args) {
	
}

	public void IP (String matriz[][],int parametro, String igual) {
	double abc = encontrarIP(matriz,parametro,igual);
	String para = matriz [0][parametro];
	System.out.println("El numero gini juzgando " + para +" igual a "+igual+" es: "+ abc + " con "+ matriz.length);
	System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
	}
	
	public void IPNUM (String matriz[][],int parametro, double igual) {
		double abc = encontrarIPNUM(matriz,parametro,igual);
		String para = matriz [0][parametro];
		System.out.println("El numero gini juzgando " + para +" mayor a "+igual+" es: "+ abc + " con "+ matriz.length);
		System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
	}
	
	public String[][] IPizq (String matriz[][],int parametro, String igual) {
		double abc = encontrarIP(matriz,parametro,igual);
		String para = matriz [0][parametro];
		System.out.println("El numero gini juzgando " + para +" igual a "+igual+" es: "+ abc);
		System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
		String izq[][] = new String[izquierda][78];
		String der[][] = new String[derecha][78]; 
		int filder = 0, filizq = 0;
		for (int i=0; i<matriz.length; i++) {
			atributo= matriz[i][parametro];
			if(iguales(atributo,igual)) {
				for (int j=0; j<matriz[0].length;j++) {
					der[filder][j]= matriz[i][j];
				}
			filder ++;
			} else {
				for (int j=0; j<matriz[0].length;j++) {
					izq[filizq][j]= matriz[i][j];
				}
			filizq ++;
			}
		}
		return izq;
	}
	
	public String[][] IPizqNUM (String matriz[][],int parametro, double igual) {
		double abc = encontrarIPNUM(matriz,parametro,igual);
		String para = matriz [0][parametro];
		System.out.println("El numero gini juzgando " + para +" mayor a "+igual+" es: "+ abc);
		System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
		String izq[][] = new String[izquierda][78];
		String der[][] = new String[derecha][78]; 
		int filder = 0, filizq = 0;
		for (int i=1; i<matriz.length; i++) {
			atributo= matriz[i][parametro];
			if(igualesNUM(atributo,igual)) {
				for (int j=0; j<matriz[0].length;j++) {
					der[filder][j]= matriz[i][j];
				}
			filder ++;
			} else {
				for (int j=0; j<matriz[0].length;j++) {
					izq[filizq][j]= matriz[i][j];
				}
			filizq ++;
			}
		}
		return izq;
	}
	
	public String[][] IPder (String matriz[][],int parametro, String igual) {
		double abc = encontrarIP(matriz,parametro,igual);
		String para = matriz [0][parametro];
		System.out.println("El numero gini juzgando " + para +" igual a "+igual+" es: "+ abc);
		System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
		String izq[][] = new String[izquierda][78];
		String der[][] = new String[derecha][78]; 
		int filder = 0, filizq = 0;
		for (int i=0; i<matriz.length; i++) {
			atributo= matriz[i][parametro];
			if(iguales(atributo,igual)) {
				for (int j=0; j<matriz[0].length;j++) {
					der[filder][j]= matriz[i][j];
				}
			filder ++;
			} else {
				for (int j=0; j<matriz[0].length;j++) {
					izq[filizq][j]= matriz[i][j];
				}
			filizq ++;
			}
		}
		return der;
	}
	
	public String[][] IPderNUM (String matriz[][],int parametro, double igual) {
		double abc = encontrarIPNUM(matriz,parametro,igual);
		String para = matriz [0][parametro];
		System.out.println("El numero gini juzgando " + para +" mayor a "+ igual +" es: "+ abc);
		System.out.println("Derecha: " + derecha + " Izquierda: " + izquierda);
		String izq[][] = new String[izquierda][78];
		String der[][] = new String[derecha][78]; 
		int filder = 0, filizq = 0;
		for (int i=1; i<matriz.length; i++) {
			atributo= matriz[i][parametro];
			if(igualesNUM(atributo,igual)) {
				for (int j=0; j<matriz[0].length;j++) {
					der[filder][j]= matriz[i][j];
				}
			filder ++;
			} else {
				for (int j=0; j<matriz[0].length;j++) {
					izq[filizq][j]= matriz[i][j];
				}
			filizq ++;
			}
		}
		derecha = 0;
		izquierda = 0;
		return der;
		
	}

	public double encontrarIP (String matriz [][], int parametro, String igual) {
		derecha =0;
    	izquierda=0;
    	derechaexitoSI = 0; 
    	derechaexitoNO =0;
    	izquierdaexitoSI = 0;
    	izquierdaexitoNO = 0;
		for (int i=0; i<matriz.length;i++) {
			atributo= matriz[i][parametro];
			exi = matriz[i][77];
			exito = exi.charAt(0);
			if(iguales(atributo,igual)) {
				derecha++;
				if (exito=='1') {
					derechaexitoSI++;
				} else {
					derechaexitoNO++;
				}
			} else {
				izquierda++;
				if (exito=='1') {
					izquierdaexitoSI++;
				} else {
					izquierdaexitoNO++;
				}
			}
		} 
		IGizq= 1 - Math.pow(izquierdaexitoSI/izquierda, 2) - Math.pow(izquierdaexitoNO/izquierda, 2);
		IGder= 1 - Math.pow(derechaexitoSI/derecha, 2) - Math.pow(derechaexitoNO/derecha, 2);
		double IP= (IGizq*izquierda + IGder*derecha)/(izquierda+derecha);
		return IP;
	}
	
    public double encontrarIPNUM (String matriz [][], int parametro, double igual) {
    	derecha =0;
    	izquierda=0;
    	derechaexitoSI = 0; 
    	derechaexitoNO =0;
    	izquierdaexitoSI = 0;
    	izquierdaexitoNO = 0;
		for (int i=1; i<matriz.length;i++) {
			atributo= matriz[i][parametro];
			exi = matriz[i][77];
			exito = exi.charAt(0);
			if(igualesNUM(atributo,igual)) {
				derecha++;
				if (exito=='1') {
					derechaexitoSI++;
				} else {
					derechaexitoNO++;
				}
			} else {
				izquierda++;
				if (exito=='1') {
					izquierdaexitoSI++;
				} else {
					izquierdaexitoNO++;
				}
			}
		} 
		IGizq= 1 - Math.pow(izquierdaexitoSI/izquierda, 2) - Math.pow(izquierdaexitoNO/izquierda, 2);
		
		IGder= 1 - Math.pow(derechaexitoSI/derecha, 2) - Math.pow(derechaexitoNO/derecha, 2);
		
		double IP= (IGizq*izquierda + IGder*derecha)/(izquierda+derecha);
		return IP;
	}
	
	public static boolean igualesNUM (String atributo, double igual) {
		
		double a = Double.parseDouble(atributo);
		if (a >= igual) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean iguales (String atributo, String igual) {
		int k=0;
		if (atributo.length()==igual.length()) {
			for (int i=0; i<atributo.length();i++) {
				if(atributo.charAt(i)==igual.charAt(i)) {
				k++;	
				} else {
					return false;
				}
			}
		} else {
			return false;
		} 
		if (k==atributo.length()) {
			return true;
		} else {
			return false;
		}
	}
}

	


