/*Faça um programa que receba a medida de dois angulos de um triangulo,
 calcule e mostre a medida do terceiro ângulo. Sabe-se que a soma dos 
 angulos de um triangulo é 180º.*/


package exe923;

import java.util.Scanner;

public class exe23 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		float ang1;
		float ang2;
		float ang3;
		
	 System.out.println("Calculo de Angulos do Triangulo: ");
		
     System.out.printf("Qual e o Valor do Primeiro Angulo: ");
	   ang1 = s.nextFloat();
	   
	 System.out.print("Qual e o Valor do Segundo Angulo: ");
	   ang2 = s.nextFloat();
	   
	   ang3 = 180-(ang1 +ang2);
	   
	 System.out.print("O Valor do Terceiro Angulo é: " +ang3);
		
		
		
		
		
		
	}

}
