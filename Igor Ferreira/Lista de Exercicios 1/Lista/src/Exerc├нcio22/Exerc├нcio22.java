package Exerc�cio22;

import java.util.Scanner;

public class Exerc�cio22 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		double n;
		double nd;
		
		System.out.println("N�mero de lados: ");
		n = s.nextDouble();
		
		nd = n * (n - 3) / 2;
		
		System.out.println("O n�mero de diagonais: "+nd);
		
		
	}

}
