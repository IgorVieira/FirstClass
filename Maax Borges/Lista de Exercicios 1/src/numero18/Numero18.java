package numero18;

import java.util.Scanner;

public class Numero18 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner (System.in);
		
float TC;
float TF;

System.out.print("Digite a temperatua em graus Celsius");
TC = s.nextFloat();

TF = 180*(TC + 32)/100;

System.out.print("A temperatura em Farenheit é  "+ TF);


		
		
	}

}
