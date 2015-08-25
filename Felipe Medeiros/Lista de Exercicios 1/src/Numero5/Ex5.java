package Numero5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double n, r;
		
		System.out.println("Digite o preço do produto");
		n = s.nextDouble();
			
		r = n - (0.1 * n);
		
		System.out.println("Com 10% de desconto seu produto fica com o preço de:"+r);
		
		}
		
	}	