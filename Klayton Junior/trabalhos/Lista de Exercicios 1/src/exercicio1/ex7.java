package exercicio1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Double p1 , pf;
		
		System.out.println("Peso inicial:");
		p1 = s.nextDouble();
		
		pf = p1 + 0.15*p1;
			
	
		System.out.println("Peso após engordar:" + pf);
		
		pf = p1 - 0.2*p1;
		
		System.out.println("Peso após emagrecer:" + pf);
		
		
		
		
		
		

	}

}
