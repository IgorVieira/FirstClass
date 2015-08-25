package Numero25;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double h, m, r1, r2, r3;

		System.out.println("Digite a hora :");
		h = s.nextDouble();
		
		System.out.println("Digite os minutos :");
		m = s.nextDouble();
		
		r1 = h * 60;
				
		r2 = r1 + m;
		
		r3 = (h * 60) + m * 60;
				
		System.out.println("A conversão em minutos é igual à :" +r1);
	
		System.out.println("A conversão em A) + os minutos(extra) :" +r2);
		
		System.out.println("A conversão dos minutos em segundos :" +r3);	
	
	}
}