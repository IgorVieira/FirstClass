package ex14;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n, n1, a, b, c, d;
	
	System.out.print("Digite o ano de nascimento: ");
	n = s.nextInt();
	
	System.out.print("Digite o ano atual: ");
	n1 = s.nextInt();
	
	a = n1-n;
	b = a*12;
	c = a*365;
	d = a*52;
	
	System.out.print("A idade em anos é; "+a);
	
	System.out.print("A idade em meses é: "+b);
	
	System.out.print("A idade em dias é: "+c);
	
	System.out.print("A idade em semanas é:"+d);}

}
