package Exerc�cio10;

import java.util.Scanner;

public class Exerc�cio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double l1;
		double l2;
		double aq;
		
		System.out.println("Lado 1:");
		l1 = s.nextDouble();
		
		System.out.println("Lado 2:");
		l2 = s.nextDouble();
		
		aq = l1 * l2;
		
		System.out.println("�rea do quadrado: "+aq);
	
	}


}
