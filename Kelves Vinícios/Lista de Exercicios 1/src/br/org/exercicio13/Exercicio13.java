package br.org.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		double b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
		double c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
		double d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
		
		
		System.out.print("Escreva o número desejado: ");
		a = s.nextDouble();
		
		a0 = a*0;
		a1 = a*1;
		a2 = a*2;
		a3 = a*3;
		a4 = a*4;
		a5 = a*5;
		a6 = a*6;
		a7 = a*7;
		a8 = a*8;
		a9 = a*9;
		a10 = a*10;
		
		b0 = a+0;
		b1 = a+1;
		b2 = a+2;
		b3 = a+3;
		b4 = a+4;
		b5 = a+5;
		b6 = a+6;
		b7 = a+7;
		b8 = a+8;
		b9 = a+9;
		b10 = a+10;
		
		c0 = a-0;
		c1 = a-1;
		c2 = a-2;
		c3 = a-3;
		c4 = a-4;
		c5 = a-5;
		c6 = a-6;
		c7 = a-7;
		c8 = a-8;
		c9 = a-9;
		c10 = a-10;
		
		d0 = a/0;
		d1 = a/1;
		d2 = a/2;
		d3 = a/3;
		d4 = a/4;
		d5 = a/5;
		d6 = a/6;
		d7 = a/7;
		d8 = a/8;
		d9 = a/9;
		d10 = a/10;
		
		System.out.print("A tabuada de adição deste número é: \n"+b0+ ", \n"+b1+", \n"+b2+", \n"+b3+", \n"+b4+", \n"+b5+", \n"+b6+", \n"+b7+", \n"+b8+", \n"+b9+", \n"+b10+".\n");
		
		System.out.print("A tabuada de subtração deste número é: \n"+c0+ ", \n"+c1+", \n"+c2+", \n"+c3+", \n"+c4+", \n"+c5+", \n"+c6+", \n"+c7+", \n"+c8+", \n"+c9+", \n"+c10+".\n");
		
		System.out.print("A tabuada de multiplicação deste número é: \n"+a0+ ", \n"+a1+", \n"+a2+", \n"+a3+", \n"+a4+", \n"+a5+", \n"+a6+", \n"+a7+", \n"+a8+", \n"+a9+", \n"+a10+".\n");
		
		System.out.print("A tabuada de divisão deste número é: \n"+d0+ ", \n"+d1+", \n"+d2+", \n"+d3+", \n"+d4+", \n"+d5+", \n"+d6+", \n"+d7+", \n"+d8+", \n"+d9+", \n"+d10+".");

		
	}

}
