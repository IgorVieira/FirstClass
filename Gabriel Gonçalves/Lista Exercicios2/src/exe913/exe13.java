package exe913;

import javax.swing.JOptionPane;

public class exe13 {

	public static void main(String[] args) {
		float s;
		float r;

	s = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do produto: "));
	
	if(s <=50){ r = (float) ((s*0.05)+s);
	JOptionPane.showMessageDialog(null, "O preço do produto reajustado é: " +r);
		   }	
	
	if(s >50 && s <=100){ r = (float) ((s*0.10)+s);
	JOptionPane.showMessageDialog(null, "O preço do produto reajustado é: " +r);
	   }	
	
	if(s >100){ r = (float) ((s*0.15)+s);
	JOptionPane.showMessageDialog(null, "O preço do produto reajustado é: " +r);
	   }
	
	if(s <=80){ 
	JOptionPane.showMessageDialog(null, "Barato");
	   }
	
	if(s >80 && s<=120){ 
	JOptionPane.showMessageDialog(null, "Normal");
	   }

	if(s >120 && s<=200){ 
		JOptionPane.showMessageDialog(null, "Caro");
		   }

	if(s >200){ 
		JOptionPane.showMessageDialog(null, "Muito Caro");
		   }
	
	
	}

}
