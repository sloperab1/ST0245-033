public class Taller5 {
	public static void main(String[] args) {
		
		for (int i=50000; i<=100000; i+= 1000) {
			int[] ca = new int[i];
			long a = System.currentTimeMillis();
			insertionSort(ca);
			long b = System.currentTimeMillis();
			System.out.println((b-a) );
		}
}



    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     */
    public static int suma (int[]array){
	int sum=0;
	for(int i=0;i<array.length;i++){
	    sum+=array[i];
	}
        return sum;
    }


    /**
     * @param num es el numero el cual se utiliza para ser multiplicado.
     * El método mul tiene la intención de hacer la multiplicación
     * de 1 a n por el numero mul
     * mediante una funcion cíclica (while/for/...)
     *
     */
    public static void mul (int num){
	for(int i=1;i<=10;i++){
	    System.out.println(num+" x "+i+" = "+(num*i));
	}
    }


    /**
     * @param array es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     *
     */
    public static int[] insertionSort (int[] array){
    	int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
  }