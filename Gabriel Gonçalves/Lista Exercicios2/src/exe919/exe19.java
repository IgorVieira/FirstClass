package exe919;

import javax.swing.JOptionPane;

public class exe19 {
	public static void main(String[] args){
		float a;
		float s;
		float r;
		
	s = Float.parseFloat(JOptionPane.showInputDialog(null, "1 - Homem"
													 +"\n2 - Mulher "));
	a = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua altura: "));
	
	
	if(s == 1){ r = (float) ((72.7*a)-58); 
		JOptionPane.showMessageDialog(null, "Seu peso Ideal é: " +r);
	}
	
	if(s == 2){ r = (float) (( 62.1*a)-44.7);
		JOptionPane.showMessageDialog(null, "Seu peso Ideal é: " +r);
	}
	else if(s >2){
		JOptionPane.showMessageDialog(null, "Escolha somente a Opção 1 e 2");
	}
	
	
	
	
	}
}
