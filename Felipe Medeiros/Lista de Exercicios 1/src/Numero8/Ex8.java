package Numero8;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double n, r;
		
		System.out.println("Digite seu peso:");
		n = s.nextDouble();
			
		r = n * Math.pow(10, 3);
		
		System.out.println("O seu peso em gramas é:"+r);
		
		}
		
	}	