package Numero19;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
			
		double c, l, r;
		
		System.out.println("Digite o comprimento em metros:");
		c = s.nextDouble();
	
		System.out.println("Digite a largura em metros:");
		l = s.nextDouble();
		
		r = (c * l) * 18;
		
		System.out.println("Você precisará de (Watts de potência):"+r);
	
	}	
}
