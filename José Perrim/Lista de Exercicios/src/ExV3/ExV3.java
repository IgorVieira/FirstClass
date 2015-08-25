package ExV3;

import java.util.Scanner;

public class ExV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double r;
		
		System.out.print("Digite o valor do primeiro angulo do triângulo:  ");
		n = s.nextDouble();
		
		System.out.print("Digite outro ângulo do triângulo:  " );
		n2 = s.nextDouble();
		
		r= 180- n + n2;
		
		System.out.print("O valor do angulo a ser descobrido:  "+r);
		
		

	}

}
