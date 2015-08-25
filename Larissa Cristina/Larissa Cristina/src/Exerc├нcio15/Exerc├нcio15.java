package Exercício15;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int s1;
		int c1;
		int c2;
		int ju;
		int c;
		int f;
		
		System.out.print("Salário inicial:");
		s1 = s.nextInt();
		
		System.out.print("Primeira conta:");
		c1 = s.nextInt();
		
		System.out.print("Segunda conta:");
		c2 = s.nextInt();
		
		System.out.print("Juros:");
		ju = s.nextInt();
		
		c = c1 + c2 + ju;
		
		System.out.print("Total das contas:"+c);
		
		f = s1 - c;
		
		System.out.print("\nSalário final:"+f);
	}

}
