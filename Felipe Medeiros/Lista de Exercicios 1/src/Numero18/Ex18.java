package Numero18;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
			
		double c, f;
		
		System.out.println("Digite a temperatura em ºC:");
		c = s.nextDouble();
	
		f = (1.8 * c) + 32;
			
		System.out.println("Sua temperatura em ºF é"+f);
	}
}
