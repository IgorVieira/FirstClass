package numero15;

import java.util.Scanner;

public class Numero15 {
public static void main (String[]args){
	
	Scanner s = new Scanner (System.in);
	
	float SJ;
	float C1;
	float C2;
	float CM1;
	float CM2;
	float CT;
	float SR;
	
	System.out.print("Insira seu salário.");
	SJ = s.nextFloat();
	
	System.out.print("Insira o valor da primeira conta atrasada.");
	C1 = s.nextFloat();
	
	System.out.print("Insira o valor da segunda conta atrasada");
	C2 = s.nextFloat();
	
	CM1 = (float) ((float) C1 * 0.02);
	CM2= (float)((float)C2 * 0.02);
	CT = ((float) CM1+C1 - CM2+C2);
	SR = (float) SJ - CT;
			
			
	System.out.print("Este é o restante de seu salario após pagar as contas.  " + SR );
	
	
}
}
