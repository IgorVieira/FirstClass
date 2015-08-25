/*Faça um programa que receba o número de lados de um poligono convexo, calcule e mostre 
 o numero de diagonais desse poligono. Sabe-se que ND = N * (N - 3/2, Onde N é o numero 
 de lados do poligono.)*/

package exe922;

import java.util.Scanner;

public class exe22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float lados;
		float diagonais;
		
		System.out.println("Poligono: ");
		
		System.out.print("Insira o numero de lados: ");
		   lados = s.nextFloat();
		   
		diagonais = lados *(lados -3)/2;	
		
		System.out.print("Numeros de Diagonais: " +diagonais);
	
	}

}
