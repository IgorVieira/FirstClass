package Exercício5;

import java.util.Scanner;

public class Exercício5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double r;
		
		System.out.println("Preço do produto");
		n = s.nextDouble();
		
		r = n - (n * 0.1);
		
        System.out.println("O novo preço: "+r);
		
	}

}
