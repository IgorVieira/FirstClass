package Exerc�cio11;

import java.util.Scanner;

public class Exerc�cio11 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	double d1;
	double d2;
	double al;
	
	System.out.println("Lado maior: ");
	d1 = s.nextDouble();
	
	System.out.println("Lado menor: ");
	d2 = s.nextDouble();
	
	al = (d1 * d2) / 2;
	
	System.out.println("�rea do losango: "+al);
	
	}
}
