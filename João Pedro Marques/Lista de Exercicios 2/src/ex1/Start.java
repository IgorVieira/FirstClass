package ex1;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		
		float x, x1, x2, x3, media;
		
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 1:"));
		x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 2:"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 3:"));
		x3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota 4:"));
		
		media = (x + x1 + x2 + x3) /4;
		
		if(media >= 7.0){
			JOptionPane.showMessageDialog(null, "Aprovado!!");
		}else{
			JOptionPane.showMessageDialog(null, "Reprovado!!");
		}
	}
}
