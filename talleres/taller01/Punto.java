
public class Punto {

    private double x, y;


    public Punto (double x, double y) {
    	this.x=x;
    	this.y=y;
    }


    public double x() {
    	return x;
    }


    public double y() {
    	return y;
    }



    
    public double radioPolar() {
    	double rp = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    	return rp;
    }



    public double anguloPolar() {
    	double ap= Math.atan(y/x);
    	return ap;
    }


  
    public double distanciaEuclidiana(Punto otro) {
        double dx = x-otro.x;
        double dy = y-otro.y;
        double de= Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
        return de;
    }
}