package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n;
	int n2;
	int r;
	
	System.out.print("Digite a primeira nota: ");
	n = s.nextInt();
	
	System.out.print("Digite a segunda nota: ");
	n2 = s.nextInt();
	
	r = (n * 2 + n2 * 3) / 5;
	System.out.print("A media é: "+r);}

}
