/*Um Funcionario recebe um Salário Fixo mais 4% de comisão sobre vendas, Faça um programa que  
 receba o salario fixo mais os valores das vendas e retorno o salario total*/

package exe6;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n;
		int n2;
		int r;
		int r2;
		
    System.out.println("Calculo de Comissão de Vendas a 4%");		
		
	System.out.print("Insira o Salário Fixo: ");
	   n = s.nextInt();
	   
	 System.out.print("Insira o Valor Vendido: ");
	   n2 = s.nextInt();
	  
	  r = 4*n2 /100;
	  
	 System.out.println("Comisão: " +r);
	  r2 = n +r;
	 System.out.println("Resultado mais a Comissão: " +r2);
		
		
		
	}

}
