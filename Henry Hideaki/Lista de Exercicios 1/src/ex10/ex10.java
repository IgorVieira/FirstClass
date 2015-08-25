package ex10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float r;
	
	System.out.print("DIgite o lado do quadrado: ");
	n = s.nextFloat();
	
	r = n * n;
	System.out.print("A area do quadrado é: "+r);}

}
