package ex5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n;
	int r;
	
	System.out.print("Digite o preço: ");
	n = s.nextInt();
	
	r = n - n * 10 / 100;
	System.out.print("O preço é: "+r);}

}
