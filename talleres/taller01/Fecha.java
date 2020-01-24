

public class Fecha {
    

    private final int dia;
    private final int mes;
    private final int anyo;



    public Fecha(int dia, int mes, int anyo) {
    	this.dia=dia;
    	this.mes=mes;
    	this.anyo=anyo;
    }



    public int dia() {
    	return dia;
    }


    public int mes() {
    	return mes;
    }


    public int anyo() {
    	return anyo;
    }



    public int comparar(Fecha otra) {
    	int x;
    	if (dia==otra.dia && mes==otra.mes && anyo==otra.anyo) {
    		x=0;
    	} else if (dia<otra.dia && mes<=otra.mes && anyo<=otra.anyo) {
    		x=-1;
    	} else {
    		x=1;
    	}
    	return x;
    }


     
    public String toString() {
        return "El dia " + dia + " del mes "+ mes+ " del año " + anyo;
    }
}