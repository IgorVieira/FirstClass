package exercicio1;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		
		double x, y , z , a , h;
		
		System.out.println("Distância da escada até a parede:");
		x = s.nextDouble();
		
		System.out.println("Medida da escada:");
		y = s.nextDouble();
		
		z = x/y;
		a = Math.cos(z);
		
		System.out.println("Valor do ângulo formadado pela escada e o chão:"+a);
		
		
	}

}
