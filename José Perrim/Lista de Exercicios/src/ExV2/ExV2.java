package ExV2;

import java.util.Scanner;

public class ExV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n;
		double r;
		
		System.out.print("Número de lados do polígno:  ");
		n = s.nextDouble();
		
		r = n*(n-3)/2;
		
		System.out.print("Número de diagonais é :"+r);
		
				
		
		
		
		
	}

}
