package Numero23;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double a1, a2, r;

		System.out.println("Digite o 1� �ngulo:");
		a1 = s.nextDouble();
		
		System.out.println("Digite o 2� �ngulo:");
		a2 = s.nextDouble();
		
		r = 180 - (a1 + a2); 
				
		System.out.println("O �ngulo restante � igual �:" +r);
	
	}
}

	