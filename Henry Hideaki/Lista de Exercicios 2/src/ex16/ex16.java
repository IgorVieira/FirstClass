package ex16;

import javax.swing.JOptionPane;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o pre�o ."));
		
		if(n1 < 30.00){
			n2 = (float) n1;
			JOptionPane.showMessageDialog(null, "O pre�o � : " + n2);
		
		}else if (n1 >30.00 && n1<= 100.00){
			n2 = (float) (n1 -(n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O pre�o com o desconto � : " + n2);	
		
		}else if (n1 > 100.00 ){
			n2 = (float) (n1 -(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O pre�o com o desconto � : " + n2);
		}
		}
	    }