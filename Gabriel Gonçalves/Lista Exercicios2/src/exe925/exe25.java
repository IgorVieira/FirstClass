package exe925;

import javax.swing.JOptionPane;

public class exe25 {

	public static void main(String[] args) {
		float h1;
		float h2;
		float c;
		float r;
	
	h1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor das horas extras: "));
	h2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor de horas faltadas: : "));
	
		c = (float) (h1-(0.66*h2));
		
		if(c >2.400){ r = 500;
		JOptionPane.showMessageDialog(null, "Sua gratificação é: "+r+ " R$");
			   }	
		
		if(c >1.800 && c <=2.400){ r = 400;
		JOptionPane.showMessageDialog(null, "Sua gratificação é: "+r+ " R$");
			   }	
		
		if(c >1.200 && c <=1.800){ r = 300;
		JOptionPane.showMessageDialog(null, "Sua gratificação é: "+r+ " R$");
			   }
		
		if(c >600 && c <=1.200){ r = 200;
		JOptionPane.showMessageDialog(null, "Sua gratificação é: "+r+ " R$");
			   }
		
		else{ r = 100;
		JOptionPane.showMessageDialog(null, "Sua gratificação é: "+r+ " R$");
			   }
	}

}
