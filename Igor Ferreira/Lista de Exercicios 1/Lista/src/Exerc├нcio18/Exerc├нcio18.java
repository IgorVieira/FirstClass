package Exercício18;

import java.util.Scanner;

public class Exercício18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.println("Temperatura em Celsius: ");
		c = s.nextDouble();
		
		f = (1.8 * c) + 32;
		
		System.out.println("Temperatura em Fahrenheit: "+f);
	}

}
