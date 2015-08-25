package Numero15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double a, b, c, r1, r2, r3;
		
		System.out.println("Digite o salário de João:");
		a = s.nextDouble();
			
		System.out.println("Digite a primeira conta:");
		b = s.nextDouble();
		
		System.out.println("Digite a segunda conta:");
		c = s.nextDouble();
		
		r1 = a - (0.02 * b);
		
		r2 = a - (0.02 * c);
		
		r3 = (r1 + r2) - a;
		System.out.println("João vai ficar com apenas:"+r3);
		
		}
		
	}	
