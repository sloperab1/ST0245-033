public class Taller7 {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int array[];

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva par�metros en este caso.
     */
    public Taller7() {
	array = new int[DEFAULT_CAPACITY];
	size = 0;
    }


    /**
     * Tiene la intenci�n de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return size;
    }

    /**
     * @param e el elemento a guardar
     * Agrega un elemento e a la �ltima posici�n de la lista
     *
     */
    public void add(int e) {
        if (size == array.length)
            extend();  
        array[size] = e;
       size++;
     }

    /**
     * @param i es un �ncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posici�n i de la lista.
     *
     */
    public int get(int i) throws Exception {
    if (i >= size || i < 0) // C1 es O(1)
        throw new Exception("Index out of bounds exception index = "+i); // C2 es O(1)
      else
       return array[i];
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posici�n index de la lista
     *
     */
    public void add (int index, int e) throws  Exception {
        if (index < 0) // C1 es O(1)
           throw new Exception("Index out of bounds exception index = "+index);
        else
        array[index] = e;
        size++;
      } 

    private void extend() {
    	 int[] nuevo = new int[array.length *2];
         for (int i = 0; i < array.length; i++)
           nuevo[i] = array[i];
         array = nuevo;
       }
    public boolean contains(int data) {
        try {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) {
                	System.out.println("La posicion es" + i);
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }
        return false;
    }
}

