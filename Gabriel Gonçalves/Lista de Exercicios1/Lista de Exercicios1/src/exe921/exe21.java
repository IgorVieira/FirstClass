/*Faça um programa que receba o número de horas trabalhadas, o valor do Salário Mínimo e o   
 número de horas extras trabalhadas, calcule e mostre o Salário a receber, seguindo as regras 
 abaixo
 :
 a) a hora trabalhada vale 1/8 do salário minimo; V
 b) a hora extra vale 1/4 do salario minimo; V
 c) o salario bruto equivale ao numero de horas 
 trabalhadas multiplicado pelo valor da hora trabalhada; V
 d) a quantia a receber pelas horas extras equivale ao numero de horas
 extras trabalhadas multiplicado pelo valor da hora extra;
 e) o salario a receber equivale ao salario bruto mais a quantia a receber
 pelas horas extras
 */
package exe921;

import java.util.Scanner;

public class exe21 {
   public static void main(String[] args){
	   Scanner s = new Scanner(System.in);
	   
	   float nht; /*Numero de Horas Trabalhadas*/
	   float sm; /*Valor do Salario Minimo*/
       float nhe; /*Numero de Horas Extras*/
       float sb;  /*Salario Bruto*/
       float cnht; /*Calculo de Numero de horas Trabalhadas*/
       float che; /*Calculo de Horas Extras*/
       float st; /*Salario Total*/
       
       
     System.out.println("Calculo de Salario: ");
     
     System.out.print("Valor do Salario Minimo Atualmente: ");
     sm = s.nextFloat();
     
     System.out.print("Insira o Numero de Horas Trabalhadas: ");
       nht = s.nextFloat();
          
     System.out.print("Insira o Numero de Horas Extras: ");
       nhe = s.nextFloat();
       
       cnht = nht*(sm/8); /*hora Trabalhada*/
       che = nhe*(sm/4);  /*Horas Extras*/
       sb = nht*(sm/8);   
       st = sb+che;
       
     System.out.print("Total a Receber: " +st+ " R$");
     
	   
   }
}
