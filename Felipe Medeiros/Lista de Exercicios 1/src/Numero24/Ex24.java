package Numero24;

import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double d, dol, lib, ale;

		System.out.println("Digite o valor:");
		d = s.nextDouble();
		
		dol = 1.8 * d;
				
		lib = 2.0 * d;
		
		ale = 1.57 * d;
				
		System.out.println("A conversão em libra :" +lib);
		
		System.out.println("A conversão em dolar :" +dol);
		
		System.out.println("A conversão em marco alemão :" +ale);


	}
}
