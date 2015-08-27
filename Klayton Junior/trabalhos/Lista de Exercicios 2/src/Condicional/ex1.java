package Condicional;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args){
		
		float x1;
		float x2;
		float x3;
		float x4;
		
		float media;
		
		x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota1:"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota2:"));
		x3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota3:"));
		x4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota4:"));
		
		media = (x1+x2+x3+x4)/4;
		
		if(media >= 7.0){
			JOptionPane.showMessageDialog(null, "Aprovado. Nota: "+media);
		}else{
			JOptionPane.showMessageDialog(null, "Reprovado. Nota: "+media);
		}
		
	}
	
	
	
	
}
