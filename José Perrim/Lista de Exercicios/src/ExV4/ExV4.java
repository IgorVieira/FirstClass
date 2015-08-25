package ExV4;

import java.util.Scanner;

public class ExV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double m;
		double r;
		double r2;
		double r3;
		
		System.out.print("quantidade de reais:  ");
		m = s.nextDouble();
		
		r= m *1.80;
		r2 = m *2.0;
		r3 = m *1.57;
		
		System.out.print("\t Valor em dólar:   "+r);
		System.out.print("\tValor em marco alemão:  "+r2 );
		System.out.print("\tValor em libra esterlina:  "+r3);
		
				

	}

}
