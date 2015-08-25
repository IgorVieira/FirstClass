package Exercício14;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n;
		int at;
		int me = 31;
		int an;
		int n1;
		int d = 365;
		int n3;
		int s1 = 48;
		int n4;
		
		System.out.print("Nascimento:");
		n = s.nextInt();
		
		System.out.print("Ano atual:");
		at = s.nextInt();
		
		an = at - n;
		System.out.print("Idade em anos:"+an);
		
		n1 = n * me;
		System.out.print("\nIdade em meses:"+n1);
		
		n3 = d * n;
		System.out.print("\nIdade em dias:"+n3);
		
		n4 = n * s1;
		System.out.print("\nIdade em semana:"+n4);
		
		
		
		
		
	}

}
