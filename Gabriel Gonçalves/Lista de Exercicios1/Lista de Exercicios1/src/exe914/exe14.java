/*Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual,  
  calcule e mostre:
  
  a) a idade dessa pessoa em anos;
  b) a idade dessa pessoa em meses;
  c) a idade dessa pessoa em dias;
  d) a idade dessa pessoa em semanas;
  */

package exe914;

import java.util.Scanner;

public class exe14 {


		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
		     
			 int d; /*Ano do Nascimento*/
			 int d1; /*Ano Atual*/
			 int i; /*Idade em Anos*/
			 int i1; /*Idade em meses*/
			 int i2; /*Idade em dias*/
			 int i3; /*Idade em Semanas*/
			 
	   System.out.println("Calculo de data");
	   
	   System.out.print("Insira o ano atual: ");
	      d1 = s.nextInt();
	      
	   System.out.print("Insira o ano em que nasceu: ");
	      d = s.nextInt();
	      
	   i = d1 -d;
	   i1 = i *12;
	   i2 = i *364;
	   i3 = i *48;
	   
	   System.out.print("Idade em Anos: " +i 
			             + "\nIdade em meses: " +i1 
			             + "\nIdade em dias: " +i2
			             + "\nIdade em Semanas: " +i3);
	   
				
		
		}
		
	}
