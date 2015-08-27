package exercicio1;

import java.util.Scanner;


public class ex17 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		double r , c , a , v;
		
		System.out.println("Raio:");
		r = s.nextDouble();
		

		c = 2 * Math.PI * r;
		a = Math.PI*Math.pow(r, 2);
		v = 4/3* Math.PI * Math.pow(r, 3);
		
		System.out.println("Comprimento da circunferência"+c);
		System.out.println("Área do círculo"+a);
		System.out.println("Volume da esfera"+v);
		
	
	
	
	}
	
	
	

}
