package Exerc�cio12;

import java.util.Scanner;

public class Exerc�cio12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double sl;
		double sm;
		double r;
		System.out.println("Sal�rio do funcion�rio: ");
		sl = s.nextDouble();
		
		System.out.println("Valor do sal�rio min�mo: ");
		sm = s.nextDouble();
		
		r = sl / sm;
		
		System.out.println("Sal�rios min�mos: "+r);
	}

}
