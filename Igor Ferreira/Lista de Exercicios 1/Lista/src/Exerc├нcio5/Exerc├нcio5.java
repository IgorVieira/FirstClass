package Exerc�cio5;

import java.util.Scanner;

public class Exerc�cio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double r;
		
		System.out.println("Pre�o do produto");
		n = s.nextDouble();
		
		r = n - (n * 0.1);
		
        System.out.println("O novo pre�o: "+r);
		
	}

}
