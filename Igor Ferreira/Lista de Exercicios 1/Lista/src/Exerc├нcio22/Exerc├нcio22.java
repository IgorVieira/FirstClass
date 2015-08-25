package Exercício22;

import java.util.Scanner;

public class Exercício22 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		double n;
		double nd;
		
		System.out.println("Número de lados: ");
		n = s.nextDouble();
		
		nd = n * (n - 3) / 2;
		
		System.out.println("O número de diagonais: "+nd);
		
		
	}

}
