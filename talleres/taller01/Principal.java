
public class Principal {
// JUAN JOSE ESCOBAR  y SIMON LOPERA BOTERO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto p1 = new Punto(10,20);
		Punto p2 = new Punto(0,0);
		System.out.println(p1.radioPolar());
		System.out.println(p1.anguloPolar());
		System.out.println(p1.distanciaEuclidiana(p2));
		Fecha f1 = new Fecha (20,1,2020);
		Fecha f2 = new Fecha (18,7,2001);
		System.out.println(f1.comparar(f2));
		System.out.println(f1);
		Contador c1 = new Contador (0, "contador");
		c1.incrementar(5);
		c1.decrementar(2);
		System.out.println(c1);
		
	}

}
