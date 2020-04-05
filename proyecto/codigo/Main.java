import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
	
		ArrayList <Persona> studentList = new ArrayList <>();
	    String fileIn = "0_test_balanced_5000.csv";
	    String line = null;

	    // Read all lines in from CSV file and add to studentList
	    FileReader fileReader = new FileReader(fileIn);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);

	    while ((line = bufferedReader.readLine()) != null) {
	        String[] temp = line.split(";");
	        String a= temp[0];
        	String b= temp[1];
        	String c= temp[2];
        	String d= temp[3];
        	String e= temp[4];
        	String f= temp[5];
        	String g= temp[6];
        	String h= temp[7];
        	String i= temp[8];
        	String j= temp[9];
        	String k= temp[10];
        	String l= temp[11];
        	String m= temp[12];
        	String n= temp[13];
        	String o= temp[14];
        	String p= temp[15];
        	String q= temp[16];
        	String r= temp[17];
        	String s= temp[18];
        	String t= temp[19];
        	String u= temp[20];
        	String v= temp[21];
        	String w= temp[22];
        	String x= temp[23];
        	String y= temp[24];
        	String z= temp[25];
        	String a1= temp[26];
        	String b1= temp[27];
        	String c1= temp[28];
        	String d1= temp[29];
        	String e1= temp[30];
        	String f1= temp[31];
        	String g1= temp[32];
        	String h1= temp[33];
        	String i1= temp[34];
        	String j1= temp[35];
        	String k1= temp[36];
        	String l1= temp[37];
        	String m1= temp[38];
        	String n1= temp[39];
        	String o1= temp[40];
        	String p1= temp[41];
        	String q1= temp[42];
        	String r1= temp[43];
        	String s1= temp[44];
        	String t1= temp[45];
        	String u1= temp[46];
        	String v1= temp[47];
        	String w1= temp[48];
        	String x1= temp[49];
        	String y1= temp[50];
        	String z1= temp[51];
        	String a2= temp[52];
        	String b2= temp[53];
        	String c2= temp[54];
            String d2= temp[55];
            String e2= temp[56];
        	String f2= temp[57];
        	String g2= temp[58];
        	String h2= temp[59];
        	String i2= temp[60];
        	String j2= temp[61];
        	String k2= temp[62];
        	String l2= temp[63];
        	String m2= temp[64];
        	String n2= temp[65];
        	String o2= temp[66];
        	String p2= temp[67];
        	String q2= temp[68];
        	String r2= temp[69];
        	String s2= temp[70];
        	String t2= temp[71];
        	String u2= temp[72];
        	String v2= temp[73];
        	String w2= temp[74];
        	String x2= temp[75];
        	String y2= temp[76];
        	String z2= temp[77];
	        studentList.add(new Persona(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1, u1, v1, w1, x1, y1, z1,a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n2, o2, p2, q2, r2, s2, t2, u2, v2, w2, x2, y2, z2));
	    
	   
	}
	    for(int i = 0; i < studentList.size(); i++) {   
	        System.out.println(studentList.get(i));
	    }
	}
}


