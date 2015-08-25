package ex9;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float n2;
	float n3;
	float a;
	
	System.out.print("Digite o tamanho da base menor: ");
	n = s.nextFloat();
	
	System.out.print("Digite o tamanho da base maior: ");
	n2 = s.nextFloat();
	
	System.out.print("Digite a altura: ");
	n3 = s.nextFloat();
	
	a = (n2 - n) * n3 / 2;
	System.out.print("A area do trapezio; "+a);}

}
