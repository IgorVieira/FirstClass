package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n;
	int n2;
	int r;
	
	System.out.print("Digite um n�mero: ");
	n = s.nextInt();
	
	System.out.print("Digite outro n�mero: ");
	n2 = s.nextInt();
	
	r = n - n2;
	System.out.print("A subtra��o �: "+r);}

}
