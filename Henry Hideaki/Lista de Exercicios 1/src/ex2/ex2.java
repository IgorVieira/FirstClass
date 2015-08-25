package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n;
	int n2;
	int n3;
	int r;
	
	System.out.print("Digite um numero: ");
	n = s.nextInt();
	
	System.out.print("Digite um outro numero: ");
	n2 = s.nextInt();
	
	System.out.print("Digite um outro numero: ");
	n3 = s.nextInt();
	
	r = n * n2 * n3;
	System.out.print("O resultado é: "+r);}

}
