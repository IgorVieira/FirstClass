package exercicio1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		Double d1 , d2 , a;
		
		System.out.println("Diagonal maior:");
		d1 = s.nextDouble();
		
		System.out.println("Diagonal menor:");
		d2 = s.nextDouble();
		
		a = (d1 * d2)/2;
		
		System.out.println("Área do losango:" + a);
				
		
		
		
		

	}

}
