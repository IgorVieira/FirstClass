package ExD9;

import java.util.Scanner;

public class ExD9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n;
		double n2;
		double r;
		double r2;

		System.out.print("Digite o valor da altura:  ");
		n = s.nextDouble();
		System.out.print("Digite o valor da base:  ");
		n2 = s.nextDouble();

		r = n * n2;
		r2 = r * 18;
		
		System.out.print("A ·rea do comodo È de :  "+r);
		System.out.print("\t… necess·rio "+r2+"W");

	}

}