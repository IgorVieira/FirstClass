package Exercício7;

import java.util.Scanner;

public class Exercício7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double r;
		double r2;
		
		System.out.println("Peso da pessoa");
		n = s.nextDouble();
		
		r = n + (n * 0.15);
	   r2 = n - (n * 0.20);
	   
	   System.out.println("O novo peso,engordando 15 %:"+r
			   +"\nO novo peso,emagrecendo 20 %: "+r2);
	
	}
}
