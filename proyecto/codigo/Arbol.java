package intento;

public class Arbol {

	public void arbolini (String[][]matriz) {
		String [] a = new String[matriz[0].length];
		int si=0;
		int no=0;
		for (int i=1;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				a[j]= matriz [i][j];
			}
			if (Arbol(a)==true) {
				si++;
			} else {
				no++;
			}
			
	}
		System.out.println("Tendran exito: " + si + " NO tendran exito: " + no);
	}
	
	public boolean Arbol (String[] persona) {
		double mat = Double.parseDouble(persona[66]);
		double quimica = Double.parseDouble(persona[68]);
		double sociales = Double.parseDouble(persona[70]);
		double lenguage = Double.parseDouble(persona[65]);
		double ing = Double.parseDouble(persona[72]);
		double filo = Double.parseDouble(persona[71]);
		
		if (ing >= 50) {
			if(sociales >= 50) {
				if (iguales(persona[32],"Estrato 1")) {
					if(filo>=50) {
						return true;
					} else {
						return false;
					}
				} else {
					return true;
				}
			} else {
				if (lenguage >=50) {
					if (mat>= 50) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		} else {
			if (quimica >=50) {
				if (mat>=50) {
					if (sociales >=50) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
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