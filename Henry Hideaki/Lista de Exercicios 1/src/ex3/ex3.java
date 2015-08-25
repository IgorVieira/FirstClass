package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n;
	int n2;
	int r;
	
	System.out.print("Digite um número: ");
	n = s.nextInt();
	
	System.out.print("Digite outro numero: ");
	n2 = s.nextInt();
	
	r = n / n2;
	System.out.print("O resultado é: "+r);}

}
