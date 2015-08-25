package ex16;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	double a, b, c, r;
	
	System.out.print("O valor do cateto: ");
	a = s.nextDouble();
	
	System.out.print("O valor do outro cateto: ");
	b = s.nextDouble();
	
	r=a*a+b*b;
	c=Math.sqrt(r);
	
	System.out.print("O valor da hipotenusa: "+c);}

}
