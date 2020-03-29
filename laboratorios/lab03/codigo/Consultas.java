import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Consultas extends Usuario {

   
    public void c1(){
        LinkedList<Dato> ld;
        LinkedList<Dato> ld2;
        LinkedList<Dato> ld3;

        MarcoDeDatos ldd = new MarcoDeDatos();
        MarcoDeDatos ldd2 = new MarcoDeDatos();
        MarcoDeDatos ldd3 = new MarcoDeDatos();
        Scanner sc = new Scanner(System.in);

        String mat;
        String sem;
        String nombre = "";

        System.out.println("Escriba la materia");
        mat = sc.nextLine();

        System.out.println("Indique el semestre");  
        sem = sc.nextLine();

        ld = ldd.leerDatos("NOTAS ST0242.csv");

        
        for(Dato dato: ld){
        	if(mat == dato.materia && sem == dato.semestre) {
        		System.out.println("Nombre " + dato.nombre_+ "nota "+ dato.definitiva);
        	}
           
        }

        ld2 = ldd2.leerDatos("NOTAS ST0245.csv");
        for(Dato dato: ld2){
        	if(mat == dato.materia && sem == dato.semestre) {
        		System.out.println("Nombre " + dato.nombre_+ "nota "+ dato.definitiva);
        	}
        }

        ld3 = ldd3.leerDatos("NOTAS ST0247.csv");
        for(Dato dato: ld3){
        	if(mat == dato.materia && sem == dato.semestre) {
        		System.out.println("Nombre " + dato.nombre_+ "nota "+ dato.definitiva);
        	}
        }
    }

    public void c2(){
        LinkedList<Dato> ld;
        LinkedList<Dato> ld2;
        LinkedList<Dato> ld3;

        MarcoDeDatos ldd = new MarcoDeDatos();
        MarcoDeDatos ldd2 = new MarcoDeDatos();
        MarcoDeDatos ldd3 = new MarcoDeDatos();
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Escriba el nombre del estudiante");
        nombre = sc.nextLine();
        
        String semestre;

        System.out.println("Escriba el semestre");
        semestre = sc.nextLine();

        ld = ldd.leerDatos("NOTAS ST0242.csv");
        for(Dato dato: ld){
            if(nombre == dato.nombre_&&  semestre == dato.semestre) {
            	System.out.println("Materia " + dato.materia + "Nota " + dato.definitiva);
            }
            

        }

        ld2 = ldd2.leerDatos("NOTAS ST0245.csv");
        for(Dato dato2: ld2){
        	if(nombre == dato2.nombre_&& semestre == dato2.semestre ) {
        		System.out.println("Materia " + dato2.materia + "Nota " + dato2.definitiva);
            }
        	
        }

        ld3 = ldd3.leerDatos("NOTAS ST0247.csv");
        for(Dato dato3: ld3){
        	if(nombre == dato3.nombre_&& semestre == dato3.semestre ) {
        		System.out.println("Materia " + dato3.materia + "Nota " + dato3.definitiva);
            }
	
        }
    }
}