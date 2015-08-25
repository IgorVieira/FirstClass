package ex15;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n, n1, n2, r, r1, r2;
	
	System.out.print("Digite o valor do salario: ");
	n = s.nextFloat();
	
	System.out.print("Digite o valor da primeira conta: ");
	n1 = s.nextFloat();
	 
	System.out.print("Digite o valor da segunda conta: ");
	n2 = s.nextFloat();
	
	r = n1 + n1 *2/100;
	r1=n2+n2*2/100;
	r2=n-(r+r1);
	
	System.out.print("O reesto do salario é de: "+r2);}

}
