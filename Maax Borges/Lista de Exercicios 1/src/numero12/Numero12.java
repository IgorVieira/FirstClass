package numero12;

import java.util.Scanner;

public class Numero12 {
public static void main (String[]Args){
	
	Scanner s = new Scanner (System.in);
	
	float SalárioMin;
	float Salário;
	float Resultado;
	
	System.out.print("Digite o Salário Mínimo atual.");
	SalárioMin = s.nextFloat();
	
	System.out.print("Digite o Salário do Funcionário");
	Salário = s.nextFloat();
	
	Resultado = (float)Salário / SalárioMin;
	
	System.out.print("O Funcionário ganha "+Resultado+"Salários Mínimos");
	
	
	
}
}
