/*Fa�a um programa que receba dois numeros e fa�a a Subtra��o entre eles: */
package exe1;

import java.util.Scanner;

public class exe1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
		int n;
		int n2;
		int r;
		
	System.out.println("Subtra��o");
	
	System.out.print("Insira um N�mero: ");
	   n = s.nextInt();
	System.out.print("Insira outro N�mero: ");
	   n2 = s.nextInt();
	   
	   r = n -n2;
	   
	   System.out.print("Resultado: " +r);
	}

}
