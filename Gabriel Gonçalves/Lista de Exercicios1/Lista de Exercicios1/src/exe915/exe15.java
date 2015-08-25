/*João recebeu seu salário e precisa pagar duas contas attrasadas. Por causa do atraso,  
 ele deverá pagar multa de 2% sobre cada conta. Faça um programa que calcule e mostre 
 quanto restara do salario de João.*/

package exe915;

import java.util.Scanner;

public class exe15 {
	  public static void main(String[] args){
		  Scanner s = new Scanner(System.in);
		      
		      float n; /*Salario*/  
		      float n1; /*Valor da Divida1*/
		      float n2; /*Valor da Divida2*/
		      float c1; /*Calculo 1*/
		      float c2; /*Calculo 2*/
		      float c3; /*Soma das Dividas*/
		      float c4; /*Soma dos Juros*/
		      float r;  /*Resultado*/
		    System.out.println("Calcule Salario Total: ");
		    
		  	System.out.print("Insira seu Salario: ");
		  	   n = s.nextFloat();
		  	
		  	System.out.print("Insira o Valor da Divida1: ");
		  	   n1 = s.nextFloat();
		  	   
		  	System.out.print("Insira o Valor da Divida2: ");
		  	  n2 = s.nextFloat();
		  	 
		    c1 = (2*n1)/100;
		    
		    c2 = (2*n2)/100;
		    
		    c3 = n1 +n2;
		    
		    c4 = c1 +c2;
		    
		  
		    r = (n - (c3+c4));
		    
		    System.out.print("Resultado: " +r);
		    
		    	  
		  
	  }
	    
	}
