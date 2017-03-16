import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Arv arv1 = new Arv(60);
		double a = arv1.kuldl6ige();
		System.out.printf("Arvu " + arv1.arv + " kuldl6ikes suhe on %.1f:%.1f ", a, arv1.arv - a);
		
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.println("Mitu arvu?");
		int mituKorda = in.nextInt();
		
		for(int i= 0; i < mituKorda; i++){
			System.out.println();
			System.out.println("Sisesta positiivne arv");
			double sisestatudArv = in.nextDouble();
			Arv arv2 = new Arv(sisestatudArv);
			double b = arv2.kuldl6ige();
			System.out.printf("Arvu " + arv2.arv + " kuldl6ikes suhe on %.1f:%.1f ", b, arv2.arv - b);
		}
	}
	
	
}

/*
[karinrik@greeny t02klass]$ java Test
Arvu 60.0 kuldl6ikes suhe on 37.1:22.9 
*/