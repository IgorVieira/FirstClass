package ex7;

import javax.swing.JOptionPane;

public class ex7 {
	public static void main(String[] args){
		
		float x;
		float r;
		
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu sal�rio: "));

		r = (float) ((x*0.3)+x); 
		

			if(r<500){
			JOptionPane.showMessageDialog(null,"voc� possui reajuste salarial, que ficar�:"+r);
			}else if(x>500){
				JOptionPane.showMessageDialog(null," voc� n�o possui reajuste salarial!!! T.T");
				
}
	}
}
