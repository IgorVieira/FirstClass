package Exerc�cio9;

import java.util.Scanner;

public class Exerc�co9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a1;
		double a2;
		double h;
		double at;
		
		System.out.println("�rea da maior: ");
		a1 = s.nextDouble();
		
		System.out.println("�rea da menor: ");
		a2 = s.nextDouble();
		
		System.out.println("Altura");
		h = s.nextDouble();
		
		at = ((a1 + a2) * h) / 2;
		
		System.out.println("�rea do trap�zio: "+at);
		
		
		
		
		
	}

}
