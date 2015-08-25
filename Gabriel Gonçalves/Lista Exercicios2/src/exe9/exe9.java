package exe9;

import javax.swing.JOptionPane;

public class exe9 {

	public static void main(String[] args) {
		float s;
		float r;

	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o saldo medio: "));
	
	if(s >400){ r = (float) ((s*0.30));
	JOptionPane.showMessageDialog(null, "O saldo medio: " +s+ " O valor do credito é: "+r);
		   }	
	
	if(s >300 && s <=400){ r = (float) ((s*0.25));
	JOptionPane.showMessageDialog(null, "O saldo medio: " +s+ " O valor do credito é: "+r);
		   }	
	
	if(s >200 && s <=300){ r = (float) ((s*0.20));
	JOptionPane.showMessageDialog(null, "O saldo medio: " +s+ " O valor do credito é: "+r);
		   }
	
	if(s <=200){ r = (float) ((s*0.10));
	JOptionPane.showMessageDialog(null, "O saldo medio: " +s+ " O valor do credito é: "+r);
		   }
	
	

	}

}
