/*Sabe-se que, para iluminar de maneira correta os c�modos de uma casa,   
 para cada m� deve-se usar 18W de pot�ncia. Fa�a um Programa que 
 receba as duas dimens�es de um c�modo em Metros, Calcule e mostre a 
 sua �rea em M� e a potencia de ilumina��o que dever� ser utilizada*/

package exe919;

import java.util.Scanner;

public class exe19 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
	 int d1; /*Dimens�o 1*/
	 int d2; /*Dimens�o 2*/
	 int calc;
	 int calc2;
	System.out.println("Calculo para ilumina��o correta: ");
		
	System.out.print("Insira a primeira dimens�o do Comodo: ");
	 d1 = s.nextInt();
	 
	System.out.print("Insira a segunda dimens�o do Comodo: ");
	 d2 = s.nextInt();
	 
	calc = d1 *d2; 
	calc2 = calc *18;
		
	System.out.print("Tamanho do Comodo em m�: "+calc+ " m�" +
			         "\nPotencia de Ilumina��o necessaria para o Comodo: " +calc2+ " W");	
		
	}

}
