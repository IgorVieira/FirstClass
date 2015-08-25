package ex7;

import javax.swing.JOptionPane;

public class ex7 {
	public static void main(String[] args){
		
		float x;
		float r;
		
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu salário: "));

		r = (float) ((x*0.3)+x); 
		

			if(r<500){
			JOptionPane.showMessageDialog(null,"você possui reajuste salarial, que ficará:"+r);
			}else if(x>500){
				JOptionPane.showMessageDialog(null," você não possui reajuste salarial!!! T.T");
				
}
	}
}
