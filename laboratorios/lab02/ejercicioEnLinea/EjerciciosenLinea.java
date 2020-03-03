
public class EjerciciosenLinea {
	//Array2
	public int countEvens(int[] nums) {
		  int cuenta=0;
		  for (int i=0; i<nums.length;i++){
		      if (nums[i]%2==0){
		        cuenta++;
		      }
		    }
		    return cuenta;
		  }

		public int bigDiff(int[] nums) {
		  int maximo = nums[0];
		  int minimo = nums[0];
		  for(int i=0;i<nums.length;i++){
		    maximo = Math.max(maximo,nums[i]);
		    minimo = Math.min(minimo,nums[i]);
		  }
		  return maximo-minimo;
		}

		

		public int centeredAverage(int[] nums) {
		  int maximo = nums[0];
		  int minimo = nums[0];
		  int total=0;
		  for(int i=0;i<nums.length;i++){
		    maximo = Math.max(maximo,nums[i]);
		    minimo = Math.min(minimo,nums[i]);
		    total += nums[i];
		  }
		  int average = (total-maximo-minimo)/(nums.length-2);
		  return average;
		}


		public int sum13(int[] nums) {
		  int suma=0;
		  for (int i=0;i<nums.length;i++){
		   if(nums[i]==13){
		      i++;
		    } else {
		      suma += nums[i];
		    }
		  }
		  return suma;
		}



		public int sum67(int[] nums) {
		  int suma=0;
		  boolean secuenta=true;
		  for (int i=0;i<nums.length;i++){
		    if (nums[i]==6){
		      secuenta = false;
		    } 
		    if (secuenta){
		      suma += nums[i];
		    }
		    if (nums[i]==7 && secuenta==false){
		      secuenta = true;
		    }
		  }
		  return suma;
		}
		//Array3
		
		public int maxSpan(int[] nums) 
		{
			int num1 = 0;
			int num2;
			int j;
			for(int i = 0; i < nums.length; i++)
			{
				for(j = nums.length - 1; nums[i] != nums[j]; j--);
				num2 = 1 + j - i;
				if(num2 > num1)
					num1 = num2;
			}
			return num1;
		}

		 
		 public int[] fix34(int[] nums) 
		{
			int j = 1;
			for(int i = 0; i < nums.length - 1; i++)
			{
				if(nums[i] == 3 && nums[i+1] != 4)
				{
					for(; nums[j] != 4; j++);
					nums[j] = nums[i+1];
					nums[i+1] = 4;
				}
			}
			return nums;
		}
		 
		 public int[] fix45(int[] nums)
		{
		  int j = 0;
			for(int i = 0; i < nums.length - 1; i++)
			{
				if(nums[i] == 4 && nums[i+1] != 5)
				{
					for(; !(nums[j] == 5 && (j == 0 || j > 0 && nums[j-1] != 4)); j++);
					nums[j] = nums[i+1];
					nums[i+1] = 5;
				}
			}
			return nums;
		}
		 public int[] squareUp(int n) {
			  int [] a= new  int[n*n];
			  if (n==0){
			    return a;
			  }else {
			  for(int i = n - 1; i < a.length; i += n) {
			        for(int j = i; j >= i-i/ n; j--)
			            a[j] = i - j + 1;
			    }
			  }
			  
			  return a;
			} 
		


		 public boolean linearIn(int[] outer, int[] inner)
		{
			boolean esta;
		  for(int a = 0, b = 0; a < inner.length; a++)
		  {
		  	esta = true;
		  	for(; b < outer.length && esta; b++)
		  	{
		  		if(inner[a] == outer[b])
		  			esta = false;
		  	}
		  	if(esta)
		  		return false;
		  }
		  return true;
		}

}
		
