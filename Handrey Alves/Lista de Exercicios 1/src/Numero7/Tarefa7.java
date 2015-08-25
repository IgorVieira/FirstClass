package Numero7;

import java.util.Scanner;

public class Tarefa7 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n, r, r2;

		System.out.println("Peso:");
		n = s.nextInt();

		
		r =(float) (n + (n * (15.0/100)));
	
		System.out.println("Engordou:" + r);

		r2 =(float) (n - (n * (20.0/100)));
		
		System.out.println("Emagreceu:" + r2);
	}
}
