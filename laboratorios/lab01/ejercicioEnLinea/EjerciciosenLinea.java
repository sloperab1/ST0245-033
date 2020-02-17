
public class EjerciciosenLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Recursion 1
	public int factorial(int n) {
		  if(n == 0){
		    return 1;
		  }
		  else{
		    return n * factorial(n-1);
		  }
		}
		public int bunnyEars(int bunnies) {
		  if(bunnies == 0){
		    return 0;
		  }
		  else{
		    return 2 + bunnyEars(bunnies-1);
		  }
		}
		public int fibonacci(int n) {
		  if(n <= 1){
		    return n;
		  }
		  else{
		    return fibonacci(n-1) + fibonacci(n-2);
		  }
		}
		public int bunnyEars2(int bunnies) {
		  if(bunnies == 0){
		    return 0;
		  }
		  else{
		    
		  }
		  if(bunnies%2 == 0){
		    return 3 + bunnyEars2(bunnies-1);
		  }
		  else{
		    return 2 + bunnyEars2(bunnies-1);
		  }
		}
		public int triangle(int rows) {
		  if(rows == 0){
		    return 0;
		  }
		  else{
		    return rows + triangle(rows-1);
		  }

		}
		public int sumDigits(int n) {
		  if(n == 0){
		    return 0;
		  }
		  else{
		  return n%10 + sumDigits(n/10);  
		  }
		  
		}
		public int count7(int n) {
		  if( n == 0){
		    return 0;
		  }
		  
		  if(n%10 == 7){
		    return 1 + count7(n/10);
		  }
		  else {
		    return count7(n/10);
		  }
		}
		public int count8(int n) {
		  if(n== 0){
		    return 0;
		  }
		  
		  if(n%10 == 8){
		    if(n%10 == 8 && (n/10)%10 ==8){
		    return 2 + count8(n/10);
		    }
		    else {
		      return 1 +count8(n/10);
		    }
		    
		  }
		  else{
		    return count8(n/10);
		  }
		  
		}
		public int powerN(int base, int n) {
		  if( n == 1){
		    return base;
		  }
		  else{
		    return base * powerN(base,n-1);
		  }
		}
		public int countX(String str) {
		  if(str.length()== 0){
		    return 0;
		  }
		  if(str.charAt(0) == 'x'){
		    return 1 + countX(str.substring(1));
		  }
		  else{
		    return countX(str.substring(1));
		  }
		}
		public int countHi(String str) {
		  if(str.length() < 2){
		    return 0;
		  }
		  else{
		    
		  }
		  if(str.charAt(0) == 'h' && str.charAt(1) == 'i')
		  {
		    return 1 + countHi(str.substring(2));
		  }
		  else {
		    return countHi(str.substring(1));
		  }
		}
		
		//Recursion 2
		public boolean groupSum6(int start, int[] nums, int target) {
		    if(start >= nums.length)
		        return target == 0;        
		    if(nums[start] == 6) {
		        return groupSum6(start+1, nums, target - 6);
		    }
		    if(groupSum6(start+1, nums, target)) {
		        return true; 
		    }
		    if(groupSum6(start+1, nums, target - nums[start])) {
		        return true;
		    }                                      
		    return false;
		}
		public boolean groupNoAdj(int start, int[] nums, int target) {
		    if(start >= nums.length) {
		        return target == 0;
		    }
		    if(groupNoAdj(start+2, nums, target - nums[start])) {
		        return true;
		    }   
		    if(groupNoAdj(start+1, nums, target)) 
		    {
		        return true;
		    }             
		    
		    return false;
		}
		public boolean groupSum5(int start, int[] nums, int target) {
			  if(start >= nums.length){
			        return target == 0;
			  }
			 if(nums[start] % 5 == 0) {
			        if(start <= nums.length - 2 && nums[start+1] == 1)
			            return groupSum5(start+2, nums, target - nums[start]);
			                            
			        return groupSum5(start+1, nums, target - nums[start]);
			    }
			 if(groupSum5(start+1, nums, target - nums[start])){
			        return true;
			}
			  if(groupSum5(start+1, nums, target)){
			        return true;
			  }
			    return false;
			 
			}
		public boolean groupSumClump(int start, int[] nums, int target) {
		    if(start >= nums.length)
		        return target == 0;
		          
		    int i = start;
		    int sum = 0;
		    
		    while(i < nums.length && nums[start] == nums[i]) {
		        sum += nums[i];
		        i++;
		    }
		                              
		    if(groupSumClump(i, nums, target - sum))
		        return true;
		                                        
		    if(groupSumClump(i, nums, target))
		        return true;
		                                                  
		    return false;
		}
		
		




}
