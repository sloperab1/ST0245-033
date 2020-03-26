//package Taller__8;
import java.util.*;



public class Taller8 {
    
    
    public static int polaca  (String string){
        String[] prefixStr = string.split(" "); 
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<prefixStr.length;i++){
            if(prefixStr[i].equals("+")){
                stack.push(stack.pop()+ stack.pop() );
            }
            else if(prefixStr[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(prefixStr[i].equals("-")){
                stack.push( stack.pop()-stack.pop());
            }
            else if(prefixStr[i].equals("/")){
                stack.push(stack.pop()/stack.pop());
            }
            else{
                stack.add(Integer.parseInt(prefixStr[i]));
            }
        }
       return stack.pop();
    }
	
  
    public static Stack<Integer> inversa (Stack<Integer> stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++) 
            temp.get(stack.push(n));
        return temp;
    }

 
    public static void cola(Queue<String> queue){
        while (queue.size() >= 0) {
        	System.out.println("Atendiendo a " + queue.peek());
        }
            
    }
    

}