package numero12;

import java.util.Scanner;

public class Numero12 {
public static void main (String[]Args){
	
	Scanner s = new Scanner (System.in);
	
	float Sal�rioMin;
	float Sal�rio;
	float Resultado;
	
	System.out.print("Digite o Sal�rio M�nimo atual.");
	Sal�rioMin = s.nextFloat();
	
	System.out.print("Digite o Sal�rio do Funcion�rio");
	Sal�rio = s.nextFloat();
	
	Resultado = (float)Sal�rio / Sal�rioMin;
	
	System.out.print("O Funcion�rio ganha "+Resultado+"Sal�rios M�nimos");
	
	
	
}
}
