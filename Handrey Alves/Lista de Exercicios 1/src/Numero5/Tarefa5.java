package Numero5;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n, r;

		System.out.println("preço inicial:");
		n = s.nextInt();

		r =(float) (n-(n*0.1));
		
		System.out.println("novo preço:"+r);

	}

}
