package exe915;

import javax.swing.JOptionPane;

public class exe15 {

	public static void main(String[] args) {
			int t;
			int r ;
			
	t = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Pouança"
															+ "\n2 - Fundos de renda fixa"));
	r = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor do investimento: "));
	
	if(r == 1){ r = (int) ((0.03*r)+r);
		JOptionPane.showMessageDialog(null, "Valor Corrigido em Poupança: " +r);
	}
	else{ r = (int) ((0.04*r)+r);
		JOptionPane.showMessageDialog(null, "Valor corrigido com Fundos de renda fixa: " +r);
	}
	
	}
	

}
