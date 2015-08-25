package Numero21;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double nh, vsm, nhe, r1, r2, r3, r4, r5;

		System.out.println("Digite o número de horas trabalhadas:");
		nh = s.nextDouble();

		System.out.println("Digite o valor do salário mínimo:");
		vsm = s.nextDouble();

		System.out.println("Digite o número de horas extras trabalhadas:");
		nhe = s.nextDouble();

		r1 = 0.125 * vsm;

		r2 = 0.25 * vsm;

		r3 = nh * r1;

		r4 = nhe * r2;

		r5 = r3 - r2;

		System.out.println("Hora trabalhada: "+r1);

		System.out.println("Hora extra: " +r2);

		System.out.println("Salário bruto: " +r3);

		System.out.println("A receber pelas horas extras:" +r4);

		System.out.println("Salário liquido: " +r5);

	}
}
