package Exercício16;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int c1;
		int c2;
		int h;
		
		System.out.print("Cateto oposto:");
		c1 = s.nextInt();
		
		System.out.print("Cateto adjacente");
		c2 = s.nextInt();
		
		h = c1 * c2;
		
		System.out.print("Hipotenusa:"+h);
	}

}
