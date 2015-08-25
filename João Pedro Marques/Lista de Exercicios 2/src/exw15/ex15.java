package exw15;

import javax.swing.JOptionPane;

public class ex15 {
	public static void main(String[] args){
		float n1;
		float r1;
		float r2;
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "escolha o tipo de investimento:"
				+ "\n 1 - Poupança"
				+ "\n 2 - Fundos de renda fixa"));
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o quanto quer investir: "));
		
		r1 = (float) ((n1*0.03)+n1);
		r2 = (float) ((n1*0.04)+n1);
		
		if(x==1){
			JOptionPane.showMessageDialog(null, "O valor corrigido para poupança é de: "+r1);
		}else if(x==2){
			JOptionPane.showMessageDialog(null, "O valor corrigido para fundos de renda fixa é de: "+r2);
		}
		
			
	}

}
