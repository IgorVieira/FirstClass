package exercicio1;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Double b1 , b2 , h , a;
		
		System.out.println("Base menor:");
		b1 = s.nextDouble();
		
		System.out.println("Base maior:");
		b2 = s.nextDouble();
		
		System.out.println("Altura:");
		h = s.nextDouble();
		
		a = ((b1 + b2)*h)/2;
		
		System.out.println("Área:" + a);
		
		
		
	}

}
