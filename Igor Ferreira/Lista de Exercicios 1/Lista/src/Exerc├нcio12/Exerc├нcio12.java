package Exercício12;

import java.util.Scanner;

public class Exercício12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double sl;
		double sm;
		double r;
		System.out.println("Salário do funcionário: ");
		sl = s.nextDouble();
		
		System.out.println("Valor do salário minímo: ");
		sm = s.nextDouble();
		
		r = sl / sm;
		
		System.out.println("Salários minímos: "+r);
	}

}
