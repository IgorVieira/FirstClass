package Condicional;

import javax.swing.JOptionPane;

public class ex2 {

public static void main(String[]args){
	
	float x1;
	float x2;
	float media;
	
	x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a nota 1:"));
	x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a nota 2:"));
	
	media = (x1+x2)/2;
	
	if(media >=0 && media < 4.0){
		JOptionPane.showMessageDialog(null,"Reprovado");
	}else if(media >=4 && media <7.0){
		JOptionPane.showMessageDialog(null,"Exame");
	}else{
		JOptionPane.showMessageDialog(null, "Aprovado");
		
	}
	
}
	
}
