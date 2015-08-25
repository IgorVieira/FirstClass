package ex7;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	float n;
	float r;
	float r2;
	
	System.out.print("Digite o peso: ");
	n = s.nextFloat();
	
	r = n + n * 15 / 100;
	System.out.print("Depois de engordar: "+r);
	
	r2 = n - n * 1 / 5;
	System.out.print("Depois de emagrecer: "+r2);}

}
