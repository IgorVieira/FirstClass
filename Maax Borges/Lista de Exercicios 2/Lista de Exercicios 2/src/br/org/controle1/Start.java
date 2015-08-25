package br.org.controle1;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {

		float nota1;
		float nota2;
		float media;
		
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
		
		media = (nota1 + nota2)/2;
		
		if(media >= 0 && media < 4.0){
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}else if (media >=4 && media < 7.0){
			JOptionPane.showMessageDialog(null, "Exame!");	
			}else{ 
				JOptionPane.showMessageDialog(null, "Aprovado!");
			}

	}

}
