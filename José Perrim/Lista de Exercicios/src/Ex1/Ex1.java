package Ex1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n;
		int n2;
		int r;
		System.out.print("Digite um n�mero inteiro aqui:  ");
		n = s.nextInt();
		
		System.out.print("Digite um outro n�mero inteiro aqui:  ");
		n2 = s.nextInt();
		
		r= n-n2;
		
		System.out.print("Resultado:  " +r);
		
	}
}
