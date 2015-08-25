/*Faça um programa que calcule a area do Trapezio, Formula: t = (B+b)*H/2   */

package exe9;

import java.util.Scanner;

public class exe9 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int b1; /*Base Maior*/
		int b2; /*Base Menor*/
		int h; /*Altura*/
		int r; /*Resultado*/
		
		System.out.println("Calculo da Area do Trapezio: ");
		
		System.out.print("Insira a Area da Base Maior: ");
		  b1 = s.nextInt();
		  
		System.out.print("Insira a Area da Base Menor: ");
		  b2 = s.nextInt();
		
		System.out.print("Insira a dimensão da Altura: ");
		  h = s.nextInt();
		  
		  
		r = (b1 +b2)*h/2;
		  
		
		System.out.print("Resultado²: " +r);
		
		
	}

}
