package ex12;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float n2;
	float r;
	
	System.out.print("Digite o salario minimo: ");
	n = s.nextFloat();
	
	System.out.print("Digite o salario: ");
	n2 = s.nextFloat();
	
	r = n2/n;
	System.out.print("O resultado é: "+r);}

}
