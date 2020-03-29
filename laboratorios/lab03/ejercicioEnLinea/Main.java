import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] abc) throws IOException {
		String s;
		System.out.println("escriba la palabra: ");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
			LinkedList<Character> texto=new LinkedList<>();
			int pointerLocation=0;
			
			for (char c : s.toCharArray()) {
				if (c=='[') pointerLocation=0;
				else if (c==']') pointerLocation=texto.size();
				else texto.add(pointerLocation++,c);
			}
			
			StringBuilder sa = new StringBuilder();
			for(char c : texto) {
				sa.append(c);
			}
			System.out.println(sa);
		
	}
}
