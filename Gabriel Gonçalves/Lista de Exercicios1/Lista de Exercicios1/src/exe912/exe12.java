/*Faça um programa que receba o valor de um salario minimo, mais o valor que o funcionario ganha 
 e devolva quantos Salarios minimos o funcionario Ganha*/

package exe912;

import java.util.Scanner;

public class exe12 {
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  
	    Double s1; /*Salario Minimo*/
	    Double s2; /*Salario que o Funcionario ganha*/
	    Double c; /*Calculo*/
	    Double r; /*Resultado*/
	    
	    System.out.println("Calculo Salario: ");
	    
	    System.out.print("Insira o Valor do Salario Minimo: ");
	        s1 = s.nextDouble();
	    
	    System.out.print("Insira a Remuneração do Funcionario: ");
	        s2 = s.nextDouble();
	  
        r = s2 /s1;
        
        System.out.print("Resultado: " +r);
	  
	  
  }
}
