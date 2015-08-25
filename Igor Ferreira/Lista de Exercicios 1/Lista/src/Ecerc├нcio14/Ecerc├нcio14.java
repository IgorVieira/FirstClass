package Ecercício14;

import java.util.Scanner;

public class Ecercício14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double i;
		double i2;
		double i3;
		double i4;
		
		System.out.println("Ano de nascimento: ");
		n = s.nextDouble();
		
		i = 2014 - n;
		i2 = i * 12;
		i3 = i * 365;
		i4 = i * 52;
		
		System.out.println("Idade em anos: "+i);
		System.out.println("Idade em meses: "+i2);
		System.out.println("Idade em dias: "+i3);
		System.out.println("Idade em semanas: "+i4);
		
			
	}
	
	

}
