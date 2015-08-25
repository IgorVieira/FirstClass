package Exercício10;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n1;
		int n2;
		int A;
		
		System.out.print("Um lado:");
		n1 = s.nextInt();
		
		System.out.print("Um outro lado:");
		n2 = s.nextInt();
		
		A = n1 * n2;
		
		System.out.print("A área do quadrado:"+A);
	}

}
