/*Fa�a um programa que receba dois n�meros, calcule e mostre a divis�o do primeiro pelo segundo,  
 Sabe-se que o segundo numero n�o pode ser zero, portanto n�o e necessario se preocupar 
 com valida��es */

package exe3;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
		int n;
		int n2;
		int r;
		
		
	System.out.println("Divis�o de Duas Variaveis");
	
	System.out.print("Insira um N�mero: ");
	   n = s.nextInt();
	   
	System.out.print("Insira Outro N�mero: ");
	   n2 = s.nextInt();
	   
	
	 r = n /n2;
	 
	System.out.print("Resultado: "+r);
			 		
	}

}
