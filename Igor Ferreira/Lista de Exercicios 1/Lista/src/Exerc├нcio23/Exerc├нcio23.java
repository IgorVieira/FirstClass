package Exerc�cio23;

import java.util.Scanner;

public class Exerc�cio23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("�ngulo 1: ");
		x = s.nextDouble();
		
		System.out.println("�ngulo 2: ");
		y = s.nextDouble();
		
		z = 180 - (x + y);
		
		System.out.println("�ngulo 3: "+z);
		
	}

}
