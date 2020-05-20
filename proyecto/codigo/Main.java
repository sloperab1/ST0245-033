package intento;
import java.util.Date;
import java.sql.Timestamp;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		Date d= new Date();
		Timestamp ts = new Timestamp(d.getTime());
		long time = d.getTime();
		String matriz[][] = new String[5001][78];
	    String fileIn = "0_test_balanced_5000.csv";
	    String line = null;
	    FileReader fileReader = new FileReader(fileIn);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    int fila=0;
	    while ((line = bufferedReader.readLine()) != null) {
	        String[] temp = line.split(";");
	            for(int columna = 0; columna < matriz[0].length; columna++) {
	                matriz[fila][columna] = temp[columna];
	            }
	        fila++;
	}
	  
	    
	    
	    Arbol a1 = new Arbol();
	    Parametros p1 = new Parametros();
	    
//	    p1.IPNUM(matriz, 72, 50);
//	    p1.IP(matriz, 32, "Estrato 3");
	    
	    a1.arbolini(matriz);
	    p1.IP(matriz, 77, "1");
	    double porcentaje = (59172.0/67482)*100;
	    System.out.println(porcentaje +"%");
	    Date d2 = new Date();
	    long tiempofinal = d2.getTime();
	    long a = tiempofinal-time;
	    System.out.println(time);
	    System.out.println(tiempofinal);
	    System.out.println("Tiempo transcurrido en ms: " + a);
	    
	    double memory = r.totalMemory();
	    memory = memory*(Math.pow(10, -6));
	    System.out.println("Memoria usada en MB: " + memory);
	    
//	   String[][] izquierda1 = p1.IPizqNUM(matriz, 72, 50);
//	   String[][] izq1izq2 = p1.IPizqNUM(izquierda1, 68, 50);
//	   String[][] izq1der2 = p1.IPderNUM(izquierda1, 68, 50);
//	   String[][] izq1der2der3 = p1.IPderNUM(izq1der2, 66, 50);
//	   String[][] izq1der2izq3 = p1.IPizqNUM(izq1der2, 66, 50);
//	   String[][] izq1der2der3izq4 = p1.IPizqNUM(izq1der2der3, 70, 50);
//	   String[][] izq1der2der3der4 = p1.IPderNUM(izq1der2der3, 70, 50);
//	   String[][] derecha1 = p1.IPderNUM(matriz, 72, 50);
//	    String [][] der1der2 =p1.IPderNUM(derecha1, 70, 50);
//	    String [][] der1izq2 =p1.IPizqNUM(derecha1, 70, 50);
//	    String [][] der1izq2der3 =p1.IPderNUM(der1izq2, 65, 50);
//	    String [][] der1izq2izq3 =p1.IPizqNUM(der1izq2, 65, 50);
//	    String [][] der1izq2der3der4 =p1.IPderNUM(der1izq2der3, 66, 50);
//	    String [][] der1izq2der3izq4 =p1.IPizqNUM(der1izq2der3, 66, 50);
//	    String [][] der1der2izq3 =p1.IPizq(der1der2, 32, "Estrato 1");
//	    String [][] der1der2der3 =p1.IPder(der1der2, 32, "Estrato 1");
//      String [][] der1der2der3der4 =p1.IPderNUM(der1der2der3, 71, 50);
//	    String [][] der1der2der3izq4 =p1.IPizqNUM(der1der2der3, 71, 50);
//	    String [][] izqMAT2 = p1.IPizqNUM(derMAT, 66, 80);

	    
	    }
	public static void imprimir(String mat[][]) { 
		for (int i = 0; i < mat.length; i++) { 
        	System.out.println(" ");
			for (int j = 0; j < mat[0].length; j++) { 
                System.out.print(mat[i][j] + "   ");
                } 
		}	
    } 
}
