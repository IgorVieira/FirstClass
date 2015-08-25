package ex15;

import javax.swing.JOptionPane;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1;
		float n2;
	    float n3;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a opção : \n 1 - Poupança \n 2 - Fundos de renda fixa"));
		
		if(n1 == 1){
			n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade."));
			n3 = (float) (n2 -(n2 * 0.03));
			JOptionPane.showMessageDialog(null, "O valor corrigido é : " + n3);
		
		}else if (n1 == 2){
			n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade."));
			n3 = (float) (n2 -(n2 * 0.04));
			JOptionPane.showMessageDialog(null, "O valor corrigido é : " + n3);	
		}
		}
	    }