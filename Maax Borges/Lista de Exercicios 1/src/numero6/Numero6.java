package numero6;

import java.util.Scanner;

public class Numero6 {
public static void main (String[]args){
	
	Scanner s = new Scanner (System.in);
	
	float x;
	float x2;
	float C;
	float SF;
	
	System.out.println("Digite o sal�rio do funcion�rio.");
	x = s.nextFloat();
	
	System.out.println("Digite o valor das vendas.");
	x2 = s.nextFloat();
	
	C = (float) ((float) x2 * 0.10);
	
	SF = C + x ;
	
	System.out.println("Sal�rio final. "+ SF);
	
	System.out.println("Comiss�o. "+ C);
	
	
	
	
	
	
	
	
	
	
}
}
