package Numero16;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner s = new Scanner (System.in);
		
	double a, b, h, r1, r2, r3;
	
	System.out.println("Digite o cateto 1:");
	a = s.nextDouble();
	
	System.out.println("Digite o cateto 2:");
	b = s.nextDouble();
		
	r1 = Math.pow(a, 2);
	
	r2 = Math.pow(b, 2);
	
	r3 = (r1 + r2);
	
	h = Math.sqrt(r3); 

	System.out.println("O valor da hipotenusa é igual à:"+h);
	
	}
}