package Numero17;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double a, v, c, r;
		
		System.out.println("Digite o raio:");
		r = s.nextDouble();
		
		c = 2 * Math.PI * r;
		
		a = Math.PI * Math.pow(r, 2);
		
		v = (4/3) * Math.PI * Math.pow(r, 3);
		
		System.out.println("Circunferencia: "+c);
		
		System.out.println("Área: "+a);
		
		System.out.println("Volume: "+v);
	}
}
