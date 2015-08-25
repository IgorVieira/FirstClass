package Exercício25;

import java.util.Scanner;

public class Exercício25 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	double h;
	double mi;
	double m;
	double sg;
	
	System.out.println("Horas:");
	h = s.nextDouble();
	
	m = h * 60;
	h = m / 60;
	sg = m * 60;

	System.out.println("Minutos: "+m);
	System.out.println("Horas: "+h);
	System.out.println("Segundos: "+sg);
	
	
	}

}
