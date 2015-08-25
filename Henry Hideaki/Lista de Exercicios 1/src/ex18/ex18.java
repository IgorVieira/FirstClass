package ex18;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner s = new Scanner("System.in");
	double n;
	double r;
	
	System.out.print("A temperatura em celsius: ");
    n = s.nextDouble();
	
	r=(n*9+32)/5;
	System.out.print("Em graus Fahrenheit: "+r);}

	}
