
public class Node {
	public Node left,rigth;
    public int data;

    public Node(int data) {
        this.data = data;
        
    }
  
    public void insertar (int value) {
    	if(value<= data) {
    			if(left == null) {
    				left= new Node(value);
    				
    			}
    			else {
    				left.insertar(value);
    			}
    	}
    	else {
    		if(rigth == null) {
    			rigth = new Node(value);
    		}
    		else {
    			rigth.insertar(value);
    		}
    	}
    	}
  
    public boolean buscar(int value) {
    	if(value  == data) {
    		return true;
    	}
    	
    	else if(value < data){
    		if(left == null) {
    			return false;
    		}
    		else {
    			return left.buscar(value);
    		}
    		
    	}
    	else {
    		if(rigth == null) {
    			return false;
    		}
    		else {
    			return rigth.buscar(value);
    		}
    	}
    }
  
    

   @Override
	public String toString() {
		return left +" " +  rigth + " " + data  +" "  ;
	}
	
    
    
    }



