package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int p;
		int d;
		int r;
		
		System.out.print("O preço atual:");
		p = s.nextInt();
		
		System.out.print("desconto:");
		d = s.nextInt();
		
		r = p - d;
		
		System.out.print("O preço final é:"+r);
		
		
		
	}

}
