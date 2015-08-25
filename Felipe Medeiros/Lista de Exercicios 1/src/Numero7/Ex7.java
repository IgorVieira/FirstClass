package Numero7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double a, r1, r2;
		
		System.out.println("Digite o peso:");
		a = s.nextDouble();
			
		r1 = a + (0.15 * a);
		
		r2 = a - (0.20 * a);
		
		System.out.println("Peso se ela engordar:"+r1);
		
		System.out.println("Peso se ela emagrecer:"+r2);
		}
		
	}	