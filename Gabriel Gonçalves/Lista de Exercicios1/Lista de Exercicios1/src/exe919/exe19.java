/*Sabe-se que, para iluminar de maneira correta os cômodos de uma casa,   
 para cada m² deve-se usar 18W de potência. Faça um Programa que 
 receba as duas dimensões de um cômodo em Metros, Calcule e mostre a 
 sua área em M² e a potencia de iluminação que deverá ser utilizada*/

package exe919;

import java.util.Scanner;

public class exe19 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
	 int d1; /*Dimensão 1*/
	 int d2; /*Dimensão 2*/
	 int calc;
	 int calc2;
	System.out.println("Calculo para iluminação correta: ");
		
	System.out.print("Insira a primeira dimensão do Comodo: ");
	 d1 = s.nextInt();
	 
	System.out.print("Insira a segunda dimensão do Comodo: ");
	 d2 = s.nextInt();
	 
	calc = d1 *d2; 
	calc2 = calc *18;
		
	System.out.print("Tamanho do Comodo em m²: "+calc+ " m²" +
			         "\nPotencia de Iluminação necessaria para o Comodo: " +calc2+ " W");	
		
	}

}
