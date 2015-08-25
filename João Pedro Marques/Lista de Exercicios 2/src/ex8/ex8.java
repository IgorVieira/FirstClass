package ex8;

import javax.swing.JOptionPane;

public class ex8 {
	public static void main(String[] args){
		
		float x;
		float r;
		
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu salário: "));
		
		r = (float) ((x*0.35)+x);
		r = (float) ((x*0.15)+x);
		
		if(x<=300){
			JOptionPane.showMessageDialog(null,"seu reajuste salarial de 35% será: "+r);
		}else if(x>300){
			JOptionPane.showMessageDialog(null,"seu reajuste salarial de 15% será: "+r);
		}
	}
}
