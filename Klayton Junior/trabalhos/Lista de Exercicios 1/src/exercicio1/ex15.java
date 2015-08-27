package exercicio1;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		Double x , c1 , c2 , r;
		
		System.out.println("Salário de João:");
		x = s.nextDouble();
		
		System.out.println("Conta 1:");
		c1 = s.nextDouble();
		
		System.out.println("Conta 2:");
		c2 = s.nextDouble();
		
		r = x - (c1*1.02 + c2*1.02);
		
		System.out.println("Dinheiro restante:"+r);
		
		
		
	}

}
