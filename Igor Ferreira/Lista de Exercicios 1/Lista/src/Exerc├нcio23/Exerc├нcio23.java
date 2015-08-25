package Exercício23;

import java.util.Scanner;

public class Exercício23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("Ângulo 1: ");
		x = s.nextDouble();
		
		System.out.println("Ângulo 2: ");
		y = s.nextDouble();
		
		z = 180 - (x + y);
		
		System.out.println("Ângulo 3: "+z);
		
	}

}
