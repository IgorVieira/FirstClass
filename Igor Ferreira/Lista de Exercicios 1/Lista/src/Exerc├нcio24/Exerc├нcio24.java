package Exerc�cio24;

import java.util.Scanner;

public class Exerc�cio24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r;
		double d;
		double ma;
		double le;
		
		System.out.println("Reais: ");
		r = s.nextDouble();
		
		d = r * 1.80;
		ma = r * 2.00;
		le = r * 1.57;
		
		System.out.println("D�Lar: "+d);
		System.out.println("Marco alem�o: "+ma);
		System.out.println("Libra esterlinda: "+le);
		
	}

}
