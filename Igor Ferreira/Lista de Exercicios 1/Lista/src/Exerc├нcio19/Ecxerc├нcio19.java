package Exerc�cio19;

import java.util.Scanner;

public class Ecxerc�cio19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		double c;
		double l;
		double a;
		double p;
		
		System.out.println("Comprimento: ");
		c = s.nextDouble();
		
		System.out.println("Largura: ");
		l = s.nextDouble();
		
		a = c * l;
		p = a * 18;
		
		System.out.println("�rea: "+a);
		System.out.println("Pot�ncia de ilumina��o: "+p);
		
		
			
	}

}
