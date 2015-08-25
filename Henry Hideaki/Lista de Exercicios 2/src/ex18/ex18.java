package ex18;

import javax.swing.JOptionPane;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1;
	
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a sua idade ."));
		
		if(n1 < 18){
			JOptionPane.showMessageDialog(null, "É de menor. ");
		
		}else if (n1 > 18 ){
			JOptionPane.showMessageDialog(null, "É de maior. ");	
		
		}
		}
	    }