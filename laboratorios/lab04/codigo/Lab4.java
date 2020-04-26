import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab4 {


	public static void main(String[] args) throws Exception 
		{ 
		    // pass the path to the file as a parameter 
		    File file = 
		      new File("C:\\Users\\Usuario\\Desktop\\Ejemplito.txt"); 
		    Scanner sc = new Scanner(file); 
		  
		    while (sc.hasNextLine()) 
		      System.out.println(sc.nextLine()); 
		  
		} 
	
	    @Override
		public String toString() {
			return "Lab4 []";
		}
		//using guideline from
	//https://stackoverflow.com/questions/3522454/how-to-implement-a-tree-data-structure-in-java
		public class Tree<T> {
	    private Node<T> root;

	    public Tree(T rootData) {
	        root = new Node<T>();
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }

	    public  class Node<T> {
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;
	    }
	    
	    
		}
}
	
	


