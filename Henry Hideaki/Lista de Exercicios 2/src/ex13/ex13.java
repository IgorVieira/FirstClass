package ex13;

import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1;
		float n2;
	 
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o pre�o ."));
		
		if(n1 < 50.00){
			n2 = (float) (n1 +( n1 * 0.05));
			JOptionPane.showMessageDialog(null, "O Pre�o � : " + n2);
			
			 if (n2 < 80.00){
			JOptionPane.showMessageDialog(null, " O pre�o � barato.");
		}
			
		
		}else if (n1 >50.00 && n1< 100.00){
			n2 = (float) (n1 +(n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O  pre�o � : " + n2);	
		
			if (n2 > 80.00 && n2 <= 100.00){
			JOptionPane.showMessageDialog(null, " O pre�o � Normal.");
			}
			
		}else if (n1 > 100.00){
			n2 = (float) (n1 +(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O pre�o � : " + n2);
			
			if (n2 > 120.00 && n2 <= 200.00 ){
				JOptionPane.showMessageDialog(null," O pre�o � caro.");
			
			}if (n2 > 200.00){
				JOptionPane.showMessageDialog(null, "O pre�o � muito caro.");
			}
			
			}
	}
}