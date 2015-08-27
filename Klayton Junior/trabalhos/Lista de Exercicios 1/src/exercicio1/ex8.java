package exercicio1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		Double pk , pg;
		
		System.out.println("Peso em quilos:");
		pk = s.nextDouble();
		
		
		pg = pk*Math.pow(10,3);
		

		System.out.println("Peso em gramas:" + pg);
		
		
		
		
	}

}
