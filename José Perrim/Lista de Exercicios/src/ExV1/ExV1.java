package ExV1;

import java.util.Scanner;

public class ExV1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n;
		double n2;
		double n3;
		double r;
		double r2;
		double r3;
		double r4;
		double r5;

		System.out.print("Número de horas trabalhadas: ");
		n = s.nextDouble();

		System.out.print("Seu salário : ");
		n2 = s.nextDouble();

		System.out.print("Horas extras trabalhadas: ");
		n3 = s.nextDouble();

		r = 0.125 * n2;
		r2 = 0.25 * n2;
		r3 = n * r;
		r4 = n3 * r2;
		r5 = (r4 + r3);

		System.out.print("O seu salario equivalente mais as horas extras é de: "+ r5);
						

					}

}
