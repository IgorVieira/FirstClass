package Exercicio2;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

@SuppressWarnings("resource")
Scanner s = new Scanner(System.in);
int x;
int x1;
int x2;
int r;

System.out.print("Digite um n�mero:");
x = s.nextInt();

System.out.print("Digite um outro n�mero:");
x1 = s.nextInt();

System.out.print("Digite um outro n�mero:");
x2 = s.nextInt();

r = x * x1 * x2;

System.out.print("O resultado �:"+r);



	}

}
