public class Arv{
	private static final double fii =  (1 + Math.sqrt(5)) / 2;  //1.6180...
	double arv;
	
	public Arv(double x){
		if(x <= 0){
			throw new RuntimeException("Arv peab olema nullist suurem");
		}
		this.arv = x;
	}
	
	public double kuldl6ige(){
		double a = arv / fii;
		//double b = pikkus - a;
		return a;
	}
	
	
}