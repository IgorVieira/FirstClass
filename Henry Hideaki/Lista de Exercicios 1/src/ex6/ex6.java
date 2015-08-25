package ex6;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float n2;
	float r;
	float r2;
	
	System.out.print("Digite o salario fixo: ");
	n = s.nextFloat();
	
	System.out.print("Digite o valor das vendas: ");
	n2 = s.nextFloat();
	
	r = n2 * 4 / 100;
	System.out.print("A comissão é: "+r);
	
	r2 = n + r;
	System.out.print("O Total é: "+r2);}

}
