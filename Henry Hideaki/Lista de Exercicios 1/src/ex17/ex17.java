package ex17;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	double n, a, b, c;
	
	System.out.print("Digite o valor do raio: ");
	n = s.nextDouble();
	
	a=2*Math.PI*n;
	b=Math.PI*n*n;
	c=4/3*Math.PI*n*n*n;
	
	System.out.print("O valor do comprimento: "+a);
	System.out.print("O valor da area: "+b);
	System.out.print("O valor do volume: "+c);}

}
