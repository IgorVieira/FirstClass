package Exerc�cio12;

import java.util.Scanner;

public class Exerc�cio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int s1;
		int s2;
		int r;
		int r1;
		
		System.out.print("Sal�rio m�nimo:");
		s1 = s.nextInt();
		
		System.out.print("Sal�rio do funcion�rio:");
		s2 = s.nextInt();
		
		r = s1 + s2;
		
		System.out.print("Soma dos sal�rios:"+r);
		
		r1 = r / s1;
		System.out.print("\n Quantidade:"+r1);
	}

}
