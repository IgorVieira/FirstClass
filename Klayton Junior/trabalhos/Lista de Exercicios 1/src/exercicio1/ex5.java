package exercicio1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Double p1 , np;
		
		System.out.println("Preço inicial:");
		p1 = s.nextDouble();
		
				
		np = p1 - (p1 * 0.1); 
		
		System.out.println("Novo preço:" + np);
		
		
	
	}

}
