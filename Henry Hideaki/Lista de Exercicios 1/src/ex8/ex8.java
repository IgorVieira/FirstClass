package ex8;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float r;
	
	System.out.print("Digite o peso: ");
	n = s.nextFloat();
	
	r = n * 1000;
	System.out.print("O peso em gramas é: "+r);}

}
