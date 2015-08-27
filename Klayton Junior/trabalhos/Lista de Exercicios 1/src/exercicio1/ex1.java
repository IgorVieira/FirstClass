package exercicio1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	

		Double x , y , r;
		 
		System.out.println("Váriavel x:");
		x = s.nextDouble();
		
		System.out.println("Váriavel y:");
		y = s.nextDouble();
		
		r = x - y;
		
		System.out.println("Resultado:" + r);
		
		
	}

}
