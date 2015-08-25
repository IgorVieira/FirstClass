/*Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo,  
 Sabe-se que o segundo numero não pode ser zero, portanto não e necessario se preocupar 
 com validações */

package exe3;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
		int n;
		int n2;
		int r;
		
		
	System.out.println("Divisão de Duas Variaveis");
	
	System.out.print("Insira um Número: ");
	   n = s.nextInt();
	   
	System.out.print("Insira Outro Número: ");
	   n2 = s.nextInt();
	   
	
	 r = n /n2;
	 
	System.out.print("Resultado: "+r);
			 		
	}

}
