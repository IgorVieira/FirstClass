package Exerc�cio21;

import java.util.Scanner;

public class Exerc�cio21 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double h;
		double he;
		double sb;
		double se;
		double sr;
		
		
		System.out.println("Horas Trabalhadas: ");
		h = s.nextDouble();
		
		System.out.println("Horas extras: ");
		he = s.nextDouble();
		
		sb = h * 724/8;
		se = he * 724/4;
		sr = sb + se;
		
		System.out.println("Sal�rio bruto: "+sb);
		System.out.println("Sal�rio extra: "+se);
		System.out.println("Sal�rio a receber: "+sr);
		
		
		
		
		
		
	}

}
