/*Um Funcionario recebe um Sal�rio Fixo mais 4% de comis�o sobre vendas, Fa�a um programa que  
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
		
    System.out.println("Calculo de Comiss�o de Vendas a 4%");		
		
	System.out.print("Insira o Sal�rio Fixo: ");
	   n = s.nextInt();
	   
	 System.out.print("Insira o Valor Vendido: ");
	   n2 = s.nextInt();
	  
	  r = 4*n2 /100;
	  
	 System.out.println("Comis�o: " +r);
	  r2 = n +r;
	 System.out.println("Resultado mais a Comiss�o: " +r2);
		
		
		
	}

}
