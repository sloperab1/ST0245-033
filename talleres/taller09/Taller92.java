import java.util.HashMap;


public class Taller92{

  
    public static void agregar(HashMap empresas, String key, String value) {
        empresas.put(empresas,key);
    }	

    /**
     * pedrito 3
     * 
     * @param empresas es el hashmap ya creado donde se guardaran los valores
     * @param key      es la llave en el conjunto
     * 
     *                 El metodo buscara el valor asociado a la llave key
     * @return true, si lo encuentra, false de lo contrario.
     */
    public static boolean buscar(HashMap empresas, String key) {
        return empresas.containsKey(key);
        
    }

    /**
     * pedrito 4
     * 
     * @param empresas es el hashmap ya creado donde se guardaran los valores
     * @param value    es el valor asociado a la llave key El metodo nos dira si hay
     *                 una llave asociado al valor value.
     * @return true, si lo encuentra, false de lo contrario.
     */
    public static boolean contieneValue(HashMap empresas, String value) {
        return empresas.containsValue(value);
    }
}